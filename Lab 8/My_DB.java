/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.List;
import java.util.*;
import java.io.*;
import java.util.StringTokenizer;
/**
 *
 * @author Farwa
 */
public class My_DB 
{
     static List<Medicine> list_of_med; // = new ArrayList();
    static int count_of_med;
    
    boolean read_file(String fileName) throws IOException 
    {
        list_of_med = new ArrayList();
        boolean flag = true;
        FileReader fr=null; 
        int ch; 
        try
        { 
            fr = new FileReader(fileName); 
        } 
        catch (FileNotFoundException fe) 
        { 
            System.out.println("File not found"); 
            return false;
        } 
        char []cbuf = new char[100];
        count_of_med=(fr.read()-48);
       
        while ((ch=fr.read(cbuf))!=-1) 
        { 
                StringTokenizer st1 = new StringTokenizer(String.valueOf(cbuf));
               
                for(int i=0;i<count_of_med;i++)
                {
                    int id=Integer.valueOf(st1.nextToken());
                    System.out.println(id); 
                    String name=st1.nextToken();
                    System.out.println(name); 
                    Float price=Float.valueOf(st1.nextToken());
                    System.out.println(price); 
                    int quantity=Integer.valueOf(st1.nextToken());
                    System.out.println(quantity+"\n"); 
                    Medicine m=new Medicine(id,name,price,quantity);
                    
                    list_of_med.add(m);
                }
        }
        
        fr.close(); 
        return flag;
    }

    boolean Comit_Data() throws IOException 
    {
        boolean flag = true;
        String str = "\nI have updated \n the file";
  
        FileWriter fw=new FileWriter("med_DB.txt"); 
  
        for (int i = 0; i < str.length(); i++) 
            fw.write(str.charAt(i)); 
  
        fw.close();    
        return flag;
    }
     static boolean Add_medicine(Medicine m) throws IOException 
    {
        boolean flag = true;
        FileWriter fw=new FileWriter("hdhd.txt",true); 

            String str = m.getId()+" "+m.getMedName()+" "+m.getMedPrice()+" "+m.getMedQuantity();
            
            for (int j = 0; j < str.length(); j++) 
                fw.write(str.charAt(j)); 

        fw.close();    
        return flag;
    }
    static boolean Delete_medicine(Medicine m) throws IOException 
    {
        boolean flag = true;
        list_of_med.remove(m);
        return flag;
    }
    static boolean decreace_medicine_quan (String name) throws IOException 
    {
        boolean flag = true;
                    for(int i=0;i<count_of_med;i++)
            {
                 if(list_of_med.get(i).medName==name)
                 {
                            list_of_med.get(i).medQuantity--;
                 };
            }
        return flag;
    }
        static boolean decreace_medicine_price (String name) throws IOException 
    {
        boolean flag = true;
                    for(int i=0;i<count_of_med;i++)
            {
                 if(list_of_med.get(i).medName==name)
                 {
                            list_of_med.get(i).medPrice--;
                 };
            }
        return flag;
    }
        List<Medicine> getMedicine()
        {
            return list_of_med;
        }
    public static void main(String args[]) throws IOException
    {
        
            My_DB my = new My_DB();
            my.read_file("med_DB.txt");
            for(int i=0;i<count_of_med;i++)
            {
               System.out.println(list_of_med.get(i).getId()+" "+list_of_med.get(i).getMedName()+" "+list_of_med.get(i).getMedPrice()+" "+list_of_med.get(i).getMedQuantity());
               Add_medicine(list_of_med.get(i));
            }
            //my.Comit_Data();
           // my.read_file("med_DB.txt");

    }

}


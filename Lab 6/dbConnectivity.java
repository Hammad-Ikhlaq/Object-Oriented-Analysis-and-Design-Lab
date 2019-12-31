/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import java.sql.ResultSet;


/**
 *
 * @author Farwa
 */
public class dbConnectivity 
{
    Connection con;
    Statement stmt;
    
    dbConnectivity() //cons
    {
        try
        {
             String s = "jdbc:sqlserver://localhost\\farwabatool:1433;databaseName=lab5";
             con=DriverManager.getConnection(s,"new_user","123");


            stmt = con.createStatement(); 
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void displayAll()
    {
        
        try
        {
            ResultSet rs=stmt.executeQuery("select * from candy");
             while(rs.next())
             {
                 
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
             }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
   // int getPrice(Sting candyName){}
    //int getQuantity(Sting candyName){}
    //void insertCandy(int id, String name, int qun, int price){}
    
}

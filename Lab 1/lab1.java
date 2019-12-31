

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l164281;
import java.util.Random;


public class lab1 {
    
    public static void fsort(int arr[], boolean flag){

        if(flag==true){
         int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        }
        else{
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] < arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        }
}
    public static void main(String arg[]){
        
        int[]array=new int[10];
        
        for (int i = 0; i < 10; i++)
        {
            Random rand=new Random();
            int value=rand.nextInt(50)+1;
            array[i]=value;

        }
                    Random rand=new Random();
            boolean flag=rand.nextBoolean();
        fsort(array, flag);
        for (int i = 0; i < 10; i++)
        {
            System.out.println(array[i]);
        }
    }
    
}

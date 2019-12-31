/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooab.lab;
import java.util.Scanner; 


public class OOABLAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        Scanner userInput = new Scanner(System.in);
      
        
        System.out.print("Enter your name: ");
        String name = userInput.nextLine();
        System.out.println("Your name is: " + name);
       
        System.out.print("Enter your age: ");
        int age = userInput.nextInt();
        System.out.println("Your age + 10 is: " + age + 10);  // Look what is hapening
        
        System.out.print("Enter your age again: ");
        int age1 = userInput.nextInt();
        System.out.println("Your age + 10 is: " + (age1 + 10));  // Look what is hapening
        
        System.out.print("Enter a Boolean: ");
        Boolean b1 = userInput.nextBoolean();          // Enter a number other than true or false
        System.out.println("Your Boolean is: " + b1);  // Look what is hapening
        
        
        //Now Comment the above sections and uncomment the below section 
        // and try below section
        
        
//        Scanner userInput1 = new Scanner(System.in);
//        try
//        {
//            System.out.print("Enter a Boolean: ");
//            Boolean b2 = userInput1.nextBoolean();          // Enter a number other than true or false
//            System.out.println("Your Boolean is: " + b2);  // Look what is hapening
//        }
//        catch(Exception e)
//        {
//            System.out.println(e.getMessage());
//            
//           // userInput1.nextLine();
//        }
//        
//        
//        
//        System.out.print("Enter a character: ");
//        char c = userInput1.next().charAt(0);                   
//        System.out.println("Your character is: " + c);
//        
//        
//       //// If you enter wrong input for boolean then it will be effect charcher input
//       //// beacuse both are using same scanner object
//       //// Uncomment a line in catch section, It clears the buffer and readies the scanner for a new input.
       
    }
    
}

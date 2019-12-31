/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author l164281
 */
public class Bus extends HTV {
    
    int number_Of_seats;
    
     Bus(int number_Of_seats,int Fix_Tax)
    {
        this.number_Of_seats=number_Of_seats;
        super.Fix_Tax=Fix_Tax;
    }
    
   public void  computeTax(){
              if(number_Of_seats>20)
        System.out.println("tax of bus:"+(super.Fix_Tax+(super.Fix_Tax*20)));
        else{
            System.out.println("tax of bus:"+(super.Fix_Tax));
        }
    }
   public void printVehicle(){
        
        System.out.println("Bus");
    }
    
}

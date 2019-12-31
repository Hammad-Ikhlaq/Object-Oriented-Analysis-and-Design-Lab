/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author l164281
 */
public class Truck extends HTV {
    
    int load_capacity;
    
    Truck(int load_capacity,int Fix_Tax)
    {
        this.load_capacity=load_capacity;
        super.Fix_Tax=Fix_Tax;
    }
    @Override
   public void computeTax(){
        
           
        if(load_capacity>1000)
        System.out.println("tax of Truck:"+(super.Fix_Tax+(super.Fix_Tax*20)));
        else{
            System.out.println("tax of Truck:"+(super.Fix_Tax));
        }
    }
   public void printVehicle(){
        
        System.out.println("Truck");
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author l164281
 */
public class Car extends LTV {
    String makers;
    int year_model;
    String name;
    int CC;
    
    Car(String makers, int year_model, String name,int CC,int x,int y,int z){
        this.makers=makers;
        this.year_model=year_model;
        this.name=name;
        this.CC=CC;
        super.x=x;
        super.y=y;
        super.z=z;
        }
    public void  computeTax()
    {
        
        if(CC <= 1000){ 
           System.out.println("Tax of car:"+super.x);
        }
        
        if(1000 < CC&&CC <= 2000) {
           System.out.println("Tax of car:"+super.y);
        }  
          
        if(CC > 2000){
           System.out.println("Tax of car:"+super.z);
        } 
    }
    public void printVehicle(){
        
        System.out.println("Car");
    }
    
}

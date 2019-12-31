/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author l164281
 */
public class Bike extends LTV {
    String makers;
    int year_model;
    int CC;
    
    Bike(String makers, int year_model,int CC,int x,int y,int z){
        this.makers=makers;
        this.year_model=year_model;
        this.CC=CC;
        super.x=x;
        super.y=y;
        super.z=z;
        }
   public void  computeTax(){
        
        if(CC <= 75){ 
           System.out.println("Tax of bike:"+super.x);
        }
        
        else if(75 < CC&&CC <= 250) {
           System.out.println("Tax of bike:"+super.y);
        }  
          
        else if(CC > 250){
           System.out.println("Tax of bike:"+super.z);
        } 
    }
   public void printVehicle(){
        
        System.out.println("Bike");
    }
}

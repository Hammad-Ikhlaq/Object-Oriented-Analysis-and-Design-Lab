/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Farwa
 */
public class driver 
{
     public static void main(String args[])  
    {         
//        ContractEmployee E1 = new ContractEmployee("1","Fakhar",6,"TA",50000,"1-1-16","1-1-19");
//        PermanentEmployee E2= new PermanentEmployee("2","Hammad",1,"Adviser",100000,"1-1-08","1-1-20");
//        E1.EmployeeDetails();
//        E1.Salary();
//        E2.EmployeeDetails();
//        E2.Salary();
        	//Last there parameters are x,y,z for LTV class

	Car c1 = new Car("Honda" , 2012, "City" , 1500, 1000,1500,2000);
	Car c2 = new Car("Mercedes" , 2016 ,  "Kompressor", 22000 , 1000,1500,2000);
	Car c3 = new Car("Suzuki" , 2016 , "Wagon_r", 8000, 1000,1500,2000);

	Bike b1 = new Bike("Honda" , 2012, 100,   50,200,300);
	Bike b2 = new Bike("Uniqe" , 2016 , 70,     50,200,300);
	Bike b3 = new Bike("Suzuki" , 2016 , 125,  50,200,300);

	//second parameter is Fix tax for HTV class

	Truck t1 = new Truck (1500 , 5000);
	Truck t2 = new Truck (1500 , 5000 );
	Truck t3 = new Truck (800 , 5000);

	Bus bb1 = new Bus (100, 5000);
	Bus bb2 = new Bus (70, 5000);
	Bus bb3 = new Bus (125, 5000);
        
        c1.computeTax();
        c1.printVehicle();
        c2.computeTax();
        c2.printVehicle();
        c3.computeTax();
        c3.printVehicle();
        b1.computeTax();
        b1.printVehicle();
        b2.computeTax();
        b2.printVehicle();
        b3.computeTax();
        b3.printVehicle();
        t1.computeTax();
        t1.printVehicle();
        t2.computeTax();
        t2.printVehicle();
        t3.computeTax();
        t3.printVehicle();
        bb1.computeTax();
        bb1.printVehicle();
        bb2.computeTax();
        bb2.printVehicle();
        bb3.computeTax();
        bb3.printVehicle();

        Vehicle v1,v2,v3,v4;
        v1 =b1;
        v1.printVehicle();
        v1.computeTax();
                v2 =c2;
        v2.printVehicle();
        v2.computeTax();
                v3 =bb3;
        v3.printVehicle();
        v3.computeTax();
                v4 =t2;
        v4.printVehicle();
        v4.computeTax();
    } 
    
}

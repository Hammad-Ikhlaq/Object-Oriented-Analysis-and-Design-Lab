/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author l164281
 */
public class Employee {
     String	CNIC;
     String	Name;
     int 	Employee_Grade;
     String	Employee_Designation;
     double	Salary_basic;
    
    Employee(String CNIC,String	Name, int Employee_Grade,String	Employee_Designation,double Salary_basic)
    {
        this.CNIC=CNIC;
        this.Name=Name;
        this.Employee_Grade=Employee_Grade;
        this.Employee_Designation=Employee_Designation;
        this.Salary_basic=Salary_basic;
    }

     
    void EmployeeDetails()
    {
        System.out.println("Name:"+Name+"\nCNIC:"+CNIC+"\nEmployee_Grade:"+Employee_Grade+"\nEmployee_Designation:"+Employee_Designation);
    }

    void Salary()
    {
        System.out.println("Salary_basic:"+Salary_basic);
    }
}

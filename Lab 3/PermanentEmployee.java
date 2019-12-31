/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author l164281
 */
public class PermanentEmployee extends Employee {
    
    private String	Date_of_joining;
    private String	Date_of_resign; 

    PermanentEmployee(String CNIC,String Name, int Employee_Grade,String Employee_Designation,double Salary_basic, String Date_of_joining,String Date_of_resign)
    {
        super(CNIC, Name, Employee_Grade, Employee_Designation, Salary_basic);
        this.Date_of_joining=Date_of_joining;
        this.Date_of_resign=Date_of_resign;
    }
    
    @Override
    void EmployeeDetails() 
    {
        super.EmployeeDetails();
        System.out.println("Date_of_joining:"+Date_of_joining);
        System.out.println("Date_of_resign:"+Date_of_resign);
    }
    @Override
    void Salary()
    {
        super.Salary();
    }
}

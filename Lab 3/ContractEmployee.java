/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author l164281
 */
public class ContractEmployee extends Employee {
    
    private String	Contract_Signed;
    private String      Expired_Date;
    
    ContractEmployee(String CNIC,String	Name, int Employee_Grade,String	Employee_Designation,double Salary_basic, String Contract_Signed,String Expired_Date)
    {
        super(CNIC, Name, Employee_Grade, Employee_Designation, Salary_basic);
        this.Contract_Signed=Contract_Signed;
        this.Expired_Date=Expired_Date;
    }
    
    @Override
    void EmployeeDetails() 
    {
        super.EmployeeDetails();
        System.out.println("Contract_Signed:"+Contract_Signed);
        System.out.println("Expired_Date:"+Expired_Date);
    }

    @Override
    void Salary()
    {
        System.out.println("Salary:"+(super.Salary_basic-(super.Salary_basic*0.17)));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9_Q1;

/**
 *
 * @author l164281
 */
public class Student 
{
    String Firstname;
    String LastName;
    int	Session;
    String RollNumber;
    String Branch;
    int	Year;
    int	Semester;
    String Date_of_birth;
    String Address;

    public Student(String Firstname, String LastName, int Session, String RollNumber, String Branch, int Year, int Semester, String Date_of_birth, String Address) {
        this.Firstname = Firstname;
        this.LastName = LastName;
        this.Session = Session;
        this.RollNumber = RollNumber;
        this.Branch = Branch;
        this.Year = Year;
        this.Semester = Semester;
        this.Date_of_birth = Date_of_birth;
        this.Address = Address;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setSession(int Session) {
        this.Session = Session;
    }

    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public void setSemester(int Semester) {
        this.Semester = Semester;
    }

    public void setDate_of_birth(String Date_of_birth) {
        this.Date_of_birth = Date_of_birth;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

}

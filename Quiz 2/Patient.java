/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package l164281;

/**
 *
 * @author l164281
 */
public class Patient {
    
    String CNIC;
    String Name;
    String Gender;
    String Ward;
    int Age;

    public Patient(String CNIC, String Name, String Gender, String Ward, int Age) {
        this.CNIC = CNIC;
        this.Name = Name;
        this.Gender = Gender;
        this.Ward = Ward;
        this.Age = Age;
    }
}

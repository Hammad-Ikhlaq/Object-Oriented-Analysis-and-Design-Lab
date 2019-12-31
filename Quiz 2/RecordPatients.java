/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package l164281;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author l164281
 */
public class RecordPatients {
    ArrayList<Patient> Patients;
    
    Boolean Add_Patient(Patient m)
    {
        if(Patients.add(m))
        {
            return true;
        }
        return false;
    }
    Boolean Delete_Patient(String CNIC)
    {
        for(int i=0;i<Patients.size();i++)
        {
            if(Patients.get(i).CNIC.equals(CNIC))
            {
                Patients.remove(i);
                return true;
            }
        }
       return false;
    }
    Boolean Search_Patient(String CNIC)
    {
        for(int i=0;i<Patients.size();i++)
        {
            if(Patients.get(i).CNIC.equals(CNIC))
            {
                return true;
            }
        }
       return false;
    }
}

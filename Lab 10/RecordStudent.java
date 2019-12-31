/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9_Q1;

import java.util.List;


/**
 *
 * @author l164281
 */
public class RecordStudent 
{
       List<Student> students;
       int count_of_Students;

    public RecordStudent(List<Student> students, int count_of_Students) {
        this.students = students;
        this.count_of_Students = count_of_Students;
    }
	//This function will take student object and add them to the list.
	//Returns true in case of success.
    Boolean Add_Student (Student m) 
    {
        if(m==null)
            return false;
        
        students.add(m);
        count_of_Students++;
        return true;
    }

    //This function will take student rollnumber and search for it in the list and delete the record in case of record found and return true.
    Boolean Delete_Student (String Rollnumber)
    {
        for(int i=0;i<count_of_Students;i++)
        {
            if(students.get(i).RollNumber.equals(Rollnumber))
            {
                    students.remove(i);
                    count_of_Students--;
                    return true;
            }
        }
        return false;
    }

    //This function will take student rollnumber and search for it in the list and if found returns true.
    Boolean Search (String Rollnumber)
    {
            for(int i=0;i<count_of_Students;i++)
        {
            if(students.get(i).RollNumber.equals(Rollnumber))
            {
                    return true;
            }
        }
        return false;
    }
    Boolean Update_Student (String Firstname, String LastName, int Session, String RollNumber, String Branch, int Year, int Semester, String Date_of_birth, String Address)
    {
        for(int i=0;i<count_of_Students;i++)
        {
            if(students.get(i).RollNumber.equals(RollNumber))
            {
                    students.get(i).Address=Address;
                    students.get(i).Firstname=Firstname;
                    students.get(i).LastName=LastName;
                    students.get(i).Session=Session;
                    students.get(i).RollNumber=RollNumber;
                    students.get(i).Branch=Branch;
                    students.get(i).Year=Year;
                    students.get(i).Semester=Semester;
                    students.get(i).Date_of_birth=Date_of_birth;
                    return true;
            }
        }
        return false;
    }
}

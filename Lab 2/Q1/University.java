/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agregation;
import java.io.*; 
import java.util.*; 
/**
 *
 * @author Farwa
 */
public class University
{
    String instituteName; 
    private List<Department> departments; 
      
    University(String uniName, List<Department> departments) 
    { 
        this.instituteName = uniName; 
        this.departments = departments; 
    } 
      
    // count total students of all departments 
    // in a given institute  
    public int getTotalStudentsInInstitute() 
    { 
        int noOfStudents = 0; 
        List<Student> students;  
        for(Department dept : departments) 
        { 
            students = dept.getStudents(); 
            for(Student s : students) 
            { 
                noOfStudents++; 
            } 
        } 
        return noOfStudents; 
    } 
}

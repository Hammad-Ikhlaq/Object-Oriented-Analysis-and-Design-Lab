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
public class Department 
{
    String name; 
    private List<Student> students; 
    Department(String name, List<Student> students)  
    { 
          
        this.name = name; 
        this.students = students; 
          
    } 
      
    public List<Student> getStudents()  
    { 
        return students; 
    } 
}

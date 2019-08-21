/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegesystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mohamed Abd El-Naby
 *  this class is responsible for keeping the 
 * track of department name ,description ,max number of student ,courses ,students
 * and courses
 
 */
public class Department {
    public String name ; 
    public String description ; 
    public int max_number_of_students ; 
    public  List<Course> courses  = new ArrayList<Course>() ; 
    public  List<Student> students = new ArrayList<Student>() ;
    /**
     * 
     * @param name this name of department
     * @param description this description of department.
     * @param max_number_of_students  set the max number of student in department.
     */
    public Department(String name, String description, int max_number_of_students) {
        this.name = name;
        this.description = description;
        this.max_number_of_students = max_number_of_students;
    }
    /**
     * 
     * @param courses set courses in department. 
     */
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    /**
     * 
     * @param students add student in department. 
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /**
     * 
     * @return name of department. 
     */
    public String getName() {
        return name;
    }
    /**
     * 
     * @return description of department. 
     */
    public String getDescription() {
        return description;
    }
    /*    * 
     * @return max number of student in department. 
     */

    public int getMax_number_of_students() {
        return max_number_of_students;
    }
    /**
     * 
     * @return list of courses in department 
     */
    public List<Course> getCourses() {
        return courses;
    }
    /**
     * 
     * @return student in department.  
     */
    public List<Student> getStudents() {
        return students;
    }
    /**
     * 
     * @param s pass student to method.
     * @return true if not full , false if full
     */
     boolean enroll(Student s) {
         if (students.size() <  max_number_of_students ){
             students.add(s) ;
             return  true ; 
         }
         else 
            return false;
     }
     /**
      * 
      * @return false if not full.
      * 		true if full
      */
     boolean isFull(){
        if(max_number_of_students > students.size()){
            return false ;
         }else 
            return true ; 
     
     }
}

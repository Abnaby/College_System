/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegesystem;

import java.util.ArrayList;
import java.util.List;


/**
 *@author Mohamed Abd El-Naby
 * this class is responsible for keeping the 
 * track of student name ,age ,telephone ,address ,department
 * and courses
 * 
 */
public class Student {
    private String firstName="" ; 
    private String lastName="" ; 
    private String telephone ; 
    private String address ; 
    private String department ; 
    private int age ; 
    private List<Course> courses = new ArrayList<Course>() ;
    /**
     * 
     * @param firstName firstName of new student. 
     * @param lastName lastName of new student 
     * @param telephone tele of new student.
     * @param address   address of new student.
     * @param age      age of new student .
     */
    public Student(String firstName,String lastName,String telephone,String address,int age) {
        this.firstName = firstName ; 
        this.lastName = lastName ; 
        this.address = address ; 
        this.age = age ; 
        this.telephone = telephone;
        department = null ;
    }

    /**
     * 
     * @param department get update department of student.
     */

    public void setDepartment(String department) {
        this.department = department;
    }
    /**
     * 
     * @param courses set courses the student want to study. 
     */
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    public void enrollCourses(Course s) {
        courses.add(s);
    }
    /**
     * 
     * @return first name of student. 
     */

    public String getFirstName() {
        return firstName;
    }
    /**
     * 
     * @return last name of student. 
     */

    public String getLastName() {
        return lastName;
    }
    /**
     * 
     * @return full name of student. 
     */

    public String getFullName() {
        return firstName+lastName;
    }
    /**
     * 
     * @return tele number of student. 
     */

    public String getTelephone() {
        return telephone;
    }
    /**
     * 
     * @return address of student 
     */

    public String getAddress() {
        return address;
    }   
    /**
     * 
     * @return department of student. 
     */

    public String getDepartment() {
        return department;
    }
    /**
     * 
     * @return age of student. 
     */

    public int getAge() {
        return age;
    }
    /**
     * 
     * @return courses 
     */
    public List<Course> getCourses( ) {
        return courses ;
    }

    /**
     * 
     * @param firstName get first name of student
     * @param lastName  get last name of student.
     * @return concatenation of first name and last name (get full name of student) 
     */
    String fullName(String firstName, String lastName) {
        this.firstName =firstName ;
        this.lastName = lastName;
        return firstName +firstName ;
    }
   
}

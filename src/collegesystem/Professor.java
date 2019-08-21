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
 */
public class Professor {
    private String firstName ; 
    private String lastName ; 
    private String telephone ; 
    private String address ;  
    private double salary ; 
    private List<Course> courses = new ArrayList<Course>() ;
    /**
     * 
     * @param firstName of proff.
     * @param lastName  of proff.
     * @param telephone of proff.
     * @param address of proff.
     * @param salary  of proff.
     */

    public Professor(String firstName, String lastName, String telephone, String address, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        this.address = address;
        this.salary = salary;
    }

    /**
     * 
     * @param salary update salary after rasing. 
     */
    public void updateSalary(double salary) {
        this.salary = salary;
    }

    /**
     * 
     * @param courses set courses of proff.  
     */
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }   
    public void enrollCourses(Course s) {
       courses.add(s);
    }   
    /**
     * 
     * @return firstName of proff. 
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * 
     * @return last name of proff 
     */

    public String getLastName() {
        return lastName;
    }
    /**
     * 
     * @return telephone of proff.
     */
    
    public String getTelephone() {
        return telephone;
    }
    /**
     * 
     * @return address of proff. 
     */
    public String getAddress() {
        return address;
    }
    /**
     * 
     * @return salary of proff.
     */

    public double getSalary() {
        return salary;
    }
    /**
     * 
     * @return return array of course proff tech. 
     */

    public List<Course> getCourses() {
        return courses;
    }
    /**
     * 
     * @return full name of professor.  
     */
    String getFullName() {
        return firstName+lastName ;
    }
    /**
     * 
     * @param ratio this ration for in/decrease salary.
     * @return final salary after ratio.
     */
    double getRaise(double ratio) {
        ratio = salary * ratio ; 
        return salary+ratio ; 
    }

}

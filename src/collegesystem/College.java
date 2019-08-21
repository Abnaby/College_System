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
public class College {
   private List<Department> depart  = new ArrayList<Department>()  ;
   private List<Course> cours  = new ArrayList<Course>() ;
   private List<Professor> prof  = new ArrayList<Professor>() ; 
   private List<Student> student  = new ArrayList<Student>();   
   /**
    * 
    * @return List of department on college
    */
    public List<Department> getDepart() {
        return depart;
    }
    /**
     * 
     * @param depart set list of department in college
     */

    public void setDepart(List<Department> depart) {
        this.depart = depart;
    }
    /**
     * 
     * @return List Of courses in college. .
     */

    public List<Course> getCours() {
    	return cours;
    }
    /**
     * 
     * @param cours set courses in college.
     */

    public void setCours(List<Course> cours) {
        this.cours = cours;
    }
    /**
     * 
     * @return List of professors in college.
     */

    public List<Professor> getProf() {
        return prof;
    }
    /**
     * 
     * @param prof set professors work in college .
     */

    public void setProf(List<Professor> prof) {
        this.prof = prof;
    }
    /**
     * 
     * @return List of student in college.
     */

    public List<Student> getStudent() {
        return student;
    }
    /**
     * 
     * @param student set list of student in college.
     */

    public void setStudent(List<Student> student) {
        this.student = student;
    }
   /**
    * 
    * @return number Of Departments in college.
    */
   int numberOfDepartments() {
    return depart.size() ; 
    }
   /**
    * 
    * @return number Of Courses in college.
    */
    int numberOfCourses()
    {
        return cours.size() ; 
    }
}
        
  
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
public class Course {
    private String name ; 
    private String description ; 
    private String professor ; 
    private String department ; 
    private int max_number_of_students ; 
    private int number_of_lectures ; 
    private List<Student> student = new ArrayList<Student>()  ;   
    /**
     * 
     * @param name set name of course. 
     * @param description set description of course. 
     * @param department set department has this course.
     * @param max_number_of_students 
     * @param number_of_lectures
     */
    public Course(String name, String description, String department, int max_number_of_students, int number_of_lectures) {
        this.name = name;
        this.description = description;
        this.department = department;
        this.max_number_of_students = max_number_of_students;
        this.number_of_lectures = number_of_lectures;
    }
    /**
     * 
     * @param student set students in course
     */

    public void setStudent(List<Student> student) {
        this.student = student;
    }
    /**
     * 
     * @param professor set professor teaching this course.
     */

    public void setProfessor(String professor) {
        this.professor = professor;
    }
    /**
     * 
     * @return name of course.
     */
    
    public String getName() {
        return name;
    }

    /**
     * 
     * @return Description of course.
     */
    public String getDescription() {
        return description;
    }
    /**
     * 
     * @return name of professor.
     */

    public String getProfessor() {
        return professor;
    }
    /**
     * 
     * @return name of department has this course.
     */

    public String getDepartment() {
        return department;
    }

    /**
     * 
     * @return max num. of student in course.
     */
    public int getMax_number_of_students() {
        return max_number_of_students;
    }
    /**
     * 
     * @return get num. of lectures .
     */

    public int getNumber_of_lectures() {
        return number_of_lectures;
    }
    /**
     * 
     * @return list of student in course.
     */

    public List<Student> getStudent() {
        return student;
    }
    /**
     * 
     * @param s pass student 
     * @return true if not full. 
     * @return false if full.
     */

    
   boolean enroll(Student s) {
         if (student.size() <  max_number_of_students ){
             student.add(s) ;
             return  true ; 
         }
         else 
            return false;
     }
    
   /**
    * 
    * @param p pass professor. 
    * @return true if not exist professor.
    * @return false if exist professor
    */
  boolean assignProfessor(Professor p){
      if(professor.equalsIgnoreCase(null)){
          this.professor=p.getFullName();
          return true ;} 
      else 
          return false ;
  }
  /**
   * 
   * @param p pass professor.
   * unassign professor from course.
   */
    void unassignProfessor(Professor p) {
     professor = null ; 
    }
   /**
     * @return course full or not
     */
    boolean isFull(){
        if(max_number_of_students == student.size()){
            return true ;
         }else 
            return false ; 
     }
    }
    
 
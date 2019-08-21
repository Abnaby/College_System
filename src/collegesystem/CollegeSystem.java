 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegesystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Mohamed Abd El-Naby
 */
public class CollegeSystem {
    
    public static void printOptions() {
        System.out.println("Welcome to our university!");
        System.out.println("Operations:");
        System.out.println("1- College");System.out.println("a) Number of Departments");System.out.println("b) Number of Courses");System.out.println("c) Number of Professors");System.out.println("d) Number of Students");System.out.println("e) Report");
        System.out.println("2- Department");System.out.println("a) New");System.out.println("b) Number of Courses");System.out.println("c) Number of Students");System.out.println("d) Is Full");System.out.println("e) Enroll");System.out.println("f) Report");
        System.out.println("3- Course");System.out.println("a) New");System.out.println("b) Number of Students");System.out.println("c) Assign");System.out.println("d) Is assigned");System.out.println("e) Professor Name");System.out.println("f) Is Full");System.out.println("g) Enroll");System.out.println("h) Report");
        System.out.println("4- Professor");System.out.println("a) New");System.out.println("b) Display Salary");System.out.println("c) Get Raise");System.out.println("d) Report");
        System.out.println("5- Student");System.out.println("a) New");System.out.println("b) Report");
        System.out.println("6- Quit");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        
    	printOptions() ;
        List<Department> departmentList;departmentList = new ArrayList<>();
      	List<Course> courseList ;courseList = new ArrayList<>();
      	List<Professor> proffList = new ArrayList<>() ;
      	List<Student> studentList;studentList = new ArrayList<>() ;
      	/*
      	 * create object from Scanner class.
      	 */
        Scanner in = new Scanner(System.in) ;
        /*
         * counters 
         * d for department.
         * c for courses.
         * p for professors.
         * s for students.
         */
        int d = 0 , c = 0  , p = 0 , s=0 ; 
        /*
         * AinShams : new object from College.
         * all program has one object from college.
         */
        College AinShams = new College() ; 
        while (true){   
            String option = in.nextLine() ;
            /*
             * "6" is an option to exit from program.
             */
            if(!"6".equals(option)) {
                /*
                 * "1a" ==> to print number Of Departments.
                 */  
                if ("1a".equalsIgnoreCase(option)) {
                    System.out.println(AinShams.numberOfDepartments());
                }
                /*
                 * "1b" ==> to print number Of Courses.
                */
               else if ("1b".equalsIgnoreCase(option)) {
	                   System.out.println(AinShams.numberOfCourses());        
	               }
                /*
	             *  "1c" Number of professor in college.
	             */
	            else if ("1c".equalsIgnoreCase(option)) {
	            		System.out.println("Number of professors:"+AinShams.getProf().size());
	            }
                /*
	             * "1d" number of student in college 
	             */
	            else if ("1d".equalsIgnoreCase(option)) {
	            	System.out.println("Number of student:"+AinShams.getStudent().size());
	            }
                /**
                 * "1e" print report about college.
                 */
                 else if ("1e".equalsIgnoreCase(option)){
                     System.out.println(AinShams.getProf().size()+" Professors");
                     System.out.println(AinShams.getStudent().size()+" Student");
                     System.out.println(AinShams.getDepart().size()+" Department");
                     System.out.println(AinShams.getCours().size()+" Courses");
                 }
                /*
            	 * 2a ==> to define new department.
            	 */
                else if ("2a".equalsIgnoreCase(option)) {
                    System.out.println("Department Name:");
                    String depName ="" ;
                    depName= in.nextLine() ; 
                    System.out.println("Department Description:");
                    String depDescripe = in.nextLine() ;
                    System.out.println("Department Max Students:");
                    int max_num = in.nextInt() ;
                    in.nextLine() ; 
                    /*
                     * Department_Name new object from Department class.
                     */
                    Department Department_Name = new Department(depName, depDescripe, max_num); 
                    /*
                     * add department to departmentList
                     * and set it in array list existed in College class.
                     */
                    departmentList.add(d, Department_Name);
                    d++ ;
                    AinShams.setDepart(departmentList);
                }
                /*
                 * "2b" to know Number of courses in department
                 */
                 else if ("2b".equalsIgnoreCase(option)) {
              	   System.out.println("Department:");
                     String dep = in.nextLine();
                      for (int i =0 ;i< AinShams.getDepart().size() ; i++  ){
                          if(dep.equalsIgnoreCase(AinShams.getDepart().get(i).name)){
                              System.out.println("Student:" + AinShams.getDepart().get(i).getCourses().size());
                          }
                      	}
              		}
                /*
                 * "2c" to know student size in department.
                 */
                 else if ("2c".equalsIgnoreCase(option)){
                  System.out.println("Department:");
                  String dep= in.nextLine() ;
                  for (int i =0 ; i< AinShams.getDepart().size() ; i++) {
                      if (dep.equals( AinShams.getDepart().get(i).getName()) ){
                          System.out.println(AinShams.getDepart().get(i).getStudents().size());
                        }
                  	}
                 }
                /*
                 * "2d" know if department full or not
                 */
                 else if ("2d".equalsIgnoreCase(option)){
                     System.out.println("Department:");
                     String dep = in.nextLine();
                      for (int i =0 ;i< AinShams.getDepart().size() ; i++  ){
                          if(dep.equalsIgnoreCase(AinShams.getDepart().get(i).name)){
                              if(AinShams.getDepart().get(i).isFull()){
                                  System.out.println("Status:Full");
                              }else{System.out.println("Status:not full");}
                           }
                    }
                 }
                /*
                 * "2e" to add student in department
                 */
                else if ("2e".equalsIgnoreCase(option)) {
                    System.out.println("Department:");
                    String dep= in.nextLine() ;
                   
                   for (int i =0 ;i< AinShams.getDepart().size() ; i++  ){
                        if (dep.equals( AinShams.getDepart().get(i).getName())){
                        	if(!AinShams.getDepart().get(i).isFull()){
                        		 System.out.println("Student:");
                                 String stu= in.nextLine();   
                        	for (int j=0 ; j< AinShams.getStudent().size() ;j++){
                        		if (stu.equals(AinShams.getStudent().get(j).getFullName())){
                        			/*
                        			 * add student in department.
                        			 * add department to student.
                        			 */
                        			AinShams.getDepart().get(i).enroll(AinShams.getStudent().get(j));
                        			AinShams.getStudent().get(s-1).setDepartment(dep);
                                
                        				}
                        			}
                        		}
                        	else
                                System.out.println("False");
                       
                        	}
               			}
                	}
                /*
                 * "2f" print report about department.
                 */
                 else if ("2f".equalsIgnoreCase(option)){
                     System.out.println("Department:");
                     String dep = in.nextLine();
                      for (int i =0 ;i< AinShams.getDepart().size() ; i++  ){
                          if(dep.equalsIgnoreCase(AinShams.getDepart().get(i).name)){
                              System.out.println("Description:"+ AinShams.getDepart().get(i).description);
                              System.out.println("Max student:" + AinShams.getDepart().get(i).max_number_of_students);
                              System.out.println("Student:" + AinShams.getDepart().get(i).students.size());
                              if(AinShams.getDepart().get(i).isFull()){
                                  System.out.println("Status:Full");
                              }else{System.out.println("Status:not full");}
                              System.out.println("Courses:"+AinShams.getDepart().get(i).getCourses().size());                          
                          }
                     
                    }
                 }
                /*
                 * "3a" to define new course.
                 */
                else if ("3a".equalsIgnoreCase(option)) { 
                   System.out.println("Course Name:");
                   String courseName = in.nextLine() ;
                   System.out.println("Course Description:");
                   String courseDescription = in.nextLine() ;
                   System.out.println("Course Max Students:");
                   int numOfStudent = in.nextInt() ;
                   System.out.println("Course Lectures:");
                   int numOfLec = in.nextInt() ;
                   in.nextLine() ;
                   System.out.println("Department:");
                   String departmentName = in.nextLine() ;
                   /*
                    * course1 : object from Course.
                    */
                   Course Course1 = new Course(courseName, courseDescription , departmentName, numOfStudent, numOfLec); 
                   courseList.add(c,Course1);
                   /*
                    * add course to courseList
                    * and set it in array list existed in College class.
                    */
                   AinShams.getDepart().get(c).setCourses(courseList);
                   c++ ;
                   AinShams.setCours(courseList);
                 }
                
                /*
                  * "3b" number of student in course. 
                  */
                  else if ("3b".equalsIgnoreCase(option)) {
                      System.out.println("Course:");
                      String cours = in.nextLine();
                      for (int i = 0 ; i<AinShams.getCours().size();i++){
                          if(cours.equalsIgnoreCase(AinShams.getCours().get(i).getName())){
                              System.out.println("Students:"+AinShams.getCours().get(i).getStudent().size());
                           }
                      }                	 
                  }
                /*
                 * "3c" assign professor in course.
                 */
                 else if ("3c".equalsIgnoreCase(option)){
                	 System.out.println("course");
                     String cours = in.nextLine();
                     System.out.println("professor");
                     String proff = in.nextLine();
                     for (int i =0 ;i< AinShams.getCours().size(); i++  ){
                      if (cours.equals( AinShams.getCours().get(i).getName())){
                       for (int j=0 ; j< AinShams.getProf().size() ;j++){
                        if (proff.equals(AinShams.getProf().get(j).getFullName())){
                            AinShams.getCours().get(i).setProfessor(proff);
                            AinShams.getProf().get(j).enrollCourses(AinShams.getCours().get(i));
                                }
                            }
                        }
                     }
                 }
                /*
                 * "3f" know if course full or not
                 */
                 else if ("3f".equalsIgnoreCase(option)) {
                     System.out.println("Course:");
                     String cours = in.nextLine();
                     for (int i = 0 ; i<AinShams.getCours().size();i++){
                    	 if(cours.equalsIgnoreCase(AinShams.getCours().get(i).getName()))
                              if(AinShams.getCours().get(i).isFull()){
                                  System.out.println("Status:Full");
                              }else{System.out.println("Status:not full");}  
                         }
                     }
                 
	            /*
	             * "3g" add student to specific course .
	             */
	            
	             else if ("3g".equalsIgnoreCase(option)){
	                 System.out.println("Course");
	                 String cours = in.nextLine() ; 
	                 System.out.println("Student");
	                 String stu = in.nextLine() ; 
	                 for (int i =0 ;i< AinShams.getCours().size() ; i++ ){
	                  if (cours.equals( AinShams.getCours().get(i).getName())){
	                   for (int j=0 ; j< AinShams.getStudent().size() ;j++){
	                    if (stu.equals(AinShams.getStudent().get(j).getFullName())){
	                      AinShams.getCours().get(i).enroll(AinShams.getStudent().get(j));
	                      AinShams.getStudent().get(j).enrollCourses(AinShams.getCours().get(i));                       
	                      
	                            }
	                        }
	                    }
	                 }
	            }
	            /*
	            * print report about course.
	            */
	            else if ("3h".equalsIgnoreCase(option)){
	                System.out.println("Course:");
	                String cours = in.nextLine();
	                for (int i = 0 ; i<AinShams.getCours().size();i++){
	                    if(cours.equalsIgnoreCase(AinShams.getCours().get(i).getName())){
	                        System.out.println("Description:"+AinShams.getCours().get(i).getDescription());
	                        System.out.println("Department:"+AinShams.getCours().get(i).getDepartment());
	                        System.out.println("Lectures:"+AinShams.getCours().get(i).getNumber_of_lectures());
	                        System.out.println("Max Students:"+AinShams.getCours().get(i).getMax_number_of_students());
	                        System.out.println("Students:"+AinShams.getCours().get(i).getStudent().size());
	                         if(AinShams.getCours().get(i).isFull()){
	                             System.out.println("Status:Full");
	                         }else{System.out.println("Status:not full");}  
	                         System.out.println("Professor:" + AinShams.getCours().get(i).getProfessor());
	                    }
	                }
	            }
	            /*
                 * "4a" to define new professor.
                 */
                
                else if ("4a".equalsIgnoreCase(option)) {
                    System.out.println("Professor Firstname:");
                    String firstName = in.nextLine() ;
                    System.out.println("Professor Lastname:");
                    String lastName = in.nextLine(); 
                    System.out.println("Professor telephone:");
                    String telephone = in.nextLine();
                    System.out.println("Professor address:");
                    String address = in.nextLine();
                    System.out.println("Professor salary:");
                    double salary = in.nextDouble() ;
                    in.nextLine();
                    // create new object from Professor.
                    Professor proff = new Professor(firstName, lastName, telephone, address, salary); 
                    /*
                     * add professor to proffList
                     * and add it in array list exist in college system
                     */
                    proffList.add(p,proff) ;
                    p++ ; 
                    AinShams.setProf(proffList);
                   }
	            /*
	             * "4b" display salary of professor.
	             */
	            else if ("4b".equalsIgnoreCase(option)) {
	            	 System.out.println("Professor");
	                 String proff = in.nextLine();
	                 in.nextLine() ;
	                 for(int i = 0 ; i<AinShams.getProf().size();i++){
	                     if (proff.equals(AinShams.getProf().get(i).getFullName())){
	                     System.out.println("Salary:"+ AinShams.getProf().get(i).getSalary());
	                     }
	                }
	            }
	            /*
	             * "4c" raise professor salary.
	             */
	             else if ("4c".equalsIgnoreCase(option)){
	                 System.out.println("Professor");
	                 String proff = in.nextLine();
	                 System.out.println("Raise");
	                 double raise = in.nextDouble();
	                 in.nextLine() ;
	                 for(int i = 0 ; i<AinShams.getProf().size();i++){
	                     if (proff.equals(AinShams.getProf().get(i).getFullName())){
	                     AinShams.getProf().get(i).updateSalary(AinShams.getProf().get(i).getRaise(raise));
	                     System.out.println("Salary:"+ AinShams.getProf().get(i).getSalary());
	                     }
	                 }
	             }
	            /*
	             * print report about professor.
	             */
	             else if ("4d".equalsIgnoreCase(option)){
	                 System.out.println("Professor:");
	                 String prof = in.nextLine();
	                 for (int i = 0 ; i<AinShams.getCours().size();i++){
	                     if(prof.equalsIgnoreCase(AinShams.getProf().get(i).getFullName())){
	                         System.out.println("Salary:"+AinShams.getProf().get(i).getSalary());
	                         System.out.print("Course:");
	                         for(int j = 0 ; j<AinShams.getProf().get(i).getCourses().size();j++){
	                         System.out.println(AinShams.getProf().get(i).getCourses().get(j).getName());
	                         }
	                         System.out.println("Telephone:"+AinShams.getProf().get(i).getTelephone());
	                         System.out.println("Address:"+AinShams.getProf().get(i).getAddress());
	                     }
	                 }
	             }
                /*
                 * "5a" define new student
                 */
                else if ("5a".equalsIgnoreCase(option)) {
                    System.out.println("Student Firstname:");
                    String firstName = "";
                    firstName= in.nextLine() ;
                    System.out.println("Student Lastname:");
                    String lastName = "";
                    lastName=in.nextLine(); 
                    System.out.println("Student telephone:");
                    String telephone = in.nextLine();
                    System.out.println("Student address:");
                    String address = in.nextLine();
                    System.out.println("Student Age:");
                    int age = in.nextInt() ;
                    in.nextLine();
                    //create new object from Student.
                    Student stud = new Student(firstName,lastName,telephone, address, age);
                    /*
                     * add student to StudentList
                     * and add it in array list exist in college system. 
                     */
                    studentList.add(s,stud) ; 
                    s++ ;
                    AinShams.setStudent(studentList);
                	}
                /*
                 * print report about Student.
                 */
                 else if ("5b".equalsIgnoreCase(option)){
                     System.out.println("Student:");
                     String stud = in.nextLine();
                     for (int i = 0 ; i < AinShams.getStudent().size();i++){
                         if (stud.equalsIgnoreCase(AinShams.getStudent().get(i).getFullName())){
                             System.out.print("Course:");
                             for(int j=0 ; j<AinShams.getStudent().get(i).getCourses().size();j++){
                                 System.out.println(AinShams.getStudent().get(i).getCourses().get(j).getName());
                             }
                                System.out.println("Telephone:"+AinShams.getStudent().get(i).getTelephone());
                                System.out.println("Address:"+AinShams.getStudent().get(i).getAge());
                         }
                     }
                 }
              	System.out.println("============");
                System.out.println("Enter Operation");
                System.out.println("============");
            }
        
            else {break ;}
 
        }
        in.close();
        }
    }

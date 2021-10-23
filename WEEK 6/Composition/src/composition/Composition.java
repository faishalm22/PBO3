/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author lenovo
 */
import java.util.ArrayList;
import java.util.List;


public class Composition {
  public static void main(String[] args) {
    Student s1 = new Student("Seto",201511039);
    Student s2 = new Student("John",201511042);
    Student s3 = new Student("Dadan",201511033);
    
    //Create list of students
    List<Student> students = new ArrayList<Student>();
    students.add(s1);
    students.add(s2);
    students.add(s3);
    
    School sch = new School(students);
    List<Student> stu = sch.getTotalNumberOfStudents();
    for(Student student: stu) {
      System.out.println("Nama Murid : " + student.studentname + " | " + " Nim : " + student.nim );
    }
  }
}

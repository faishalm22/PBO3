/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

import java.util.List;

/**
 *
 * @author lenovo
 */
//School class which contains students
public class School {
  private final List<Student> students;
  
  School(List<Student> students) {
    this.students = students;
  }
  
  public List<Student> getTotalNumberOfStudents() {
    return students;
  }
  
}
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
public class Student {
  String studentname;
  long nim;
  
  Student(String studentname, long nim) {
    this.studentname = studentname;
    this.nim = nim;
  }
}

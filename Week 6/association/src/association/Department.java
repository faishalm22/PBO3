/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package association;

import java.util.List;

/**
 *
 * @author lenovo
 */
public class Department {
  
  String deptname;
  List<Dosen> DosenList;
  
  Department(String name) {
    this.deptname = name;
  }
  
  public String getDepartmentName() {
    return deptname;
  }
  
  public List<Dosen> getDosenList() {
    return DosenList;
  }
  
  public void setDepartment(List<Dosen> DosenList) {
    this.DosenList = DosenList;
  }
}
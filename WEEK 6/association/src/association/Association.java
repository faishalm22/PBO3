/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package association;


import java.util.*;   


import java.util.ArrayList;
import java.util.List;

public class Association {

  public static void main(String[] args) {
    Department d = new Department("JTK");
    
    Dosen t1 = new Dosen("Dadang", "Struktur Data");
    Dosen t2 = new Dosen("Deden","Ilmu Komputer");
    
    List<Dosen> DosenList = new ArrayList<Dosen>();
    DosenList.add(t1);
    DosenList.add(t2);
    
    d.setDepartment(DosenList);
    
    System.out.println(d.getDosenList() + " List Dosen " + d.getDepartmentName());
    System.out.println("Detail Dosen: ");
    System.out.println(t1.getDosenName() + " Mengajar " + t1.getMatkul());
    System.out.println(t2.getDosenName() + " Mengajar " + t2.getMatkul());
  }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package association;

/**
 *
 * @author lenovo
 */
public class Dosen {
  String name;
  String Matkul;
  
  Dosen(String name, String Matkul) {
    this.name = name;
    this.Matkul = Matkul;
  }
  
  public String getDosenName() {
    return name;
  }
  
  public String getMatkul() {
    return Matkul;
  }
  
  public String toString() {
    return name;
  }
}
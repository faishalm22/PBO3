/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aggregation;

/**
 *
 * @author lenovo
 */
public class Aggregation {

  public static void main(String[] args) {
    Address ad = new Address("Saluyu Indah 8",396,"Bandung",40298);
    Person p = new Person("Seto",ad);
    System.out.println("Nama : " + p.name);
    System.out.print("Alamat : ");
    System.out.println(p.ad.streetname + " No. " + p.ad.streetno + ", " + p.ad.city +", Kode Pos "+ p.ad.zipcode);
  }
}

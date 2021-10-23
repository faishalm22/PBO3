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
public class Address {
  String streetname;
  int streetno;
  String city;
  int zipcode;
  
  Address(String streetname, int no, String city, int code) {
    this.streetname = streetname;
    this.streetno = no;
    this.city = city;
    this.zipcode = code;  
  }
  
}
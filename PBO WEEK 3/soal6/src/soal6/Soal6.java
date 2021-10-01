/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal6;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Soal6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String s1,s2;
        try (Scanner input = new Scanner(System.in)) {
            s1=input.nextLine();
            s2=input.nextLine();
        }
       System.out.println(new BigInteger(s1).add(new BigInteger(s2)));
       System.out.println(new BigInteger(s1).multiply(new BigInteger(s2)));
    }
    
}

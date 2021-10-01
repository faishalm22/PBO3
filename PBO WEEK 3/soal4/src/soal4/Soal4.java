/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal4;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Soal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int item,pendapatan;
    double hasilgaji;
    int price = 50000;
    int gaji = 500000;
    Scanner input = new Scanner(System.in);
    item=input.nextInt();
    if(item < 15 && item >= 0){
        hasilgaji = gaji - (((15 - item) * price)* 0.15);
        pendapatan =(int) hasilgaji;
        System.out.println(pendapatan);
    }else if(item >= 15 && item <40){
        hasilgaji = gaji + ((item * price)* 0.10);
        pendapatan =(int) hasilgaji;
        System.out.println(pendapatan);
    }else if(item >= 40 && item <80){
        hasilgaji = gaji + ((item * price)* 0.25 );
        pendapatan =(int) hasilgaji;
        System.out.println(pendapatan);
    }else if(item > 80){
        hasilgaji = gaji + ((item * price)* 0.35 );
        pendapatan =(int) hasilgaji;
        System.out.println(pendapatan);
    }
    }
}
 
    

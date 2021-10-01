/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal2;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	String[] token = new String[3];
        int[] number = new int[3];
        Scanner input=new Scanner(System.in);
        for(int n=0;n<3;n++) {
        token[n] = input.next();
        number[n] = input.nextInt();
        }   
        System.out.println("================================");
        for(int i=0;i<3;i++){
            System.out.printf("%-14s %03d\n", token[i], number[i]);
        }
        System.out.println("================================");
    } 
    
}

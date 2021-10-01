/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal5;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Soal5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Platnomor;
        long tanda;
        Scanner input = new Scanner(System.in);
        Platnomor = input.nextLine();
        String[] plat = Platnomor.trim().split(" ");
        Platnomor = plat[0] + plat[1] + plat[2] + plat[3];
        tanda = Long.parseLong(Platnomor);
        tanda = (tanda - 999999) % 5;
        if (tanda == 0) {
        System.out.println("jalan");
        } else {
        System.out.println("berhenti");
        }
     } 
}
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal1;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s;
        Scanner scan = new Scanner(System.in);
            if(!scan.hasNext()){
                System.out.println("Masukan kata gais hehe");
                return;
            }   s = scan.nextLine();
            
        String[] tokens = s.trim().split("[!,?._ '@]");
        int size = tokens.length;
        System.out.println(size); 
        for(int i=0; i<size; i++){
            System.out.println(tokens[i]);
            
        }
    }
    
}

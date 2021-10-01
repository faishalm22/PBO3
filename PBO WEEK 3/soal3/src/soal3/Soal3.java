/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal3;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B, result;
	String opr;
	A = input.nextInt();			
	opr = input.next();
	B = input.nextInt();
	if (A >= 1 && A <= 1000 && B >= 1 && B <= 1000) {
            switch (opr){
		case "+" : 
                    result = A + B;
                    System.out.println(result);
                    break; 
		case "-" : 
                    result = A - B;
                    System.out.println(result);
                    break; 
		case "*" : 
		    result = A * B;
		    System.out.println(result);
		    break;
		case "/" : 
		    result = A / B;
		    System.out.println(result);
		    break;
		case "%" : 
		    result = A % B;
		    System.out.println(result);
		    break;
            }	
	} 
    }   
}

package task2;

import java.util.Scanner;

public class CustomExc{
	public static int Hextodes(String hex) {
		try {
			return Integer.parseInt(hex, 16);
		} catch(NumberFormatException e) {
			System.out.println("Input Hexa!!");
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner;
		System.out.println("Convert Hexadesimal to Desimal");
		System.out.println("\n");
		System.out.printf("Input Hexadesimal : ");
		String hex = scan.next();
		 int dec = Hexatodes(hex);
		System.out.println("\nResult: " + dec);
		scan.close();
	}
}

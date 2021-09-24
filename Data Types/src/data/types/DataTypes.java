/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.types;

import java.util.Scanner;

/**
 *
 * @author Faishal
 */
public class DataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Amount of data  you want to check?");
        int t=sc.nextInt();
        //Scan looping 
        for(int i=0;i<t;i++)
        {
            try //Try is a block that is used to place Java program code that allows exceptions to occur
            {   
                System.out.println("Insert the number :");
                long n=sc.nextLong();
                //Scan input number 
                System.out.println(n+" can be fitted in:");
                if(n>=-128 && n<=127)
                {
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if(n>=-32768 && n<=32767)
                {
                    System.out.println("* short"); 
                    System.out.println("* int");
                    System.out.println("* long");  
                }
                else if(n>=-2147483648 && n<=2147483647)
                { 
                    System.out.println("* int");
                    System.out.println("* long");  
                }
                else if(n>=-9223372036854775808L && n<=9223372036854775807L)
                { 
                    System.out.println("* long");  
                }
            }
            catch(Exception e) //Catch is used to catch errors that occur in the try block.
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
    
}

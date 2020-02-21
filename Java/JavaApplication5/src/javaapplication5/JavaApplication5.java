
package javaapplication5;

import java.util.Scanner;


public class JavaApplication5 {

   
    public static void main(String[] args) {
 
        Scanner in;
        in = new Scanner(System.in);
        System.out.print("VVedite imya: ");
        String name = in.nextLine();
        System.out.print ("VVedite vozrast: ");
        int age = in.nextInt();
        System.out.println ("Imya: " + name + "  Vozrast: " + age);
    }
}

    
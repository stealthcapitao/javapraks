/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treugolnik;

/**
 *
 * @author Student
 */
public class Treugolnik {

    public static final int LINES = 10;
    public static void main(String[] args) {
        int[][] p = new int[LINES][];
        p[0] = new int[1];
        System.out.println(p[0][0] = 1);
        p[1] = new int[2];
        p[1][0] = p[1][1] = 1;
        System.out.println(p[1][0]+"\t"+p[1][1]);
        for (int i = 2; i < LINES; i++)
        {
            p[i] = new int[i+1];
            System.out.print((p[i][0] = 1)+ "\t");
            for (int j = 1; j < i; j++)
            {
               System.out.print((p[i][j] = p[i-1][j-1] + p[i-1][j]) + "\t");
            }
            System.out.println(p[i][i] = 1);
        }
    }
    
}

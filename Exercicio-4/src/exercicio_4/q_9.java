/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_4;

import java.util.Scanner;

/**
 *
 * @author cleversonahum
 */
public class q_9 {
    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0;i<5;i++) {
            for( int j = 0;j<5;j++) {
                if(i==j)
                    matriz[i][j] = 1;
                else
                    matriz[i][j] = 0;
            }
        }
        
        for(int i = 0;i<5;i++) {
            for( int j = 0;j<5;j++) {
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.print("\n");
        }
    }
}

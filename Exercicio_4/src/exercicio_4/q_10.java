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
public class q_10 {
    public static void main(String[] args) {
        int matriz1[][] = new int[4][4];
        int matriz2[][] = new int[4][4];
        int matriz3[][] = new int[4][4];
        Scanner entrada = new Scanner(System.in);
        
        //Matriz 1
        for(int i = 0;i<4;i++) {
            for( int j = 0;j<4;j++) {
               System.out.println("Digite um valor para a matriz 1 ["+(i+1)+"]["+(j+1)+"] :");
               matriz1[i][j] = entrada.nextInt();
            }
        }
        
        //Matriz 2
        for(int i = 0;i<4;i++) {
            for( int j = 0;j<4;j++) {
               System.out.println("Digite um valor para a matriz 2 ["+(i+1)+"]["+(j+1)+"] :");
               matriz2[i][j] = entrada.nextInt();
            }
        }
        
        //Matriz 3
        for(int i = 0;i<4;i++) {
            for( int j = 0;j<4;j++) {
               if(matriz1[i][j]>matriz2[i][j])
                    matriz3[i][j] = matriz1[i][j];
               else
                   matriz3[i][j] = matriz2[i][j];
            }
        }
        
        //Mostrar matriz 3
        //Matriz 3
        for(int i = 0;i<4;i++) {
            for( int j = 0;j<4;j++) {
               System.out.print(matriz3[i][j]+"  ");
            }
            System.out.println();
        }
    }
}

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
public class q_14 {
    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        int matriz2[][] = new int[5][5];
        int aux;
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0;i<5;i++) {
            for(int j=0;j<5;j++) {
                System.out.println("Digite o valor da posição["+ (i+1) +"]["+(j+1)+"] : ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        for(int i = 0;i<5;i++) {
            for(int j=0;j<5;j++) {
                matriz2[i][j]= matriz[j][i];
            }
        }
        
        for(int i = 0;i<5;i++) {
            for( int j = 0;j<5;j++) {
               System.out.print(matriz2[i][j]+"  ");
            }
            System.out.println();
        }
    }
}

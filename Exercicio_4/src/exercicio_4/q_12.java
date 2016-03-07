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
public class q_12 {
    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int aux;
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0;i<4;i++) {
            for(int j=0;j<4;j++) {
                System.out.println("Digite o valor da posição["+ (i+1) +"]["+(j+1)+"] : ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        for(int i = 0;i<4;i++) {
            aux = matriz[0][i];
            matriz[0][i] = matriz[i][3];
            matriz[i][3] = aux;
        }
        
        for(int i = 0;i<4;i++) {
            for( int j = 0;j<4;j++) {
               System.out.print(matriz[i][j]+"  ");
            }
            System.out.println();
        }
        
    }
}

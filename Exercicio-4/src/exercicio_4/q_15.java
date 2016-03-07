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
public class q_15 {
    public static void main(String[] args) {
        int matriz[][] = new int[8][8];
        int maior = -99999,soma = 0;
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0;i<8;i++) {
            for(int j=0;j<8;j++) {
                System.out.println("Digite o valor da posição["+ (i+1) +"]["+(j+1)+"] : ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        for(int i = 0;i<8;i++) {
            for(int j=0;j<8;j++) {
                if(j==i) {
                    if(matriz[i][j]>maior)
                        maior = matriz[i][j];
                }
            }
        }
        
        for(int i = 0;i<8;i++) {
            for(int j=0;j<8;j++) {
                if(i==(3-j)) 
                    soma += matriz[i][j];
            }
        }
        
        System.out.println("Maior elemento da DP : "+maior+"\nSoma Elementos da DS : "+soma);
    }
}

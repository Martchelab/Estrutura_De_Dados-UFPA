/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_4;

import java.util.Scanner;

/**
 *
 * @author Cleverson Nahum
 */
public class q_8 {
    public static void main(String[] args) {
        int vetor[][] = new int[10][10];
        int maior = -999999,loci=0,locj=0;
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0;i<10;i++) {
            for( int j = 0;j<10;j++) {
                System.out.println("Digite o valor da posição["+ (i+1) +"]["+(j+1)+"] : ");
                vetor[i][j] = entrada.nextInt();
                if(vetor[i][j]>=maior) {
                    maior = vetor[i][j];
                    loci = i;
                    locj = j;
                }
            }
        }
        
        System.out.println("Maior Elemento : "+maior+"\nPosição: ["+(loci+1)+"]["+(locj+1)+"]");
        
        
}
}

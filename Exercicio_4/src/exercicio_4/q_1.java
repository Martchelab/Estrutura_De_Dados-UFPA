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
public class q_1 {
    
    public static void main(String[] args) {
        int vetor[] = new int[12];
        int x,y;
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0;i<12;i++) {
            System.out.println("Digite o valor da posição["+ (i+1) +"] : ");
            vetor[i] = entrada.nextInt();
        }
        
        System.out.println("Digite a posição do primeiro número (valor entre 1 e 12) : ");
        x = entrada.nextInt();
        System.out.println("Digite a posição do segundo número (valor entre 1 e 12) : ");
        y = entrada.nextInt();
        
        if(x<=12 && x>=1 && y<=12 && y>=1) {
            System.out.println("Resultado da soma : "+(vetor[x-1]+vetor[y-1]));
        }
        else {
            System.out.println("Você digitou posições inválidas");
        }
        
        
    }
}

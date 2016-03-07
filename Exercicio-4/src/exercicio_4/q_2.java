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
public class q_2 {
    public static void main(String[] args) {
        int vetor[] = new int[16];
        int aux;
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0;i<16;i++) {
            System.out.println("Digite o valor da posição["+ (i+1) +"] : ");
            vetor[i] = entrada.nextInt();
        }
        
        for(int i = 0;i<8;i++) {
            aux = vetor[i+8];
            vetor[i+8] = vetor[i];
            vetor[i] = aux;
        }
        
        for(int i = 0;i<16;i++) {
            System.out.println("Vetor Obtido : ");
            System.out.print(vetor[i] + "  ");
        }
    }
}

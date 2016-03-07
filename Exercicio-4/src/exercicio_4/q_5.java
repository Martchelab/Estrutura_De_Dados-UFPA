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
public class q_5 {
    public static void main(String[] args) {
        int vetor[] = new int[40];
        int vetor2[] = new int[40];
        int acm = 0;
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0;i<40;i++) {
            System.out.println("Digite o valor da posição["+ (i+1) +"] : ");
            vetor[i] = entrada.nextInt();
            acm += vetor[i];
            vetor2[i] = acm;
        }
        
        System.out.println("Vetor Original :");
        for(int i = 0;i<40;i++) {
            System.out.print(vetor[i]+" ");
        }
        
        System.out.println("Vetor Resultado :");
        for(int i = 0;i<40;i++) {
            System.out.print(vetor2[i]+" ");
        }
        
        
    }
}

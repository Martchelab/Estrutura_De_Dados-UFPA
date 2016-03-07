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
public class q_3 {
    public static void main(String[] args) {
        int vetor[] = new int[20];
        int x,posX = 0;
        boolean flag = false;
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0;i<20;i++) {
            System.out.println("Digite o valor da posição["+ (i+1) +"] : ");
            vetor[i] = entrada.nextInt();
        }
        
        System.out.println("Digite o valor da elemento que quer ser achado : ");
        x = entrada.nextInt();
        System.out.println("Posições em que o X foi encontrado: ");
        for(int i = 0;i<20;i++) {
            if(vetor[i]==x) {
                System.out.print((i+1) + "  ");
                flag = true;
            }
        }
        if(!flag)
            System.out.println("Nenhuma posição foi encontrada");
    }
}

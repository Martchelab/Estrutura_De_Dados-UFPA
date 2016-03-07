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
public class q_7 {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        int flag = 0,x=0;
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0;i<10;i++) {
            System.out.println("Digite o valor da posição["+ (i+1) +"] : ");
            vetor[i] = entrada.nextInt();
        }
        System.out.println("Os valores que se repetem são: ");
        for(int i = 0;i<10;i++) {
            for(int j = (i+1);j<10;j++){
                if(vetor[i]==vetor[j])
                    System.out.print(vetor[i]+"  ");
            }
          System.out.println();
        }
    }
}

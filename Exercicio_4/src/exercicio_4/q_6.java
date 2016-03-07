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
public class q_6 {
    public static void main(String[] args) {
        char vetor[] = new char[5];
        int quant;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de letras do número (até 5) : ");
        quant = entrada.nextInt();
        System.out.println("Soletre o número: ");
        for(int i = 0;i<quant;i++) {
            System.out.println("Digite a "+(i+1)+"ª letra :");
            vetor[i] = entrada.next().charAt(0);
        }
        System.out.println("É o número : ");
        for(int i = 0;i<5;i++) {
            System.out.print(vetor[i]);
        }
        
        
        
        
    }
}

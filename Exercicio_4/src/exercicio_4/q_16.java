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
public class q_16 {
    //Não entendi muito o conceito de palindrome mas pelas pesquisas acredito que seja isso.
    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        boolean ispalindrome1 = true;
        int matriz2[][] = new int[4][4];
        boolean ispalindrome2 = true;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Matriz 1");
        for(int i = 0;i<4;i++) {
            for(int j=0;j<4;j++) {
                System.out.println("Digite o valor da posição["+ (i+1) +"]["+(j+1)+"] : ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("Matriz 2");
        for(int i = 0;i<4;i++) {
            for(int j=0;j<4;j++) {
                System.out.println("Digite o valor da posição["+ (i+1) +"]["+(j+1)+"] : ");
                matriz2[i][j] = entrada.nextInt();
            }
        }
        
        //Verificando matriz 1
        for(int i = 0;i<4;i++) {
            if(matriz[i][0]!=matriz[i][2])
                if(matriz[i][1]!=matriz[i][3])
                    ispalindrome1=false;
        }
        
        //Verificando matriz 2
        for(int i = 0;i<4;i++) {
            if(matriz2[i][0]!=matriz2[i][2])
                if(matriz2[i][1]!=matriz2[i][3])
                    ispalindrome2=false;
        }
        
        if(ispalindrome1 && ispalindrome2)
                System.out.println("As duas matrizes são palindromes");
        else if(ispalindrome1 && !ispalindrome2)
                System.out.println("A primeira matriz é palindrome");
        else if(!ispalindrome1 && ispalindrome2)
                System.out.println("A segunda matriz é palindrome");
        else
            System.out.println("Nenhuma é palindrome");
    }

}

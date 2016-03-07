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
public class q_11 {
    public static void main(String[] args) {
        int matriz[][] = new int[20][20];
        int x,posX,posY;
        boolean flag = false;
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0;i<20;i++) {
            for(int j=0;j<20;j++) {
                System.out.println("Digite o valor da posição["+ (i+1) +"]["+(j+1)+"] : ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("Digite o valor da elemento que quer ser achado : ");
        x = entrada.nextInt();
        System.out.println("Posições em que o X foi encontrado: ");
        for(int i = 0;i<20;i++) {
            for(int j=0;j<20;j++) {
                if(matriz[i][j]==x) {
                    System.out.print("["+(i+1) + "]["+(j+1)+"]  ,  ");
                    flag = true;
                }
            }
        }
        if(!flag)
            System.out.println("Nenhuma posição foi encontrada");
    }
}

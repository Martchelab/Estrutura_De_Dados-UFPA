/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_5;

/**
 *
 * @author cleversonahum
 */

public class Q_5 {
    
 static void metodo1() {
    System.out.println("Método 1 iniciou");
    metodo2();
    System.out.println("Método 1 finalizado");
}
 static void metodo2() {
    System.out.println("Método 2 iniciou");
    metodo3();
    System.out.println("Método 2 finalizado");
}
 static void metodo3() {
    System.out.println("Método 3 iniciou");
    int x = 10/0;
    System.out.println("Método 3 finalizado");
}
 
 public static void main(String[] args) {
        metodo1();
    }
}

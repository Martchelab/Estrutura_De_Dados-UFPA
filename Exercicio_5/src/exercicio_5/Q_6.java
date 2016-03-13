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
public class Q_6 {
    static void dividir(int x, int y) {
        try {
            System.out.println(x/y);
        }
        catch(ArithmeticException e) {
            System.out.println ("Divisão por zero");
        }
        catch(RuntimeException e){
            System.out.println("Numeros não inteiros");
        }
    }
    
    public static void main(String[] args) {
        dividir(4,5);
    }
}

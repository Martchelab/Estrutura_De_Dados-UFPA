/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

/**
 *
 * @author cleversonahum
 */
class NoPilha {
    public NoPilha(int valor) {
        this.valor=valor;
        this.proximo=null;
    }
    int valor;
    NoPilha proximo;
}

class Pilha {
   public Pilha() {
        this.inicio = null;
    }
    NoPilha inicio;
    
    void inserir(int valor) {
        if(this.inicio==null)
            this.inicio = new NoPilha(valor);
        else {
            NoPilha noAtual = this.inicio;
            while(noAtual.proximo!=null)
                noAtual = noAtual.proximo;
            noAtual.proximo = new NoPilha(valor);
        }
    }
    
    void removerValorPilha() {
        if(this.inicio==null)
            System.out.println("A Pilha esta vazia.");
        else {
            NoPilha noAtual = this.inicio;
            NoPilha posAtual = noAtual.proximo;
            while(posAtual.proximo!=null) {
                noAtual = noAtual.proximo;
                posAtual = posAtual.proximo;
            }
            noAtual.proximo = posAtual.proximo;
        }
        
    }
    
    int removerRetornarValorPilha() {
        int retorno = 000000000;
        if(this.inicio==null)
            System.out.println("A Pilha esta vazia.");
        else {
            NoPilha noAtual = this.inicio;
            NoPilha posAtual = noAtual.proximo;
            while(posAtual.proximo!=null) {
                noAtual = noAtual.proximo;
                posAtual = posAtual.proximo;
            }
            retorno = posAtual.valor;
            noAtual.proximo = posAtual.proximo;
            
        }
        return retorno;
    }
    
    void verificarPilhaVazia() {
        if(this.inicio==null)
            System.out.println("A Pilha esta vazia.");
        else
            System.out.println("A Pilha não esta vazia.");
    }
    
    void mostraPilha () {
        NoPilha noAtual = this.inicio;
        System.out.println("Pilha :");
        while(noAtual.proximo!=null) {
                System.out.println(noAtual.valor);
                noAtual = noAtual.proximo;                                                                                                                                                                                                                                                                                                                
        }
        System.out.println(noAtual.valor);         
    }
    
}
public class Q_2 {
    public static void main(String[] args) {
        Pilha teste = new Pilha(); 
        teste.inserir(2);
        teste.inserir(3);
        teste.inserir(7);
        teste.inserir(8);
        teste.removerValorPilha();
        System.out.println(teste.removerRetornarValorPilha());
        teste.mostraPilha();
        teste.verificarPilhaVazia();
    }
}

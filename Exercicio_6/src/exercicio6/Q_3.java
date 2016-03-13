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

class NoFila {
    public NoFila(int valor) {
        this.valor=valor;
        this.proximo=null;
    }
    int valor;
    NoFila proximo;
}

class Fila {
   public Fila() {
        this.inicio = null;
    }
    NoFila inicio;
    
    void inserir(int valor) {
        if(this.inicio==null)
            this.inicio = new NoFila(valor);
        else {
            NoFila novoNo = new NoFila(valor);
            novoNo.proximo = this.inicio;
            this.inicio = novoNo;
        }
    }
    
    void removerValorFila() {
        if(this.inicio==null)
            System.out.println("A Fila esta vazia.");
        else {
            NoFila noAtual = this.inicio;
            NoFila posAtual = noAtual.proximo;
            while(posAtual.proximo!=null) {
                noAtual = noAtual.proximo;
                posAtual = posAtual.proximo;
            }
            noAtual.proximo = posAtual.proximo;
        }
        
    }
    
    int removerRetornarValorFila() {
        int retorno = 000000000;
        if(this.inicio==null)
            System.out.println("A Fila esta vazia.");
        else {
            NoFila noAtual = this.inicio;
            NoFila posAtual = noAtual.proximo;
            while(posAtual.proximo!=null) {
                noAtual = noAtual.proximo;
                posAtual = posAtual.proximo;
            }
            retorno = posAtual.valor;
            noAtual.proximo = posAtual.proximo;
            
        }
        return retorno;
    }
    
    void verificarFilaVazia() {
        if(this.inicio==null)
            System.out.println("A Fila esta vazia.");
        else
            System.out.println("A Fila não esta vazia.");
    }
    
    void mostraFila () {
        NoFila noAtual = this.inicio;
        System.out.println("Fila :");
        while(noAtual.proximo!=null) {
                System.out.println(noAtual.valor);
                noAtual = noAtual.proximo;                                                                                                                                                                                                                                                                                                                
        }
        System.out.println(noAtual.valor);         
    }
    
}


public class Q_3 {
    public static void main(String[] args) {
        Fila teste = new Fila(); 
        teste.inserir(2);
        teste.inserir(3);
        teste.inserir(7);
        teste.inserir(8);
        teste.removerValorFila();
        System.out.println(teste.removerRetornarValorFila());
        teste.mostraFila();
        teste.verificarFilaVazia();
    }
}

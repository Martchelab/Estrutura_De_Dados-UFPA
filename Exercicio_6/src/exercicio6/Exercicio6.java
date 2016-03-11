/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

/**
 *
 * @author Cleverson Nahum
 */

class NoLista {
    public NoLista(int valor) {
        this.valor=valor;
        this.proximo=null;
    }
    int valor;
    NoLista proximo;
}

class Lista {
   public Lista() {
        this.inicio = null;
    }
    NoLista inicio;
    
    void inserir(int valor) {
        if(this.inicio==null)
            this.inicio = new NoLista(valor);
        else {
            NoLista novoNo = new NoLista(valor);
            novoNo.proximo = this.inicio;
            this.inicio = novoNo;
        }
    }
    
    void inserirFim(int valor) {
        if(this.inicio==null)
            this.inicio = new NoLista(valor);
        else {
            NoLista noAtual = this.inicio;
            while(noAtual.proximo!=null)
                noAtual = noAtual.proximo;
            noAtual.proximo = new NoLista(valor);
            this.inicio = noAtual;
        }
    }
    
    void inserirPos(int valor, int pos) {
        if(this.inicio==null)
            this.inicio = new NoLista(valor);
        else {
            NoLista noAtual = this.inicio;
            for(int x = 0; x<pos;x++)
                noAtual = noAtual.proximo;
            NoLista novoNo = new NoLista(valor);
            novoNo.proximo = noAtual.proximo;
            noAtual.proximo = novoNo;
            this.inicio = noAtual;
        }
    }
    
    void removerPrimeiroValorLista(int valor) {
        if(this.inicio==null)
            System.out.println("A lista esta vazia.");
        else {
            NoLista noAtual = this.inicio;
            NoLista posAtual = noAtual.proximo;
            while(posAtual.valor!=valor) {
                noAtual = noAtual.proximo;
                posAtual = posAtual.proximo;
            }
            noAtual.proximo = posAtual.proximo;
            this.inicio = noAtual;
        }
        
    }
    
    void verificarListaVazia() {
        if(this.inicio==null)
            System.out.println("A lista esta vazia.");
        else
            System.out.println("A lista não esta vazia.");
    }
    
    int elementoLista(int pos) {
        NoLista noAtual = this.inicio;
        for(int x = 0; x<pos;x++)
            noAtual = noAtual.proximo;
        return noAtual.valor;    
    }
    
    int posElemento(int valor) {
        NoLista noAtual = this.inicio;
        int pos = 1;
        while(noAtual.valor!=valor){
            noAtual = noAtual.proximo;
            pos++;
        }
        return pos;
    }
    
    void mostraLista () {
        NoLista noAtual = this.inicio;
        System.out.println("Lista :");
        while(noAtual.proximo!=null) {
                System.out.println(noAtual.valor);
                noAtual = noAtual.proximo;                                                                                                                                                                                                                                                                                                                
        }
        System.out.println(noAtual.valor);         
    }
    
}

public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista teste = new Lista(); 
        teste.inserir(2);
        teste.inserir(3);
        teste.inserir(4);
        teste.mostraLista();
    }
    
}

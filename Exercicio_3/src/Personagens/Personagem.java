package Personagens;

public abstract class Personagem {
	
	String nome;
    int valor_ataque,valor_defesa;
    
    abstract void atacar();
    abstract void defender();
    
}

package Personagens;

public abstract class Guerreiro extends Personagem {
	
	Guerreiro(String nome, int valor_ataque, int valor_defesa) {
		super.nome = nome;
		super.valor_ataque = valor_ataque;
		super.valor_defesa = valor_defesa;
	} 
	
    int xp = 0;
    
    void winBattle(int xp) {
    	super.valor_ataque+=10;
    	super.valor_defesa+=5;
    	this.xp += xp;
    }
    
}

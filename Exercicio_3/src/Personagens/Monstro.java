package Personagens;

public abstract class Monstro extends Personagem{
	
	Monstro(String nome, int valor_ataque, int valor_defesa) {
		super.nome = nome;
		super.valor_ataque = valor_ataque;
		super.valor_defesa = valor_defesa;
	}
	
    final int xp = 100;
}


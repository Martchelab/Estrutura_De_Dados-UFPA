package Personagens;

public class Principal {
	
	static void luta(Guerreiro guerreiro, Monstro monstro) {
		if(guerreiro.valor_ataque>monstro.valor_defesa) {
			System.out.println(guerreiro.nome + " WINS");
			guerreiro.winBattle(monstro.xp);
		}
		else if(guerreiro.valor_ataque>monstro.valor_ataque){
			System.out.println(guerreiro.nome + " WINS");
		}
		else {
			System.out.println(monstro.nome + " WINS");
		}
	}

	public static void main(String[] args) {
		Guerreiro_Azul cleverson = new Guerreiro_Azul("Cleverson",100,100);
		Dragao smaug = new Dragao("Smaug",150,150);
		
		luta(cleverson,smaug);

	}

}

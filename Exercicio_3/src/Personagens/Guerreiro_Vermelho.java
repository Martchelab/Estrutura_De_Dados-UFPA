package Personagens;

public class Guerreiro_Vermelho extends Guerreiro implements Habilidade_Fogo{
	
    Guerreiro_Vermelho(String nome, int valor_ataque, int valor_defesa) {
		super(nome,valor_ataque,valor_defesa);
	}
    
    void atacar() {
    	System.out.println("Soco");
    }
    
    void defender() {
    	System.out.println("Defender");
    }
    
    public void hab_fogo() {
    	System.out.println("Fire Ember");
    }
}

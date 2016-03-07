package Personagens;

public class Dragao extends Monstro implements Habilidade_Fogo{
    Dragao(String nome, int valor_ataque, int valor_defesa) {
		super(nome,valor_ataque,valor_defesa);
	}
    
    void atacar() {
    	System.out.println("Golpe com a calda");
    }
    void defender() {
    	System.out.println("Defender");
    }
    
    public void hab_fogo() {
    	System.out.println("Fire Ember");
    }
}

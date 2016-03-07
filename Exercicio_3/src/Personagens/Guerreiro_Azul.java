package Personagens;

public class Guerreiro_Azul extends Guerreiro implements Habilidade_Vida{
	Guerreiro_Azul(String nome, int valor_ataque, int valor_defesa) {
		super(nome,valor_ataque,valor_defesa);
	}
	
    void atacar() {
    	System.out.println("Chute");
    }
    
    void defender() {
    	System.out.println("Defender");
    }
    
    public void hab_vida() {
    	System.out.println("Todos os danos foram curados");
    }
}

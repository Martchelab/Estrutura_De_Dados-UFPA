package Personagens;

public class Zumbi extends Monstro implements Habilidade_Vida{
	Zumbi(String nome, int valor_ataque, int valor_defesa) {
		super(nome,valor_ataque,valor_defesa);
	}
    
    void atacar() {
    	System.out.println("Reviver");
    }
    void defender() {
    	System.out.println("Defender");
    }
    
    public void hab_vida() {
    	System.out.println("Todos os danos foram curados");
    }
}

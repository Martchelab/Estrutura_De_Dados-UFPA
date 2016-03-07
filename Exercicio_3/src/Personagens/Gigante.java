package Personagens;

public class Gigante extends Monstro{
	Gigante(String nome, int valor_ataque, int valor_defesa) {
		super(nome,valor_ataque,valor_defesa);
	}
    
    void atacar() {
    	System.out.println("Pisar");
    }
    void defender() {
    	System.out.println("Defender");
    }
}

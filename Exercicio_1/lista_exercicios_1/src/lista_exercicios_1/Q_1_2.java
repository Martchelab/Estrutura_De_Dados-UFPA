package lista_exercicios_1;

class Lampada {
	String est_lamp = "Desligada";
	
	void liga_lamp(){
		est_lamp = "Ligada";
	}
	
	void desliga_lamp(){
		est_lamp = "Desligada";
	}
	
	void meia_lamp(){
		est_lamp = "Meia luz";
	}
	
	void estaLigada() {
		System.out.println(est_lamp);
	}
}

public class Q_1_2 {

	public static void main(String[] args) {
		Lampada lamp_quarto = new Lampada();
		lamp_quarto.meia_lamp();
		lamp_quarto.estaLigada();

	}

}

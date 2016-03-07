package lista_exercicios_1;

class Time {
	String nomeTime;
	int quant_jogadores;
	float renda,despesas,salario_jogador,saldo,folhaSalarial;
	
	Time(String time,int quant_jogadores,float renda,float despesas,float salario_jogador){
		this.nomeTime = time;
		this.quant_jogadores  = quant_jogadores;
		this.renda = renda;
		this.despesas = despesas;
		this.salario_jogador = salario_jogador;
		this.folhaSalarial = salario_jogador*quant_jogadores;
		this.saldo = renda-(salario_jogador*quant_jogadores+despesas);
	}
	
	void mostraInfoTime() {
		System.out.println("Time :"+this.nomeTime+"\n\nRenda : "+this.renda+"\nDespesas: "+this.despesas+"\nSaldo : "+this.saldo+"\nSalario Jogador: "+this.salario_jogador+"\nQuantidade de Jogadores : "+this.quant_jogadores+"\nFolha Salarial : "+this.folhaSalarial);
	}
}

public class Q_5 {

	public static void main(String[] args) {
		Time flamengo = new Time("Flamengo",11,10000,200,100);
		flamengo.mostraInfoTime();

	}

}

package lista_exercicios_1;

class Conta {
	double saldo;
	
	void abreConta(double saldo) {
		if(saldo>0) {
			this.saldo = saldo;
		}
		else {
			this.saldo = 0;
		}
	}
	
	void addSaldo(double deposito) {
		this.saldo+=deposito;
	}
	
	void subSaldo(double saque) {
		this.saldo-=saque;
	}
	
	void mostraDados() {
		System.out.println(this.saldo);
		if(this.saldo<0) {
			System.out.println("Seu saldo está negativo.");
		}
	}
}

public class Q_3_4 {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.abreConta(-200);
		minhaConta.addSaldo(500);
		minhaConta.subSaldo(800);
		minhaConta.mostraDados();

	}

}

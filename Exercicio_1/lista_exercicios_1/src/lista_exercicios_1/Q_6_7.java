package lista_exercicios_1;

class Empregado {
	String nome,departamento;
	double horasTrabalhadasNoMes,salarioPorHora,bonus;
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	void setDepartamento(String dep) {
		this.departamento = dep;
	}
	
	void setHoras(float horas) {
		this.horasTrabalhadasNoMes = horas;
	}
	
	void setSalarioHora(float sal) {
		this.salarioPorHora = sal;
	}
	
	void mostraDados() {
		System.out.println("Nome : "+this.nome+"\nDeparatamento : "+this.departamento+"\nHoras/Mes : "+this.horasTrabalhadasNoMes+"\nSalario/Hora : "+this.salarioPorHora);
	}
	
	double calculaSalarioMensal() {
		if(this.departamento=="Diretoria") {
			this.bonus = (this.salarioPorHora * this.horasTrabalhadasNoMes)*0.10;
		}
		else{
			this.bonus = 0;
		}
		System.out.println(this.salarioPorHora * this.horasTrabalhadasNoMes+this.bonus);
		return (this.salarioPorHora * this.horasTrabalhadasNoMes+this.bonus);
	}
}

public class Q_6_7 {

	public static void main(String[] args) {
		Empregado teste = new Empregado();
		teste.setNome("Cleverson Nahum");
		teste.setDepartamento("Diretoria");
		teste.setHoras(100);
		teste.setSalarioHora(100);
		
		teste.calculaSalarioMensal();
		teste.mostraDados();
		
	}

}
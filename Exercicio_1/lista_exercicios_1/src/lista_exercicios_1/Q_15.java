package lista_exercicios_1;

class Calculadora {
	void soma(double x, double y) {
		System.out.println(x+y);
	}
	
	void sub(double x, double y) {
		System.out.println(x-y);
	}
	
	void mult(double x, double y) {
		System.out.println(x*y);
	}
	
	void div(double x, double y) {
		System.out.println(x/y);
	}
	
	void exp(double x, double y) {
		System.out.println(Math.pow(x, y));
	}
	
	void mod(double x, double y) {
		System.out.println(x%y);
	}}

public class Q_15 {

	public static void main(String[] args) {
		Calculadora casio = new Calculadora();
		casio.soma(10, 10);
		casio.sub(10, 10);
		casio.mult(10, 10);
		casio.div(10, 10);
		casio.exp(10,10);
		casio.mod(10, 10);
		
	}

}

package Eng_Senai;

public class Calculo {

	public static void main(String[] args) {
		Quadrado q1 = new Quadrado();
		q1.setLado(5);
		q1.mostrarResultados();
		
		
		Retangulo r1 = new Retangulo();
		r1.setBase(4);
		r1.setAltura(3);
		r1.mostrarResultados();
		
		Triangulo t1 = new Triangulo();
		t1.setBase(5);
		t1.setAltura(3);
		t1.mostrarResultados();

	}

}

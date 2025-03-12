package Eng_Senai;

public class Triangulo {

	private double base;
	private double altura;
	private double area;

	public void setBase(double base) {
		this.base = base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularArea() {
		area = base * altura / 2;
		return area;
	}
	
	public void mostrarResultados() {
		System.out.println("O valor da base deste triângulo é " + base);
		System.out.println("Ovalor da altura deste triângulo é " + altura);
		System.out.println("O valor da área deste triângulo é " + calcularArea());
	}
}

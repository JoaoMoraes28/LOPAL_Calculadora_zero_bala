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
		System.out.println("");
		System.out.println("-----------------------");
		System.out.println("DADOS DO TRIÂNGULO");
		System.out.println("-----------------------");
		System.out.println("BASE: " + base);
		System.out.println("ALTURA: " + altura);
		System.out.println("ÁREA: " + calcularArea());
		System.out.println("-----------------------");
		System.out.println("");
	}
}

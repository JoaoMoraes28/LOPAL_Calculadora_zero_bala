package Eng_Senai;

public class Quadrado {

	private double lado;
	private double area;
	private double perimetro;
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	
	public double calcularAreaQuadrado() {
		area = Math.pow(lado, 2);
		return area;
	}
	
	public double calculcarPerimetroQuadrado() {
		perimetro = lado * 4;
		return perimetro;
	}
	
	public void mostrarResultados() {
		System.out.println("O valor do lado do quadrado é " + lado);
		System.out.println("O valor da área deste quadrado é igual a " + calcularAreaQuadrado());
		System.out.println("O valor do perímetro deste quadrado é igual a " + calculcarPerimetroQuadrado());
	}
	
}

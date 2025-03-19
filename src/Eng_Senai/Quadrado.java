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
		System.out.println("");
		System.out.println("-----------------------");
		System.out.println("DADOS DO QUADRADO");
		System.out.println("-----------------------");
		System.out.println("LADO: " + lado);
		System.out.println("PERÍMETRO: " + calculcarPerimetroQuadrado());
		System.out.println("ÁREA: " + calcularAreaQuadrado());
		System.out.println("-----------------------");
		System.out.println("");
	}
	
}

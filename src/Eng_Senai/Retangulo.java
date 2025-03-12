package Eng_Senai;

public class Retangulo {
	
	private double base;
	private double altura;
	private double area;
	private double perimetro;
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	public double calcularArea() {
		area = base * altura;
		return area;
	}
	
	public double calcularPerimetro() {
		perimetro = 2 * (base + altura);
		return perimetro;
	}
	
	public void mostrarResultados() {
		System.out.println("O valor da base deste retângulo é " + base);
		System.out.println("O valor da altura deste retângulo é " + altura);
		System.out.println("O valor da área deste retângulo é " + calcularArea());
		System.out.println("O valor do perímetro deste retângulo é " + calcularPerimetro());
	}
	
	
	
}

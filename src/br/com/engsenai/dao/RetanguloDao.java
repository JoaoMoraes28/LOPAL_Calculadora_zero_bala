package br.com.engsenai.dao;

import java.util.Scanner;

import Eng_Senai.Retangulo;

public class RetanguloDao {

	public void criarRetangulo() {
		Retangulo retangulo = new Retangulo();
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Criando um objeto retângulo...");
		
		System.out.print("Informe a base: ");
		retangulo.setBase(leitor.nextDouble());
		
		System.out.print("Informe a altura: ");
		retangulo.setAltura(leitor.nextDouble());
		
		retangulo.mostrarResultados();
		
		leitor.close();
		
	
	}
}

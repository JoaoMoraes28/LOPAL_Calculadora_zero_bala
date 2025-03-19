package br.com.engsenai.dao;

import java.util.Scanner;

import Eng_Senai.Quadrado;

public class QuadradoDao {
	
	public void criarQuadrado() {
		Quadrado quadrado = new Quadrado();
		
		System.out.println();
		System.out.println("Criando um objeto quadrado...");
		System.out.print("Coloca aí o lado do quadrado ");
		 
		//Criar um objeto Scanner
		Scanner leitor = new Scanner(System.in);
		
		quadrado.setLado(leitor.nextDouble());
		
		quadrado.mostrarResultados();
		
		//Fechar o objeto scanner, remover da memória
		leitor.close();
	}
	
}

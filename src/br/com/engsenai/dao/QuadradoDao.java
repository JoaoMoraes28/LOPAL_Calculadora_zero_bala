package br.com.engsenai.dao;

import java.util.Scanner;

import Eng_Senai.Quadrado;
import br.com.engsenai.calculadora.ui.Menu;

public class QuadradoDao {
	
	//Criar um objeto Scanner
	Scanner leitor = new Scanner(System.in);
		
	public void criarQuadrado() {
		Quadrado quadrado = new Quadrado();
		
		System.out.println();
		System.out.println("Criando um objeto quadrado...");
		System.out.print("Coloca aí o lado do quadrado ");
		 
		
		quadrado.setLado(leitor.nextDouble());
		
		quadrado.mostrarResultados();
		
		Menu.saidaMenu();
		
		
		
		leitor.close();
		
		
	}
	
	
	
}

package br.com.engsenai.calculadora.ui;

import java.util.Scanner;

import Eng_Senai.Quadrado;
import br.com.engsenai.dao.QuadradoDao;
import br.com.engsenai.dao.RetanguloDao;

public class Menu {

	public static void mostrarMenu() {
		
		System.out.println("---------------------------");
		System.out.println("CALCULADORA DE POLÍGONOS");
		System.out.println("---------------------------");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Retângulo");
		System.out.println("3 - Trapézio");
		System.out.println("4 - Circunferência");
		System.out.println("5 - Triângulo");
		System.out.println("---------------------------");
		System.out.print("Escolha uma opção (1 - 5): ");
		
		
		Scanner leitor = new Scanner(System.in);
		
		int opcao = leitor.nextInt();
		
		if (opcao == 1) {
			QuadradoDao dao = new QuadradoDao();
			dao.criarQuadrado();
		} else if (opcao == 2) {
			RetanguloDao dao = new RetanguloDao();
			dao.criarRetangulo();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

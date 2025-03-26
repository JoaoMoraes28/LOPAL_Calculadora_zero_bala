package br.com.engsenai.calculadora.ui;

import java.util.Scanner;

import Eng_Senai.Quadrado;
import br.com.engsenai.dao.QuadradoDao;
import br.com.engsenai.dao.RetanguloDao;

public class Menu {
	
	static Scanner leitor = new Scanner(System.in);
	
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
		
		
		
		
		int opcao = leitor.nextInt();
		
		if (opcao == 1) {
			QuadradoDao dao = new QuadradoDao();
			dao.criarQuadrado();
		} else if (opcao == 2) {
			RetanguloDao dao = new RetanguloDao();
			dao.criarRetangulo();
		}
	}
	
	public static void saidaMenu() {
		 
		String resposta = "";
		
		while (!resposta.equals("s") || !resposta.equals("s")) {
			System.out.print("Digite C para continuar ou qualquer ou S para sair?... ");
		
			resposta = leitor.next();
			
		}
		
		if (resposta.equals("s")) {
			Menu menu = new Menu();
			menu.mostrarMenu();
			
		} else {
			System.out.println("Programa paro aí hein...");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

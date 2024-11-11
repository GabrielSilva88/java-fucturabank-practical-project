package view;

import java.util.Scanner;

import controller.Menu;
import controller.Operacoes;

public class PrincipalMainFuctura {

	/*
	 * O projeto precisará de uma classe Principal, que contenha o método main.
	 * Nesta classe será feita a criação de objetos, chamadas de métodos e
	 * atribuição de valores aos atributos.
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int opcao = 0;
		/*Operacoes.criarConta();
		
		Operacoes.correntes.get(0).exibirDados();
		
		Operacoes.poupancas.get(0).exibirDados();
		*/
		Menu.exibirMenu();
		
		 while (opcao != 5) {
			System.out.println("Digite uma opção: ");
			opcao = scan.nextInt();
			
		}

		
	}
}

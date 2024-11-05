package view;

import controller.Menu;
import controller.Operacoes;

public class Principal {

	/*
	 * O projeto precisará de uma classe Principal, que contenha o método main.
	 * Nesta classe será feita a criação de objetos, chamadas de métodos e
	 * atribuição de valores aos atributos.
	 */
	
	public static void main(String[] args) {
		
		/*Operacoes.criarConta();
		
		Operacoes.correntes.get(0).exibirDados();
		
		Operacoes.poupancas.get(0).exibirDados();
		*/
		Menu.exibirMenu();
		Menu.exibirContaPoupanca();
		Menu.exibirContaCorrente();
		
	}
}

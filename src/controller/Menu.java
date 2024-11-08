package controller;

public class Menu {

	private static String menuPrinipal ="""
			***** Menu Fuctura Bank *****
			
				1 -> Criar Conta
				2 -> Resgatar
				3 -> Exibir Dados
				4 -> Exibir Saldo
				5 -> Sair
			""";
	
	private static String menuContaCorrent="""
			1 - Sacar
			2 - Depositar
			3 - Aplicar
			4 - Exibir Saldo
			5 - Voltar
			""";
	
	public static String menuContaPoupanca ="""
			1 - Resgatar
			2 - Exibir Saldo
			3 - Voltar
			""";
	
	public static void exibirMenu() {
		System.out.println(menuPrinipal);
	}
	
	public static void exibirContaCorrente() {
		System.out.println(menuContaCorrent);
	}
	
	public static void exibirContaPoupanca() {
		System.out.println(menuContaPoupanca);
	}
}

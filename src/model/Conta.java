package model;
/*Desenvolva um sistema bancário com as seguintes especificações: - Uma classe abstrata Conta. */
public abstract class Conta {
	/*Atributos:
			→ Número da Conta
			→ Nome do Titular 
			→ Saldo Disponível
	*/
	private String numeroConta;
	private String nomeTitular;
	private double saldoDisponivel;
		
	/*Métodos:  
			→ Exibir Dados
			→ Depositar
			→ Exibir Saldo das Contas
			→ Getters e Setters
	 
	 */

	public String exibirDados(){
		return "Número da Conta; " + numeroConta + "\nTitular: " + nomeTitular;
	}
	
	public String Depositar(){
		return "Depósito feito com sucesso!";
		
	}
	
	public String exbibirSaldo() {
		return "Saldo Atual: R$ %.2f%n" + saldoDisponivel;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	// GET(){} SET(){}

	public void setNumeroConta(String numeroConta) {
		numeroConta = numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldoDisponivel() {
		return saldoDisponivel;
	}

	public void setSaldoDisponivel(double saldoDisponivel) {
		this.saldoDisponivel = saldoDisponivel;
	}
	
	
}

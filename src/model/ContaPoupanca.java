package model;

public class ContaPoupanca extends Conta {
	/*
	 * Uma classe Conta-Poupança que herda da classe Conta. A classe Conta-Poupança,
	 * além dos atributos e métodos herdados, deverá conter um método para Resgatar
	 * valores da Conta-Poupança para a Conta-Corrente.
	 */
	
	public void Resgatar(ContaCorrente cc, double valor) {
		System.out.println("Resgate feito com sucesso!");
	}
	
	public void Despositar(double valor) {
		// TODO Auto-generated method stub
		this.setSaldoDisponivel(this.getSaldoDisponivel() + valor);
	}
	
	
	
	
}

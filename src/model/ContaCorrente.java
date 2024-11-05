package model;

public class ContaCorrente extends Conta {

	/*
	 * Uma classe Conta-Corrente que herda da classe Conta. A classe Conta-Corrente,
	 * além dos atributos e métodos herdados, deverá conter um método para Sacar e
	 * para Aplicar valores na Conta-Poupança.
	 */
	
	public void Sacar(double valor){
		this.setSaldoDisponivel(this.getSaldoDisponivel() - valor);
		System.out.println("Saque feito com sucesso!");
	}
	
	public void Aplicar(ContaPoupanca cp, double valor) {
		cp.Despositar(valor);
		this.setSaldoDisponivel(this.getSaldoDisponivel() - valor);
		System.out.println("Aplicação feita com sucesso!");
	}
	
	public void depositar(double valor) {
		this.setSaldoDisponivel(this.getSaldoDisponivel() + valor);
	}
	
}

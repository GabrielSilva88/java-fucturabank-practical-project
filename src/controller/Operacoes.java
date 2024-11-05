package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import model.ContaCorrente;
import model.ContaPoupanca;

public class Operacoes {
	
	ContaPoupanca cp = new ContaPoupanca();
	ContaCorrente cc = new ContaCorrente();
	
	public static List<ContaCorrente> correntes = new ArrayList<>(); 
	public static List<ContaPoupanca> poupancas = new ArrayList<>();
	
	public static void criarConta() {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		Integer n = r.nextInt(10000);
		
		do {
			for (ContaCorrente cc : correntes) {
				if(cc.getNumeroConta() == n.toString()) {
					n = r.nextInt(10000);
				}
			}
		} while (n.toString().length() !=4);
		
		System.out.println("Nome do Titular");
		String titular = scan.nextLine();
		
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		cc.setNomeTitular(titular);
		cp.setNomeTitular(titular);
		
		cc.setNumeroConta(titular);
		cp.setNumeroConta(n.toString()+"-1");
		
		correntes.add(cc);
		poupancas.add(cp);
	}
	
	public void realizarSaque(ContaCorrente c, double valor) {
		if (c.getSaldoDisponivel() >= valor) {
			c.Sacar(valor);
		} else if(c.getSaldoDisponivel() < valor){
			System.out.println("Saldo insuficiente");
		}else {
			System.out.println("valor inválido");
		}
	}
	
	public void realizarDeposito(ContaCorrente c, double valor) {
		if (valor > 0 ) {
			System.out.println("Depósito efeturado com sucesso!");
			c.depositar(valor);
		}else {
			System.out.print("valor inválido");
		}
	}
	
	public static void realizarAplicacao(ContaCorrente cc, ContaPoupanca cp, double valor) {
		if(cc.getSaldoDisponivel() < valor) {
			System.out.println("Saldo insuficiente");
		}else if(cc.getSaldoDisponivel() >= valor) {
			cc.Aplicar(cp, valor);
		}else {
			System.out.println("Valor inválido");
		}
	}
	
	public void realizarResgate(ContaCorrente cc, ContaPoupanca cp, double valor) {
		if (cp.getSaldoDisponivel() < valor) {
			System.out.println("Saldo insuficiente");
		} else if(cp.getSaldoDisponivel() >= valor){
			cp.Resgatar(cc, valor);
		} else {
			System.out.println("Valor inválido");
		}
	}
	
}


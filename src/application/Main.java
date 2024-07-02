package application;

import entities.Banco;
import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente();
		Conta poupanca1 = new ContaPoupanca();
		Conta cc2 = new ContaCorrente();
		Cliente paulinho = new Cliente("Paulo Vitor", "000.000.000-00", cc1);
		Cliente joaozinho = new Cliente("João Silva", "000.000.000-01", poupanca1);
		Cliente mariazinha = new Cliente("Ana Maria", "000.000.000-02", cc2);
		
		System.out.println();

	Banco esp = new Banco("Especial");
	
		esp.getClientes().add(joaozinho);
		esp.getClientes().add(paulinho);
		esp.getClientes().add(mariazinha);
		esp.getClientes().sort(null);
		
		esp.listaDosClientes();
	}

}

package entities;

import utils.IConta;

public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	private int agencia;
	private int numero;
	private double saldo;

	public Conta() {
		agencia = Conta.AGENCIA_PADRAO;
		numero = SEQUENCIAL++;
		saldo = 0;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;

	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	@Override
	public String imprimirExtrato() {
		return "número da conta: " + numero + " - saldo: " + String.format("%.2f", saldo);
		
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	//
}

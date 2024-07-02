package entities;

public class Cliente implements Comparable<Cliente>{
	private String nome;
	private String cpf;
	private Conta conta;

	public Cliente(String nome, String cpf, Conta conta) {
		this.nome = nome;
		this.cpf = cpf;
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Conta getConta() {
		return conta;
	}

	@Override
	public int compareTo(Cliente outroCliente) {
		return Integer.compare(conta.getNumero(), outroCliente.getConta().getNumero());
	}
	
	@Override
	public String toString() {
		return"Cliente: Sr(a) " + nome + " - " + conta.imprimirExtrato();
	}

}

package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Cliente> clientes;
	
	public Banco(String nome) {
		this.nome = nome;
		this.clientes = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public void listaDosClientes() {
		clientes.forEach(c -> System.out.println(c));
	}
	
	
	
	

}

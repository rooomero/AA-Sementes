package br.ufrpe.aasementes.negocio.beans;

public class Cliente {
	
	private int id;
	private String nome;
	private String endereco;
	private int compras = 0;

	public Cliente(String nome, String endereco, int compras) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.compras = compras;
	}
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public int getCompras() {
		return compras;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setCompras(int compras) {
		this.compras = compras;
	}
	
	@Override
	public String toString() {
		
		String str ="=========================" 
				+ "Id: " + this.id + "\n"
				+ "Nome: " + this.nome + "\n"
				+ "Endereço: " + this.endereco + "\n"
				+ "Compras: " + this.compras + "\n"
				+   "=========================";
		return str;
	}
}

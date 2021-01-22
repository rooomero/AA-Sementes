package br.ufrpe.aasementes.negocio.beans;

public class Produto {
	
	private int codigo;
	private String nome;
	private String tipo;
	private double preco;

	public Produto(String nome, String tipo, double preco) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

	public double getPreco() {
		return preco;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}


}

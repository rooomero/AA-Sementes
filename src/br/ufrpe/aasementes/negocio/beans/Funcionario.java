package br.ufrpe.aasementes.negocio.beans;

public abstract class Funcionario {
	
	protected String nome;
	protected int matricula;
	
	public Funcionario(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void cadastraCliente(Cliente cliente) {
				
	}
	public void VendeProduto(Produto produto) {
		
	}
}

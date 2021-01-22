package br.ufrpe.aasementes.negocio.beans;

import java.time.LocalDateTime;

public class Venda {
	
	private int id;
	private LocalDateTime data;
	private Produto produto;
	private Funcionario funcionario;
	private Cliente cliente;
	private int quantidade;

	public Venda(int id, LocalDateTime data, Produto produto, Funcionario funcionario, Cliente cliente,
			int quantidade) {
		super();
		this.id = id;
		this.data = data;
		this.produto = produto;
		this.funcionario = funcionario;
		this.cliente = cliente;
		this.quantidade = quantidade;
	}

	public int getId() {
		return id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public Produto getProduto() {
		return produto;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}

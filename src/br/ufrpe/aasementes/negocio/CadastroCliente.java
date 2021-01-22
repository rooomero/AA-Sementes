package br.ufrpe.aasementes.negocio;

import br.ufrpe.aasementes.dados.RepositorioClientes;
import br.ufrpe.aasementes.negocio.beans.Cliente;

public class CadastroCliente {
	
	private RepositorioClientes repositorioClientes;

	public CadastroCliente(RepositorioClientes repositorioClientes) {
		super();
		this.repositorioClientes = new RepositorioClientes();
	}
	
	public void cadastrarCliente (Cliente c) {
		if (c != null) {
			if (!this.repositorioClientes.existe(c.getId())) {
				this.repositorioClientes.cadastrar(c);
			}
		}
	}
	
	public Cliente procurarCliente (int id) {
		return this.repositorioClientes.procurar(id);
	}

	public void atualizarCliente () {
		
	}
}

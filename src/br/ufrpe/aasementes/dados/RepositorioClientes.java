package br.ufrpe.aasementes.dados;

import br.ufrpe.aasementes.negocio.beans.Cliente;

public class RepositorioClientes extends Repositorio<Cliente> {
	
	public RepositorioClientes() {
		super();
	}

	public void cadastrarCliente(Cliente c) {

		super.cadastrar(c);
	}
	
	public Cliente procurarCliente(int id) {
		
		Cliente c = null;
		for (int i = 0; i < repositorio.size(); i++) {
			if(repositorio.get(i).getId() == id) {
				c = repositorio.get(i);
			}
		}
		return c;
	}

	public void atualizarCliente(Cliente c, int id) {
		
		Cliente c1 = c;
		repositorio.set(repositorio.indexOf(procurarCliente(id)), c1);
	}

	public void removerCliente(int id) {
		
		repositorio.remove(repositorio.indexOf(procurarCliente(id)));
	}
	
	public boolean existe(int id) {
		boolean existe = false;
		if (procurarCliente(id) != null) {
			existe = true;
		}
		return existe;
	}

}

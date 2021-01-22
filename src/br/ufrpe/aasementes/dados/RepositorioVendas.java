package br.ufrpe.aasementes.dados;

import br.ufrpe.aasementes.negocio.beans.Venda;

public class RepositorioVendas extends Repositorio<Venda> {
	
	public void cadastrarVenda(Venda v) {
		super.cadastrar(v);
	}
	
	public Venda procurarVenda(int id) {
		
		Venda v = null;
		for (int i = 0; i < repositorio.size(); i++) {
			if(repositorio.get(i).getId() == id) {
				v = repositorio.get(i);
			}
		}
		return v;
	}
	
	public void atualizarVenda(Venda v, int id) {
		
		Venda ved = v;
		repositorio.set(repositorio.indexOf(procurarVenda(id)), ved);
	}
	
	public void removerVenda(int id) {
		
		repositorio.remove(repositorio.indexOf(procurarVenda(id)));
	}

}

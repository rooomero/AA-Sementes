package br.ufrpe.aasementes.dados;

import br.ufrpe.aasementes.negocio.beans.Produto;

public class RepositorioProdutos extends Repositorio<Produto> {
	
	public void cadastrarProduto(Produto p) {
		
		super.cadastrar(p);
	}
	
	public Produto procurarProduto(int codigo) {
		
		Produto p = null;
		for (int i = 0; i < repositorio.size(); i++) {
			if(repositorio.get(i).getCodigo() == codigo) {
				p = repositorio.get(i);
			}
		}
		return p;
	}
	
	public void atualizarProduto(Produto p, int codigo) {
		
		Produto ped = p;
		repositorio.set(repositorio.indexOf(procurarProduto(codigo)), ped);
	}
	
	public void removerProduto(int codigo) {
		
		repositorio.remove(repositorio.indexOf(procurarProduto(codigo)));
	}

}

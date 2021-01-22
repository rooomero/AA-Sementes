package br.ufrpe.aasementes.dados;

import java.util.ArrayList;
import java.util.List;

public abstract class Repositorio<T> implements IRepositorio<T> {

	protected List<T> repositorio;

	public Repositorio() {
		this.repositorio = new ArrayList<>();
	}

	public void cadastrar(T t) {
		if(!this.repositorio.contains(t))
			this.repositorio.add(t);
	}
	
	public T procurar(int indice) {
		T t = null;
		return t;
	}

	public void atualizar(T t, int indice) {
		
		this.repositorio.set(indice, t);		
}

	public void remover(int indice) {
		
		repositorio.remove(indice);
	}
	
}

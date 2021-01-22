package br.ufrpe.aasementes.dados;

public interface IRepositorio<T> {

	void cadastrar(T o);
	
	T procurar(int id);
	
	void atualizar(T o, int id);
	
	void remover(int id);
	
	
}

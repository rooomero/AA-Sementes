package br.ufrpe.aasementes.dados;

import br.ufrpe.aasementes.negocio.beans.Funcionario;

public class RepositorioFuncionarios extends Repositorio<Funcionario> {
	
	public void cadastrarFuncionario(Funcionario f) {
		
		super.cadastrar(f);
	}
	
	public Funcionario procurarFuncionario(int matricula) {
		
		Funcionario f = null;
		for (int i = 0; i < repositorio.size(); i++) {
			if(repositorio.get(i).getMatricula() == matricula) {
				f = repositorio.get(i);
			}
		}
		return f;
	}
	
	public void atualizarFuncionario(Funcionario f, int matricula) {
		
		Funcionario fed = f;
		repositorio.set(repositorio.indexOf(procurarFuncionario(matricula)), fed);
	}
	
	public void removerFuncionario(int matricula) {
		
		repositorio.remove(repositorio.indexOf(procurarFuncionario(matricula)));
	}

}

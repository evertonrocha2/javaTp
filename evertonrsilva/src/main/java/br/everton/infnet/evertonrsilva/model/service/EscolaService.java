package br.everton.infnet.evertonrsilva.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.everton.infnet.evertonrsilva.model.domain.Escola;

public class EscolaService {
	
	private Map<String, Escola> escolas = new HashMap<String, Escola>();
	
	
	
	
	public void incluir(Escola escola) {
		System.out.println("A inclusão da " + escola + " foi realizada com sucesso!");
		escolas.put(escola.getNome(), escola);
	}
	
	public void excluir(String nome) {
		System.out.println("A escola " + nome + " foi excluida com sucesso!");
		escolas.remove(nome);
	}
	
	public Collection<Escola> obterLista(){
		return escolas.values();
	}
	
	public Escola obter(String nome) {
		return escolas.get(nome);
	}
	
	
}

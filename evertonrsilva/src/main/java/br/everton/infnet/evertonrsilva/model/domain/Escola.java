package br.everton.infnet.evertonrsilva.model.domain;

import java.util.List;

public class Escola {
	private String nome;
	private List<Professor> professores;
	
	public Escola() {
		
	}
	
	public Escola(String nome) {
		this.nome = nome;
	}
	
	
	@Override
	public String toString() {
		return "Escola: " + nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Professor> getProfessores() {
		return professores;
	}
	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
	
	
}

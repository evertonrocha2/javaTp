package br.edu.infnet.everton.model.domain;

public class Estudante {
	private String nome;
    private int idade;
    private String curso;
    private double media;

    public Estudante(String nome, int idade, String curso, double media) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.media = media;
    }
    
    public Estudante() {
    	
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getStatus() {
        if (media >= 7.0) {
            return "Aprovado";
        } else if (media >= 5.0) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
    
    
  
}


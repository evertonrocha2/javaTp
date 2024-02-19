package br.edu.infnet.everton.model.domain;

public class TesteEstudante {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("João", 18, "Matemática", 8.5);
        Estudante estudante2 = new Estudante("Maria", 20, "História", 5.8);
        Estudante estudante3 = new Estudante("Everton", 21, "Java", 10.0);
        	
        System.out.println("Nome do Estudante 1: " + estudante1.getNome());
        System.out.println("Idade do Estudante 1: " + estudante1.getIdade());
        System.out.println("Curso do Estudante 1: " + estudante1.getCurso());
        System.out.println("Média do Estudante 1: " + estudante1.getMedia());

        System.out.println("Nome do Estudante 2: " + estudante2.getNome());
        System.out.println("Idade do Estudante 2: " + estudante2.getIdade());
        System.out.println("Curso do Estudante 2: " + estudante2.getCurso());
        System.out.println("Média do Estudante 2: " + estudante2.getMedia());
        
        System.out.println("Nome do Estudante 3: " + estudante3.getNome());
        System.out.println("Idade do Estudante 3: " + estudante3.getIdade());
        System.out.println("Curso do Estudante 3: " + estudante3.getCurso());
        System.out.println("Média do Estudante 3: " + estudante3.getMedia());

        estudante1.setMedia(9.0);

        System.out.println("Status do Estudante 1: " + estudante1.getStatus());
        System.out.println("Status do Estudante 2: " + estudante2.getStatus());
        System.out.println("Status do Estudante 3: " + estudante3.getStatus());
    }
}
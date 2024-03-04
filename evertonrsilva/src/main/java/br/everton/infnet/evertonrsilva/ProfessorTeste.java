package br.everton.infnet.evertonrsilva;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.everton.infnet.evertonrsilva.model.domain.Professor;

@Component
public class ProfessorTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Professor prof1 = new Professor();
		prof1.setNome("Elberth");
		prof1.setRegistro(123);
		prof1.setMestre(true);
		prof1.setSalario(10000);
		System.out.println("Professor: " + prof1.getNome() + " foi cadastrado com sucesso!");
		System.out.println("O professor recebe: " + prof1.calcularSalario());
		
		Professor prof2 = new Professor();
		prof2.setNome("Ricardo");
		prof2.setRegistro(123);
		prof2.setMestre(false);
		prof2.setSalario(9000);
		System.out.println("Professor: " + prof2.getNome() + " foi cadastrado com sucesso!");
		System.out.println("O professor recebe: " + prof2.calcularSalario());

	}
}

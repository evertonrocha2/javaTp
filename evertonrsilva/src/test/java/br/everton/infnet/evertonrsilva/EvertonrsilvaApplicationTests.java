package br.everton.infnet.evertonrsilva;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.everton.infnet.evertonrsilva.model.domain.Professor;

@SpringBootTest
class EvertonrsilvaApplicationTests {

	@Test
	void contextLoads() {
		
	}
	
	@Test
	void professorMestre() {
		Professor prof1 = new Professor();
		prof1.setNome("Elberth");
		prof1.setRegistro(123);
		prof1.setMestre(true);
		prof1.setSalario(10000);
		prof1.calcularSalario();
		assertEquals(11000, prof1.calcularSalario());
	}
	
	@Test
	void professorNaoMestre() {
		Professor prof2 = new Professor();
		prof2.setNome("Ricardo");
		prof2.setRegistro(123);
		prof2.setMestre(false);
		prof2.setSalario(9000);
		System.out.println("Professor: " + prof2.getNome() + " foi cadastrado com sucesso!");
		System.out.println("O professor recebe: " + prof2.calcularSalario());
	}
	

}

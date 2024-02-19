package br.edu.infnet.everton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.everton.model.domain.Estudante;

@SpringBootTest
class EvertonApplicationTests {
	
	@Test
	void aprovadoErro() {
		Estudante everton = new Estudante("Everton", 21, "Java", 10.0);
		assertEquals("Reprovado", everton.getStatus());
	}
	
	@Test
	void reprovadoCerto() {
		Estudante leticia = new Estudante("Leticia", 21, "C#", 4.0);
		assertEquals("Reprovado", leticia.getStatus());
	}

}

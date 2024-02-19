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
	
	@Test
	void testeSetterGetter() {
		Estudante estudante1 = new Estudante();
		estudante1.setNome("Leticia");
		estudante1.setCurso("C#");
		estudante1.setIdade(21);
		estudante1.setMedia(5.0);
		assertEquals("Leticia", estudante1.getNome());
		assertEquals("C#", estudante1.getCurso());
		assertEquals(21, estudante1.getIdade());
		assertEquals(5.0, estudante1.getMedia());

	}

}

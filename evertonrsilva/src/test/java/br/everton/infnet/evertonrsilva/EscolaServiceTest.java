package br.everton.infnet.evertonrsilva;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.everton.infnet.evertonrsilva.model.domain.Escola;
import br.everton.infnet.evertonrsilva.model.service.EscolaService;

class EscolaServiceTest {

    private EscolaService escolaService;

    @BeforeEach
    void setUp() {
        escolaService = new EscolaService();
    }

    @Test
    void testIncluir() {
        Escola escola = new Escola("Escola Teste");
        escolaService.incluir(escola);
        assertEquals(escola, escolaService.obter("Escola Teste"));
    }

    @Test
    void testExcluir() {
        Escola escola = new Escola("Escola Teste");
        escolaService.incluir(escola);
        escolaService.excluir("Escola Teste");
        assertNull(escolaService.obter("Escola Teste"));
    }

    @Test
    void testObterLista() {
        Escola escola1 = new Escola("Escola 1");
        Escola escola2 = new Escola("Escola 2");

        escolaService.incluir(escola1);
        escolaService.incluir(escola2);

        Collection<Escola> listaEscolas = escolaService.obterLista();
        assertTrue(listaEscolas.contains(escola1));
        assertTrue(listaEscolas.contains(escola2));
    }

    @Test
    void testObter() {
        Escola escola = new Escola("Escola Teste");
        escolaService.incluir(escola);
        assertEquals(escola, escolaService.obter("Escola Teste"));
    }
}

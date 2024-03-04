package br.everton.infnet.evertonrsilva;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.everton.infnet.evertonrsilva.model.domain.Escola;
import br.everton.infnet.evertonrsilva.model.service.EscolaService;

@Component
public class EscolaLoader implements ApplicationRunner{
	@Override
	public void run(ApplicationArguments args) throws Exception {
		EscolaService escolaService = new EscolaService();
		escolaService.incluir(new Escola("Infnet"));
		System.out.println(" - " + escolaService.obterLista());
		escolaService.excluir("Infnet");
		System.out.println(" - " + escolaService.obterLista());
		escolaService.incluir(new Escola("Instituto Infnet"));
		escolaService.incluir(new Escola("Escola de tecnologia Infnet"));
		System.out.println(" - " + escolaService.obterLista());
		System.out.println(escolaService.obter("Instituto Infnet"));
	}
}

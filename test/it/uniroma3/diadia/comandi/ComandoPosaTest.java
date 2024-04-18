package it.uniroma3.diadia.comandi;

import static org.junit.Assert.*;

import org.junit.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.comandi.Comando;
import it.uniroma3.diadia.comandi.ComandoPosa;

public class ComandoPosaTest {

	@Test
	public void testSetParametroNull() {
		ComandoPosa p = new ComandoPosa(null);
		p.setParametro(null);
		assertNull(p.getParametro());
	}

	@Test
	public void testSetParametroNome() {
		ComandoPosa p = new ComandoPosa(null);
		p.setParametro("attrezzo");
		assertTrue(p.getParametro().equals("attrezzo"));
	}
	
	@Test
	public void testEsegui() {
		Partita partita = new Partita(new Labirinto());
		Comando p = new ComandoPosa("spada");
		/*spada presente in borsa*/
		Attrezzo spada = new Attrezzo("spada", 3);
		partita.getGiocatore().getBorsa().addAttrezzo(spada);
		p.esegui(partita);
		assertEquals(spada, partita.getStanzaCorrente().getAttrezzo("spada"));
		
	}
}

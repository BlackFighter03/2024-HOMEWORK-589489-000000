package it.uniroma3.diadia;

import it.uniroma3.diadia.ambienti.*;

import static org.junit.Assert.*;
import org.junit.*;

public class PartitaTest {

	@Test
	public void testGetStanzaCorrenteIniziale() {
		assertNotNull(new Partita(new Labirinto()).getStanzaCorrente());
	}
	
	@Test
	public void testGetStanzaCorrenteAggiornata() {
		Partita partita = new Partita(new Labirinto());
		Stanza stanza = new Stanza("Magazzino");
		partita.setStanzaCorrente(stanza);
		assertEquals(stanza, partita.getStanzaCorrente());
	}
	
	@Test
	public void testGetStanzaVincente() {
		assertEquals("Biblioteca", new Partita(new Labirinto()).getLabirinto().getStanzaVincente().getNome());
	}

	@Test
	public void testIsFinita() {
		assertFalse(new Partita(new Labirinto()).isFinita());
	}

}

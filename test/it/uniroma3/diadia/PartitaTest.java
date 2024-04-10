package it.uniroma3.diadia;

import it.uniroma3.diadia.ambienti.*;

import static org.junit.Assert.*;
import org.junit.*;

public class PartitaTest {

	private Partita partita(Stanza stanza) {
		Partita p = new Partita(new Labirinto());
		p.setStanzaCorrente(stanza);
		return p;
	}

	@Test
	public void testGetStanzaCorrente() {
		Stanza stanza = new Stanza("Magazzino");
		assertEquals(stanza, this.partita(stanza).getStanzaCorrente());
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

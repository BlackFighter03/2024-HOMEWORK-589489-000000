package it.uniroma3.diadia;

import it.uniroma3.diadia.ambienti.Stanza;

import static org.junit.Assert.*;
import org.junit.*;

public class PartitaTest {

	private Partita partita(Stanza stanza) {
		Partita p = new Partita();
		p.getLabirinto().setStanzaCorrente(stanza);
		return p;
	}

	@Test
	public void testGetStanzaCorrente() {
		Stanza stanza = new Stanza("Magazzino");
		assertEquals(stanza, this.partita(stanza).getLabirinto().getStanzaCorrente());
	}

	@Test
	public void testGetStanzaVincente() {
		assertEquals("Biblioteca", new Partita().getLabirinto().getStanzaVincente().getNome());
	}

	@Test
	public void testIsFinita() {
		assertFalse(new Partita().isFinita());
	}

}

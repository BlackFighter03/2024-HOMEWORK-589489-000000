package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;

import org.junit.Test;

public class LabirintoTest {
	
	private Labirinto labirinto(Stanza stanza) {
		Labirinto l = new Labirinto();
		l.setStanzaCorrente(stanza);
		return l;
	}
	
	@Test
	public void testGetStanzaCorrente() {
		assertEquals("Atrio", new Labirinto().getStanzaCorrente().getNome());
	}
	
	@Test
	public void testGetStanzaVincente() {
		assertEquals("Biblioteca", new Labirinto().getStanzaVincente().getNome());
	}

	@Test
	public void testSetStanzaCorrente() {
		Stanza stanza = new Stanza("Magazzino");
		assertEquals(stanza, this.labirinto(stanza).getStanzaCorrente());
	}
}

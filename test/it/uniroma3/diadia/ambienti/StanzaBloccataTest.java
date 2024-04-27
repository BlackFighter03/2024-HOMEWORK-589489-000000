package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaBloccataTest {

	@Test
	public void testGetDirezioneBloccata() {
		StanzaBloccata s = new StanzaBloccata("stanza", "nord", "chiave");
		assertEquals("nord", s.getDirezioneBloccata());
	}
	
	@Test
	public void testGetNomeChiave() {
		StanzaBloccata s = new StanzaBloccata("stanza", "nord", "chiave");
		assertEquals("chiave", s.getChiave());
	}

	@Test
	public void testStanzaBloccata() {
		StanzaBloccata s = new StanzaBloccata("stanza", "nord", "chiave");
		assertEquals(s, s.getStanzaAdiacente("nord"));
	}

	@Test
	public void testStanzaSbloccata() {
		StanzaBloccata s = new StanzaBloccata("stanza", "nord", "chiave");
		Stanza stanzaAdiacente = new Stanza("unlocked");
		s.addAttrezzo(new Attrezzo("chiave", 1));
		s.impostaStanzaAdiacente("nord", stanzaAdiacente);
		assertEquals(stanzaAdiacente, s.getStanzaAdiacente("nord"));
	}
}

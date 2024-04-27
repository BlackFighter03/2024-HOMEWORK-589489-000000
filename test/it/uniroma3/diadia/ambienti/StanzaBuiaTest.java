package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaBuiaTest {
	@Test
	public void testStanzaBuia() {
		StanzaBuia s = new StanzaBuia("stanza", "lanterna");
		assertEquals("qui c'è un buio pesto", s.getDescrizione());
	}
	
	@Test
	public void testStanzaLuminosa() {
		StanzaBuia s = new StanzaBuia("stanza", "lanterna");
		s.addAttrezzo(new Attrezzo("lanterna", 2));
		assertNotEquals("qui c'è un buio pesto", s.getDescrizione());
	}
	
	@Test
	public void testStanzaBuiaAttrezzoSbagliata() {
		StanzaBuia s = new StanzaBuia("stanza", "lanterna");
		s.addAttrezzo(new Attrezzo("osso", 1));
		assertEquals("qui c'è un buio pesto", s.getDescrizione());
	}


}

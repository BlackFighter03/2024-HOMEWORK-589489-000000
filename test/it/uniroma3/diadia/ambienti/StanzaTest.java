package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;

import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;



public class StanzaTest {

	private final Stanza stanza1 = new Stanza("stanza1");
	
	private Stanza stanzaIsolata(String nome) {
		return new Stanza(nome);
	}

	private Stanza stanzaCollegata(String nome, String direzione, Stanza camera) {
		Stanza stanza = new Stanza(nome);
		stanza.impostaStanzaAdiacente(direzione, camera);
		return stanza;
	}
	
	@Test
	public void testGetStanzaAdiacenteIsolata() {
		assertNull(this.stanzaIsolata("Stanza isolata").getStanzaAdiacente("nord"));
	}

	@Test
	public void testGetStanzaAdiacenteCollegata() {
		assertEquals(this.stanza1, this.stanzaCollegata("stanza2", "nord", stanza1).getStanzaAdiacente("nord"));
	}
	
	@Test
	public void testAddAttrezzo() {
		assertTrue(stanza1.addAttrezzo(new Attrezzo ("conchiglia", 1)));
	}
	
	
}

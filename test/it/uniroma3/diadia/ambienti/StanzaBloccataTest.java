package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;


public class StanzaBloccataTest {

	private final String nomeChiave = new String("chiave");
	private final String direzioneBloccata = new String("nord");
	private final Stanza stanzaBloccata1 = new StanzaBloccata("stanzaBloccata1",direzioneBloccata,nomeChiave);
	private Stanza stanzaCollegata = new Stanza("generica");
	
	@Before
	public void setUp() {
		stanzaBloccata1.impostaStanzaAdiacente(direzioneBloccata, stanzaCollegata);
	}
	
	@Test
	public void testGetStanzaAdiacenteBloccataSenzaChiave() {
		assertEquals(stanzaBloccata1.getStanzaAdiacente(direzioneBloccata), stanzaBloccata1);
	}
	
	@Test
	public void testGetStanzaAdiacenteLiberaSenzaChiave() {
		assertNull(stanzaBloccata1.getStanzaAdiacente("sud"));
	}
	
	@Test
	public void testGetStanzaAdiacenteBloccataConChiave() {
		stanzaBloccata1.addAttrezzo(new Attrezzo(nomeChiave, 1));
		assertEquals(stanzaBloccata1.getStanzaAdiacente(direzioneBloccata),stanzaCollegata);
	}

	@Test
	public void testGetStanzaAdiacenteLiberaConChiave() {
		stanzaBloccata1.addAttrezzo(new Attrezzo(nomeChiave, 1));
		assertNull(stanzaBloccata1.getStanzaAdiacente("sud"));
	}
}

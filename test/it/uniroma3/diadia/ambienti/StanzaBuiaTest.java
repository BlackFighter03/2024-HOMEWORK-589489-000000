package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.*;

public class StanzaBuiaTest {
	private final String nomeLuce = new String("lanterna");
	private final Stanza stanzaBuia1 = new StanzaBuia("stanzaBuia1",nomeLuce);
	private final String descrizioneBuia = new String("Qui c'è buio pesto");
	
	
	@Test
	public void getDescrizioneStanzaVuota() {
		assertEquals(stanzaBuia1.getDescrizione(), descrizioneBuia);
	}
	
	@Test
	public void getDescrizioneStanzaNonIlluminata() {
		Stanza stanzaNonIlluminata = new StanzaBuia("s",nomeLuce);
		stanzaNonIlluminata.addAttrezzo(new Attrezzo("martello",1));
		assertEquals(stanzaNonIlluminata.getDescrizione(), descrizioneBuia);
		
	}
	
	@Test
	public void getDescrizioneStanzaIlluminata()
	{
		Stanza stanzaIlluminata = new StanzaBuia("s",nomeLuce);
		stanzaIlluminata.addAttrezzo(new Attrezzo("lanterna",1));
		assertFalse(stanzaIlluminata.getDescrizione().equals(descrizioneBuia));
	}
}

package it.uniroma3.diadia.comandi;

import static org.junit.Assert.*;

import org.junit.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.comandi.Comando;
import it.uniroma3.diadia.comandi.ComandoVai;

public class ComandoVaiTest {

	@Test
	public void testEseguiStessaStanza() {
		Partita p = new Partita(new Labirinto());
		Stanza s = p.getStanzaCorrente();
		Comando v = new ComandoVai(null);
		v.esegui(p);
		assertEquals(s, p.getStanzaCorrente());
		
	}
	
	@Test
	public void testEseguiStanzaSud() {
		Partita p = new Partita(new Labirinto());
		Stanza s = p.getStanzaCorrente().getStanzaAdiacente("sud");
		Comando v = new ComandoVai("sud");
		v.esegui(p);
		assertEquals(s, p.getStanzaCorrente());
	}
	
	@Test
	public void testEseguiStanzaEstEst() {
		Partita p = new Partita(new Labirinto());
		Stanza s = p.getStanzaCorrente().getStanzaAdiacente("est").getStanzaAdiacente("est");
		Comando v = new ComandoVai("est");
		v.esegui(p);
		v.setParametro("est");
		v.esegui(p);
		assertEquals(s, p.getStanzaCorrente());
	}

}

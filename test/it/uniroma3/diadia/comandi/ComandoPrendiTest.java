package it.uniroma3.diadia.comandi;

import static org.junit.Assert.*;

import org.junit.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.comandi.Comando;
import it.uniroma3.diadia.comandi.ComandoPrendi;

public class ComandoPrendiTest {

	@Test
	public void testPrendiNulla() {
		Partita p = new Partita(new Labirinto());
		Comando prendi = new ComandoPrendi(null);
		prendi.esegui(p);
		assertTrue(p.getGiocatore().getBorsa().isEmpty());
	}
	
	@Test
	public void testPrendiOsso() {
		Partita p = new Partita(new Labirinto());
		Comando prendi = new ComandoPrendi("osso");
		prendi.esegui(p);
		assertTrue(p.getGiocatore().getBorsa().hasAttrezzo("osso"));
	}
	
	@Test
	public void testNonPrendiOggettoInesistente() {
		Partita p = new Partita(new Labirinto());
		Comando prendi = new ComandoPrendi("spada");
		prendi.esegui(p);
		assertTrue(p.getGiocatore().getBorsa().isEmpty());
	}

}

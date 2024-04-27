package it.uniroma3.diadia.giocatore;

import it.uniroma3.diadia.attrezzi.Attrezzo;

import static org.junit.Assert.*;
import org.junit.Test;

public class BorsaTest {
	
	@Test
	public void testAddAttrezzoNullo() {
		assertFalse(new Borsa().addAttrezzo(null));
	}
	
	@Test
	public void testAddAttrezzoValido() {
		assertTrue(new Borsa().addAttrezzo(new Attrezzo("spada", 3)));
	}
	
	@Test
	public void testAddAttrezzoNonValido() {
		assertFalse(new Borsa().addAttrezzo(new Attrezzo("Martello", 11)));
	}

	@Test
	public void testGetPesoBorsaVuota() {
		assertEquals(0, new Borsa().getPeso());
	}
	
	@Test public void testGetPesoBorsaConAttrezzo() {
		Borsa borsa = new Borsa();
		borsa.addAttrezzo(new Attrezzo("spada", 3));
		assertEquals(3, borsa.getPeso());
	}
	
	@Test
	public void testGetAttrezzoNullo() {
		assertNull(new Borsa().getAttrezzo(null));
	}
	
	@Test
	public void testGetAttrezzoValido() {
		Borsa borsa = new Borsa();
		Attrezzo spada = new Attrezzo("spada", 3);
		borsa.addAttrezzo(spada);
		assertEquals(spada, borsa.getAttrezzo(spada.getNome()));
	}
}

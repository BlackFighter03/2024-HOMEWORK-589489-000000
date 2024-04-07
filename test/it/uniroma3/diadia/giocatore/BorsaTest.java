package it.uniroma3.diadia.giocatore;

import it.uniroma3.diadia.attrezzi.Attrezzo;

import static org.junit.Assert.*;

import org.junit.Test;

public class BorsaTest {
	
	@Test
	public void testAddAttrezzo() {
		assertTrue(new Borsa().addAttrezzo(new Attrezzo("spada", 3)));
	}

	@Test
	public void testGetPeso() {
		assertEquals(0, new Borsa().getPeso());
	}
	
	@Test
	public void testGetAttrezzo() {
		assertEquals(null, new Borsa().getAttrezzo(null));
	}
}

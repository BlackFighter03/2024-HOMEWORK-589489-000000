package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;

import org.junit.Test;

public class LabirintoTest {
	
	@Test
	public void testCostruttoreLabirinto() {
		assertNotNull(new Labirinto());
	}
	
	@Test
	public void testGetStanzaVincente() {
		assertNotNull(new Labirinto().getStanzaVincente());
	}

	@Test
	public void testGetStanzaIniziale() {
		assertNotNull(new Labirinto().getStanzaIniziale());
	}
}

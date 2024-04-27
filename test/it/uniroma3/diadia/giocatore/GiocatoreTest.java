package it.uniroma3.diadia.giocatore;

import static org.junit.Assert.*;
import org.junit.Test;

public class GiocatoreTest {

	@Test
	public void testGetCfuDefault() {
		assertEquals(20, new Giocatore().getCfu());
	}
	
	@Test
	public void testGetCfuModificati() {
		Giocatore g = new Giocatore();
		g.setCfu(15);
		assertEquals(15, g.getCfu());
	}
	
	@Test
	public void testGetBorsa() {
		assertNotNull(new Giocatore().getBorsa());
	}

}

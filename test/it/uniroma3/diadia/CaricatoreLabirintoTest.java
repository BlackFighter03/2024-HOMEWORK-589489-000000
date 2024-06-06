package it.uniroma3.diadia;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import java.io.StringReader;

import org.junit.Test;

import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.LabirintoBuilder;
import it.uniroma3.diadia.ambienti.Stanza;

public class CaricatoreLabirintoTest {

	private static String testoLabirinto = "Stanze: N11, N10, Biblioteca\r\n"
			+ "Stanze bloccate: Prigione nord osso\r\n"
			+ "Stanze buie: \r\n"
			+ "Stanze magiche: \r\n"
			+ "Inizio: N11\r\n"
			+ "Vincente: Biblioteca\r\n"
			+ "Attrezzi: Osso 5 N10\r\n"
			+ "Uscite: N10 nord Biblioteca, Biblioteca sud N10\r\n"
			+ "Estremi: N10, Biblioteca";
	
	@Test(expected = FileNotFoundException.class)
	public void testFileNonValido() throws FileNotFoundException, FormatoFileNonValidoException {
		CaricatoreLabirinto lab = new CaricatoreLabirinto("non valido");
		lab.carica();
	}
	
	@Test
	public void testLetturaStanzaIniziale() throws FormatoFileNonValidoException {
		CaricatoreLabirinto lab = new CaricatoreLabirinto(new StringReader(testoLabirinto));
		lab.carica();
		assertEquals(new Stanza("N11"), lab.getStanzaIniziale());
	}
	
	@Test
	public void testLetturaStanzaVincente() throws FormatoFileNonValidoException {
		CaricatoreLabirinto lab = new CaricatoreLabirinto(new StringReader(testoLabirinto));
		lab.carica();
		assertEquals(new Stanza("Biblioteca"), lab.getStanzaVincente());
	}
	
	@Test
	public void testLetturaStanze() throws FormatoFileNonValidoException {
		CaricatoreLabirinto lab = new CaricatoreLabirinto(new StringReader(testoLabirinto));
		lab.carica();
		LabirintoBuilder l = lab.getcostruttoreLabirinto();
		assertEquals(4, l.getListaStanze().size());
		assertTrue(l.getListaStanze().contains(new Stanza("N10")));
		assertTrue(l.getListaStanze().contains(new Stanza("N11")));
		assertTrue(l.getListaStanze().contains(new Stanza("Biblioteca")));
		assertTrue(l.getListaStanze().contains(new Stanza("Prigione")));
	}

	@Test
	public void testStanzeAdiacenti() throws FormatoFileNonValidoException {
		CaricatoreLabirinto lab = new CaricatoreLabirinto(new StringReader(testoLabirinto));
		lab.carica();
		LabirintoBuilder l = lab.getcostruttoreLabirinto();
	}
	
}

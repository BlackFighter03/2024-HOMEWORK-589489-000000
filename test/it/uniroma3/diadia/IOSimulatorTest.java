package it.uniroma3.diadia;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.ambienti.Labirinto;

public class IOSimulatorTest {

	@Test
	public void testPartitaVintaDopoUnaMossa() {
		IO io = new IOSimulator("guarda","vai nord");
		io.mostraMessaggio("Partita vincente"+'\n');
		DiaDia diadia = new DiaDia(new Labirinto(), io);
		diadia.gioca();
		System.out.println();
	}

	@Test
	public void testPartitaPersa0Cfu() {
		String [] s = new String[20];
		for(int i = 0; i<s.length; i++)
			s[i] = "vai est";

		IO io = new IOSimulator(s);
		io.mostraMessaggio("Partita perdente"+'\n');
		DiaDia diadia = new DiaDia(new Labirinto(), io);
		diadia.gioca();
		System.out.println();
	}

	@Test
	public void testPartitaOssoPreso() {
		IO io = new IOSimulator("guarda", "prendi osso", "guarda", "vai nord");
		io.mostraMessaggio("Partita con osso preso"+'\n');
		DiaDia diadia = new DiaDia(new Labirinto(), io);
		diadia.gioca();
		System.out.println();
	}

	@Test
	public void testPartitaOssoPresoEPosatoELanternaPresa() {
		IO io = new IOSimulator("guarda", "prendi osso", "guarda", "vai sud", "posa osso", "prendi lanterna", "guarda", "vai nord", "vai nord");
		io.mostraMessaggio("Partita con osso preso e posato"+'\n');
		DiaDia diadia = new DiaDia(new Labirinto(), io);
		diadia.gioca();
		System.out.println();
	}

}

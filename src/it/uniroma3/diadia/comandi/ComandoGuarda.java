package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;

public class ComandoGuarda implements Comando {

	private String parametro;

	@Override
	public void esegui(Partita partita) {
		IOConsole io = new IOConsole();
		StringBuilder s = new StringBuilder();
		s.append(partita.getGiocatore().getCfu());
		io.mostraMessaggio(partita.getStanzaCorrente().getDescrizione());
		io.mostraMessaggio(partita.getGiocatore().getBorsa().toString());
		io.mostraMessaggio(s.toString());
	}

	@Override
	public void setParametro(String parametro) {
		
	}

	@Override
	public String getParametro() {
		return this.parametro;
	}

	@Override
	public String getNome() {
		return "Comando guarda";
	}

}

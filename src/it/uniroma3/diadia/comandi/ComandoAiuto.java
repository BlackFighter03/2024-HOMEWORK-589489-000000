package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;

public class ComandoAiuto implements Comando {

	static final private String[] elencoComandi = { "vai", "prendi", "posa", "aiuto", "guarda", "fine" };
	
	private String comando;

	public ComandoAiuto() {
		this.comando = null;
	}
	
	/**
	 * Stampa informazioni di aiuto.
	 */
	@Override
	public void esegui(Partita partita) {
		IOConsole io = new IOConsole();
		String str = "";
		
		for (int i = 0; i < elencoComandi.length; i++)
			str = str + elencoComandi[i] + " ";
		io.mostraMessaggio(str);

	}

	@Override
	public void setParametro(String parametro) {
		this.comando = parametro;

	}

	@Override
	public String getParametro() {
		return this.comando;
	}

	@Override
	public String getNome() {
		return "Comando aiuto";
	}
	
}

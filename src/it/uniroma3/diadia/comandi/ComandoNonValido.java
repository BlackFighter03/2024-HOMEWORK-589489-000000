package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;

public class ComandoNonValido implements Comando {
	
	private String parametro;

	@Override
	public void esegui(Partita partita) {
		IO io = new IOConsole();
		io.mostraMessaggio("Comando sconosciuto");

	}

	@Override
	public void setParametro(String parametro) {
		this.parametro = parametro;
	}

	@Override
	public String getParametro() {
		return this.parametro;
	}

	@Override
	public String getNome() {
		return "Comando non valido";
	}
	
	

}

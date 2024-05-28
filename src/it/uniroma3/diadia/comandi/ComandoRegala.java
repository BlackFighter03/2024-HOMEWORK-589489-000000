package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.personaggi.Cane;
import it.uniroma3.diadia.personaggi.Mago;

public class ComandoRegala implements Comando {

	private final static String REGALA_COSA = "Cosa vuoi regalare?";
	
	private String nomeAttrezzo;
	
	public ComandoRegala(String nomeAttrezzo) {
		this.nomeAttrezzo = nomeAttrezzo;
	}
	
	public ComandoRegala() {
		this(null);
	}
	
	@Override
	public void esegui(Partita partita, IO io) {
		if(this.nomeAttrezzo == null) {
			io.mostraMessaggio(REGALA_COSA);
			return;
		}
		if(partita.getStanzaCorrente().getPersonaggio() == null)
			io.mostraMessaggio("Non c'è nessuno nella stanza");
		Attrezzo a = partita.getGiocatore().getBorsa().getAttrezzo(this.nomeAttrezzo);
		if(a == null) {
			io.mostraMessaggio("Attrezzo non presente in borsa");
		}else {
			
			partita.getGiocatore().getBorsa().removeAttrezzo(this.nomeAttrezzo);
			
			if(partita.getStanzaCorrente().getPersonaggio().getClass() == Cane.class)
				partita.getStanzaCorrente().addAttrezzo(partita.getStanzaCorrente().getPersonaggio().getAttrezzo());
			
			partita.getStanzaCorrente().getPersonaggio().riceviRegalo(a);
			
			if(partita.getStanzaCorrente().getPersonaggio().getClass() == Mago.class)
				partita.getStanzaCorrente().addAttrezzo(a);
		}

	}

	@Override
	public void setParametro(String parametro) {
		this.nomeAttrezzo = parametro;

	}

	@Override
	public String getParametro() {
		return this.nomeAttrezzo;
	}

	@Override
	public String getNome() {
		return "Comando regala";
	}

}

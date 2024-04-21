package it.uniroma3.diadia.ambienti;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaBuiaProtetta extends StanzaProtetta {

	public StanzaBuiaProtetta(String nome) {
		super(nome);
	}
	
	@Override
	public String getDescrizione() {
		StringBuilder descrizione = new StringBuilder("Qui c'è buio pesto!");
		
		//se la stanza contiene "Lanterna"
		String nomeAttrezzo = new String("lanterna");
		for (Attrezzo attrezzo : attrezzi) {
			if (attrezzo != null && attrezzo.getNome().equals(nomeAttrezzo))
			return this.toString();
		}
		//se la stanza non contiene "Lanterna"
		return descrizione.toString();
	}
}

package it.uniroma3.diadia.ambienti;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaBloccata extends Stanza{

	private String direzioneBloccata;
	private String attrezzoChiave;

	public StanzaBloccata (String nome, String direzioneBloccata, String attrezzoChiave) {
		super(nome);
		this.direzioneBloccata=direzioneBloccata;
		this.attrezzoChiave = attrezzoChiave;
	}

	@Override
	public Stanza getStanzaAdiacente(String direzione) {
		Stanza adiacente = null;
		// se la direzione non è bloccata oppure se hai l'oggetto chiave restituisci la stanza adiacente
		if( !(this.direzioneBloccata.equals(direzione)) || this.hasAttrezzo(attrezzoChiave) )
			adiacente = super.getStanzaAdiacente(direzione);
		//altrimenti la stanza risulta bloccata (restituisci il riferimento alla stanza corrente)
		else
			adiacente=this;

		return adiacente;
	}

	@Override
	public String toString() {
		StringBuilder risultato = new StringBuilder();
		String[] direzioni = this.getDirezioni();
		Attrezzo[] attrezzi = this.getAttrezzi();
		String nome = this.getNome();

		risultato.append(nome);
		risultato.append("\nUscite: ");
		for (String direzione : direzioni) {
			if (direzione != null)
				risultato.append("\n\t" + direzione);
			if(direzione.equals(this.direzioneBloccata))
				risultato.append(" (sembrerebbe bloccata)");
		}

		risultato.append("\nAttrezzi nella stanza: ");
		for (Attrezzo attrezzo : attrezzi) {
			if (attrezzo != null)
				risultato.append(attrezzo.toString() + " ");
		}
		return risultato.toString();
	}

}

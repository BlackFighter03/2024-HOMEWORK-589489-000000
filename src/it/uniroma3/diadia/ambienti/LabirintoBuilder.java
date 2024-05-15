package it.uniroma3.diadia.ambienti;

import java.util.ArrayList;
import java.util.List;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class LabirintoBuilder {
	
	private Labirinto labirinto;
	private List<Stanza> stanze;
	
	public LabirintoBuilder() {
		this.labirinto = new Labirinto();
		this.stanze = new ArrayList<Stanza>();
	}

	public Labirinto getLabirinto() {
		return this.labirinto;
	}
	
	public LabirintoBuilder addStanzaIniziale(String nomeStanza) {
		Stanza stanzaIniziale = new Stanza(nomeStanza);
		this.labirinto.setStanzaIniziale(stanzaIniziale);
		this.stanze.add(stanzaIniziale);
		return this;
	}
	
	public LabirintoBuilder addStanzaVincente(String nomeStanza) {
		Stanza stanzaVincente = new Stanza(nomeStanza);
		this.labirinto.setStanzaVincente(stanzaVincente);
		this.stanze.add(stanzaVincente);
		return this;
	}
	
	public LabirintoBuilder addAdiacenza(String s1, String s2, String direzione) {
		Stanza stanza1 = null;
		Stanza stanza2 = null;
		for(Stanza s : this.stanze) {
			if(s.getNome().equals(s1))
				stanza1 = s;
			else if(s.getNome().equals(s2))
				stanza2 = s;
		}
		if(direzione.equals("sud") || direzione.equals("nord") || direzione.equals("ovest") || direzione.equals("est"))
			stanza1.impostaStanzaAdiacente(direzione, stanza2);
		return this;
	}
	
	public LabirintoBuilder addAttrezzo(String nomeAttrezzo, int peso) {
		if(nomeAttrezzo == null)
			return this;
		Attrezzo a = new Attrezzo(nomeAttrezzo, peso);
		Stanza s = this.stanze.get(this.stanze.size()-1);
		s.addAttrezzo(a);
		return this;
	}

	public LabirintoBuilder addStanza(String nomeStanza) {
		if(this.stanze.contains(new Stanza(nomeStanza)))
			return this;
		this.stanze.add(new Stanza(nomeStanza));
		return this;
	}

	public LabirintoBuilder addStanzaMagica(String nomeStanzaMagica, int sogliaMagica) {
		if(this.stanze.contains(new Stanza(nomeStanzaMagica)))
			return this;
		this.stanze.add(new StanzaMagica(nomeStanzaMagica, sogliaMagica));
		return this;
	}

	public LabirintoBuilder addStanzaBloccata(String nomeStanzaBloccata, String direzione, String chiave) {
		if(this.stanze.contains(new Stanza(nomeStanzaBloccata)))
			return this;
		this.stanze.add(new StanzaBloccata(nomeStanzaBloccata, direzione, chiave));
		return this;
	}

	public List<Stanza> getListaStanze() {
		return this.stanze;
	}

	public LabirintoBuilder addStanzaBuia(String nomeStanzaBuia, String chiave) {
		if(this.stanze.contains(new Stanza(nomeStanzaBuia)))
			return this;
		this.stanze.add(new StanzaBuia(nomeStanzaBuia, chiave));
		return this;
	}
}

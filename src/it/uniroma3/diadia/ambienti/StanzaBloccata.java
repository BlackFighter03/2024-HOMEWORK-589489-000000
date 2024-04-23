package it.uniroma3.diadia.ambienti;

public class StanzaBloccata extends Stanza {

	private String direzioneBloccata;
	private String chiave;
	
	public StanzaBloccata(String nome, String direzioneBloccata, String chiave) {
		super(nome);
		this.chiave = chiave;
		this.direzioneBloccata = direzioneBloccata;
		
	}

	public String getDirezioneBloccata() {
		return direzioneBloccata;
	}

	public void setDirezioneBloccata(String direzioneBloccata) {
		this.direzioneBloccata = direzioneBloccata;
	}

	public String getChiave() {
		return chiave;
	}

	public void setChiave(String chiave) {
		this.chiave = chiave;
	}
	
	@Override
	public Stanza getStanzaAdiacente(String direzione) {
		if(this.hasAttrezzo(this.chiave))
			return super.getStanzaAdiacente(direzione);
		else
			return this;
	}
	
	@Override
	public String getDescrizione() {
		String s = super.getDescrizione();
		if(!this.hasAttrezzo(this.chiave))
			s = s + '\n' + "La direzione " + this.direzioneBloccata + " è bloccata." + '\n' + "Posa l'attrezzo giusto per sbloccarla";
		else
			s = s + '\n' + "La direzione " + this.direzioneBloccata + " è sbloccata.";
		
		return s;
	}
}

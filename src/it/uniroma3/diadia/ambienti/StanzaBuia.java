package it.uniroma3.diadia.ambienti;

public class StanzaBuia extends Stanza{

	private String nomeAttrezzoLuce;
	
	public StanzaBuia(String nomeStanza, String nomeLuce) {
		super(nomeLuce);
		 nomeAttrezzoLuce = nomeLuce;
	}
	
	@Override
	public String getDescrizione() {
		String descrizione;
		if(this.hasAttrezzo(nomeAttrezzoLuce)) {
			descrizione = super.getDescrizione();
		}
		else {
			descrizione = new String("Qui c'è buio pesto");
		}
		return descrizione;
	}
}

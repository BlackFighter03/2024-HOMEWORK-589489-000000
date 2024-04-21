package it.uniroma3.diadia.ambienti;

public class StanzaBuia extends Stanza{

	private String nomeLuce;
	
	public StanzaBuia(String nomeStanza, String nomeLuce) {
		super(nomeLuce);
		 this.nomeLuce = nomeLuce;
	}
	
	@Override
	public String getDescrizione() {
		String descrizione;
		if(this.hasAttrezzo(this.nomeLuce)) {
			descrizione = super.getDescrizione();
		}
		else {
			descrizione = new String("Qui c'è buio pesto");
		}
		return descrizione;
	}
}

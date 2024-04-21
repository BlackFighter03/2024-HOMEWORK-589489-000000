package it.uniroma3.diadia.ambienti;

public class StanzaBuia extends Stanza{

	private static String NOME_ATTREZZO_LUCE;
	
	public StanzaBuia(String nomeStanza, String nomeLuce) {
		super(nomeLuce);
		 NOME_ATTREZZO_LUCE = nomeLuce;
	}
	
	@Override
	public String getDescrizione() {
		String descrizione;
		if(this.hasAttrezzo(NOME_ATTREZZO_LUCE)) {
			descrizione = super.getDescrizione();
		}
		else {
			descrizione = new String("Qui c'è buio pesto");
		}
		return descrizione;
	}
}

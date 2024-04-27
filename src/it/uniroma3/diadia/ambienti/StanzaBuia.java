package it.uniroma3.diadia.ambienti;

public class StanzaBuia extends Stanza {

	private String attrezzoChiave;
	
	public StanzaBuia(String nome, String attrezzoChiave) {
		super(nome);
		this.attrezzoChiave = attrezzoChiave;
	}
	
	@Override
	
	public String getDescrizione() {
		if(this.hasAttrezzo(this.attrezzoChiave))
			return super.getDescrizione();
		else
			return "qui c'è un buio pesto";
	}
}

package it.uniroma3.diadia.ambienti;

public class StanzaBuia extends Stanza {

	private String attrezzoChiave;

	public StanzaBuia(String nome, String attrezzoChiave) {
		super(nome);
		this.attrezzoChiave = attrezzoChiave;
	}
	
	public String getChiave() {
		return this.attrezzoChiave;
	}

	@Override

	public String getDescrizione() {
		if (this.hasAttrezzo(this.attrezzoChiave))
			return super.getDescrizione();
		else
			return "qui c'è un buio pesto";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || this.getClass() != obj.getClass())
			return false;
		StanzaBuia that = (StanzaBuia) obj;
		return super.equals(obj) && this.attrezzoChiave.equals(that.getChiave());
	}
	
	@Override
	public int hashCode() {
		return super.hashCode() + this.attrezzoChiave.hashCode();
	}
}

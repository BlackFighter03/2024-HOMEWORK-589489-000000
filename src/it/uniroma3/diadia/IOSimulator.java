package it.uniroma3.diadia;

public class IOSimulator implements IO {
	
	private int	numeroRighelette;
	private String[] sequenzaComandi;
	
	
	public IOSimulator(String ... sequenzaComandi) {
		this.numeroRighelette = 0;
		this.sequenzaComandi = sequenzaComandi;
	}

	@Override
	public void mostraMessaggio(String messaggio) {
		System.out.println(messaggio);
	}

	@Override
	public String leggiRiga() {
		if(this.numeroRighelette == this.sequenzaComandi.length)
			return "Superati numero di comandi automatici";
		else
			this.mostraMessaggio(this.sequenzaComandi[this.numeroRighelette]);
		return this.sequenzaComandi[this.numeroRighelette++];
		
	}

}

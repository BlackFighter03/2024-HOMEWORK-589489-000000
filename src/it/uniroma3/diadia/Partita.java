package it.uniroma3.diadia;
import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.giocatore.Giocatore;

/**
 * Questa classe modella una partita del gioco
 *
 * @author  docente di POO e 589489 e 589300
 * @see Stanza
 * @version v1.0
 */

public class Partita {

	private Labirinto labirinto;
	private Giocatore giocatore;
	private boolean finita;
	
	public Partita(){
		this.labirinto = new Labirinto();
		this.giocatore = new Giocatore();
		this.finita = false;
	}

	/**
	 * Restituisce il labirinto
	 * @return labirinto
	 * 
	 */
	public Labirinto getLabirinto() {
		return this.labirinto;
	}
	
	/**
	 * Restituisce il giocatore
	 * @return giocatore
	 */
	public Giocatore getGiocatore() {
		return this.giocatore;
	}
	
	/**
	 * Restituisce vero se e solo se la partita e' stata vinta
	 * @return vero se partita vinta
	 */
	public boolean vinta() {
		return this.labirinto.getStanzaCorrente()== this.labirinto.getStanzaVincente();
	}

	/**
	 * Restituisce vero se e solo se la partita e' finita
	 * @return vero se partita finita
	 */
	public boolean isFinita() {
		return finita || vinta() || (this.giocatore.getCfu() == 0);
	}

	/**
	 * Imposta la partita come finita
	 *
	 */
	public void setFinita() {
		this.finita = true;
	}
}

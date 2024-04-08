package it.uniroma3.diadia;


import java.util.Scanner;

/**
 * Questa classe modella un comando.
 * Un comando consiste al piu' di due parole:
 * il nome del comando ed un parametro
 * su cui si applica il comando.
 * (Ad es. alla riga digitata dall'utente "vai nord"
 *  corrisponde un comando di nome "vai" e parametro "nord").
 *
 * @author  docente di POO e 589489 e 589300
 * @version v1.0
 */

public class Comando {

	private String nome;
	private String parametro;

	public Comando(String istruzione) {
		if(istruzione.equals("")) {
			this.nome="";
			this.parametro=null;
		} else {
			Scanner scannerDiParole = new Scanner(istruzione);
			// prima parola: nome del comando
			if (scannerDiParole.hasNext())
				this.nome = scannerDiParole.next(); 

			// seconda parola: eventuale parametro
			if (scannerDiParole.hasNext())
				this.parametro = scannerDiParole.next();
		}
	}

	public String getNome() {
		return this.nome;
	}

	public String getParametro() {
		return this.parametro;
	}

	public boolean sconosciuto() {
		return (this.nome == null);
	}
}
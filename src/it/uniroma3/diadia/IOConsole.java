package it.uniroma3.diadia;
import java.util.Scanner;

/**
 * Classe che si occupa di gestire le interazioni I/O
 * 
 * @author Alessio e Davide
 * 
 */

public class IOConsole {
	
public void mostraMessaggio(String msg) {
System.out.println(msg);
}

public String leggiRiga() {
Scanner scannerDiLinee = new Scanner(System.in);
String riga = scannerDiLinee.nextLine();
//scannerDiLinee.close();
return riga;
}
}

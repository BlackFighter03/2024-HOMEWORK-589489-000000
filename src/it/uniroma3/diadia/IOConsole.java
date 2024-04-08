package it.uniroma3.diadia;
import java.util.Scanner;

/**
 * Classe che si occupa di gestire le interazioni I/O
 * 
 * @author 589489 e 589300
 * 
 * @version v1.0
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

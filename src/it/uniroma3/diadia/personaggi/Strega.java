package it.uniroma3.diadia.personaggi;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class Strega extends AbstractPersonaggio {

	public Strega(String nome, String presentaz) {
		super(nome, presentaz, null);
	}

	private static final String MESSAGGIO_DONO = "Che gentile che sei! " +
			"con una mia magica azione, ti trasferirò nella stanza adiacente con più attrezzi";
	
	private static final String MESSAGGIO_SCUSE = "Mi spiace, ma non mi hai salutata, ora ti trasferisco "
			+ " nella stanza adiacente con meno attrezzi...";
	
	
	@Override
	public String agisci(Partita partita) {
		Map<String, Stanza> m = partita.getStanzaCorrente().getMapStanzeAdiacenti();
		Set<String> keys = m.keySet();
		if(haSalutato()) {
			String maxKey = null;
			int max = new ArrayList<Stanza>(m.values()).get(0).getAttrezzi().size();
			for(String s : keys)
				if(max < m.get(s).getAttrezzi().size()) {
					max = m.get(s).getAttrezzi().size();
					maxKey = s;
				}
			partita.setStanzaCorrente(m.get(maxKey));
			return MESSAGGIO_DONO;
		}else{
			String minKey = null;
			int min = new ArrayList<Stanza>(m.values()).get(0).getAttrezzi().size();
			for(String s : keys)
				if(min > m.get(s).getAttrezzi().size()) {
					min = m.get(s).getAttrezzi().size();
					minKey = s;
				}
			partita.setStanzaCorrente(m.get(minKey));
			return MESSAGGIO_SCUSE;
		}
	}


	@Override
	public String riceviRegalo(Attrezzo a) {
		this.setAttrezzo(a);
		return "Grazie del regalo...ahahahahahah";
	}

}

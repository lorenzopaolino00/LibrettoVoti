package model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto() {
		this.voti = new ArrayList<Voto>();
	}

	public void add(Voto v) {
		this.voti.add(v);
	}

	@Override
	public String toString() {
		return this.voti.toString();
	}
	
	public Libretto filtraPunti (int punti) {
		punti = 25;
		Libretto l = new Libretto();
		for(Voto v: this.voti) {
			if(v.getPunti() == punti) {
				l.add(v);
			}
		}
		return l;
	}
	
	public int cercaNome (String s) {
		for(Voto v: this.voti) {
			if(v.getNomeCorso().compareTo(s) == 0) {
				return v.getPunti();
			}
		}
		throw new IllegalArgumentException("Corso non trovato");
	}
	
	
	
}

package banque.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CompteEpargne extends Compte{

	
	private static final long serialVersionUID = 1L;

	private int tauxInteret;
	
	public CompteEpargne(){
		super();
	}

	public int getTauxInteret() {
		return tauxInteret;
	}
	public void setTauxInteret(int tauxInteret) {
		this.tauxInteret = tauxInteret;
	}
	
	
}

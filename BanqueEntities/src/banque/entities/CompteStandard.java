package banque.entities;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CompteStandard extends Compte{
	
	
	private static final long serialVersionUID = 1L;

	private int penalite;
	
	public CompteStandard(){
		super();
	}

	
	public int getPenalite(){
		return penalite;
	}
	public void setPenalite(int penalite){
		this.penalite=penalite;
	}
	
}

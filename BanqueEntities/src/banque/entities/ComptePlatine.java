package banque.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class ComptePlatine extends Compte{

	
	private static final long serialVersionUID = 1L;
	
	private int autorisationDecouvert;
	
	public ComptePlatine(){
		super();
	}

	public int getAutorisationDecouvert() {
		return autorisationDecouvert;
	}
	public void setAutorisationDecouvert(int autorisationDecouvert) {
		this.autorisationDecouvert = autorisationDecouvert;
	}

	
}

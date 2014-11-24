package banque.beans;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class GestionCompte
 */
@Stateful
@LocalBean
public class GestionCompte implements GestionCompteRemote, GestionCompteLocal {

    /**
     * Default constructor. 
     */
    public GestionCompte() {
        // TODO Auto-generated constructor stub
    }

}

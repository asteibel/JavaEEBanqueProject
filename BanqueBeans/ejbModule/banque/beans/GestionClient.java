package banque.beans;

import java.util.List;
import java.util.Vector;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import banque.entities.Client;
import banque.entities.Compte;

/**
 * Session Bean implementation class GestionClient
 */
@Stateful
@LocalBean
public class GestionClient implements GestionClientRemote, GestionClientLocal {

	@PersistenceContext
	EntityManager em;
	
	Vector<Compte> comptes = new Vector<Compte>();
	
    /**
     * Default constructor. 
     */
    public GestionClient() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Client ajouterClient(Client client) {
		// TODO Auto-generated method stub
		em.persist(client);
		return client;
	}

	@Override
	public List<Client> getListeClients() {
		// TODO Auto-generated method stub
		return em.createQuery("Select c from Client c").getResultList();
	}

	@Override
	public void retirerClient(Client client) {
		// TODO Auto-generated method stub
		client = em.find(Client.class, client.getId());
		em.remove(client);
	}

	@Override
	public Client findClient(String login) {
		// TODO Auto-generated method stub
		return em.find(Client.class, login);
	}

	@Override
	public void modifierClient(Client client) throws ClientInconnu{
		// TODO Auto-generated method stub
		client = em.find(Client.class, client.getId());
		if(client!=null)
			em.merge(client);
		else throw new ClientInconnu();
	}

	@Override
	public void ajouterCompte(Compte compte) {
		// TODO Auto-generated method stub
		comptes.add(compte);
	}

	

}

package banque.beans;

import java.util.List;

import javax.ejb.Remote;

import banque.entities.Client;
import banque.entities.Compte;


@Remote
public interface GestionClientRemote {

	Client ajouterClient(Client client);
	
	public List<Client> getListeClients();
	
	public void retirerClient(Client client);
	
	public Client findClient(String login);
	
	public void modifierClient(Client client) throws ClientInconnu;
	
	public void ajouterCompte(Compte compte);
	
}

package banque.entities;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.*;

@Entity
public class Compte implements Serializable{

	
	
	@Id
	private int id;
	private static final long serialVersionUID = 1L;
	
	private int montant;
	private ArrayList<String> historique;
	
	@ManyToOne
	private Client client;
	
	public Compte(){
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMontant() {
		return montant;
	}
	public void setMontant(int montant) {
		this.montant = montant;
	}
	public ArrayList<String> getHistorique() {
		return historique;
	}
	public void setHistorique(ArrayList<String> historique) {
		this.historique = historique;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
}

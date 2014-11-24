package banque.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity : Client
 * @author Audric
 *
 */
@Entity
public class Client implements Serializable{
	
	
	@Id
	private int id;
	
	private String login;
	private String password;
	
	@OneToMany(fetch=FetchType.EAGER,cascade={CascadeType.REMOVE},mappedBy="client")
	private List<Compte> comptes = new ArrayList<Compte>();
	
	
	private static final long serialVersionUID = 981116099116205548L;
	
	
	public Client(){
		super();
	}
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getLogin(){
		return login;
	}
	public void setLogin(String login){
		this.login=login;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public List<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
	
}

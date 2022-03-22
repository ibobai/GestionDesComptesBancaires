package fr.gestion.comptes.bancaires.dao.interfaces;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.modelmapper.ModelMapper;

import fr.gestion.comptes.bancaires.obj.ClientObj;
import fr.gestion.comptes.bancaires.pojos.Client;

public interface ClientDAO {

	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionDesComptesBancaires");
	static EntityManager em = emf.createEntityManager();
	
	ModelMapper modelMapper = new ModelMapper();

	
	public ClientObj getClientById(Integer id);
	public List getClients();
	public ClientObj updateClient(Integer  id);
	public ClientObj deleteClient(Integer id);
	public ClientObj createClient(Client c);
	

}

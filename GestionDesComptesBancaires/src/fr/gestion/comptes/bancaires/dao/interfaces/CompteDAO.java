package fr.gestion.comptes.bancaires.dao.interfaces;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.modelmapper.ModelMapper;

import antlr.collections.List;
import fr.gestion.comptes.bancaires.obj.CompteObj;
import fr.gestion.comptes.bancaires.pojos.Compte;

public interface CompteDAO {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionDesComptesBancaires");
	static EntityManager em = emf.createEntityManager();
	
	ModelMapper modelMapper = new ModelMapper();
	
	public CompteObj getClientById(Integer id);
	public List getTransferts();
	public  CompteObj updateCompte(Integer  id);
	public CompteObj deleteCompte(Integer id);
	public CompteObj createCompte(Compte c);

}

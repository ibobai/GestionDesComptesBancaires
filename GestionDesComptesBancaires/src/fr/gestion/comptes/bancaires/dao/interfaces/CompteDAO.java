package fr.gestion.comptes.bancaires.dao.interfaces;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

import org.modelmapper.ModelMapper;
import fr.gestion.comptes.bancaires.obj.CompteObj;
import fr.gestion.comptes.bancaires.pojos.Compte;

public interface CompteDAO {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionDesComptesBancaires");
	static EntityManager em = emf.createEntityManager();
	
	ModelMapper modelMapper = new ModelMapper();
	
	public CompteObj getCompteById(Integer id);
	
	public List getCompte();
	
	public CompteObj deleteCompte(Integer id);

	public CompteObj updateCompte(Integer id, int Change, String indic);

	public void createCompte(Compte c);

}

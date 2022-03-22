package fr.gestion.comptes.bancaires.dao.interfaces;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.modelmapper.ModelMapper;

import antlr.collections.List;
import fr.gestion.comptes.bancaires.obj.CompteepaObj;
import fr.gestion.comptes.bancaires.pojos.Compteepa;

public interface CompteepaDAO {
	
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionDesComptesBancaires");
	static EntityManager em = emf.createEntityManager();
	
	ModelMapper modelMapper = new ModelMapper();
	
	public CompteepaObj getComptecousByCompteId(Integer id);
	public List getCompteepa();
	public  CompteepaObj updateCompteepaByCompteId(Integer  id);
	public CompteepaObj deleteCompteepaByCompteId(Integer id);
	public CompteepaObj createCompteepaByCompteId(Integer id);
}

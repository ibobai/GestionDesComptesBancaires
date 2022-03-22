package fr.gestion.comptes.bancaires.dao.interfaces;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.modelmapper.ModelMapper;

import fr.gestion.comptes.bancaires.obj.ComptecousObj;

public interface ComptecousDAO {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionDesComptesBancaires");
	static EntityManager em = emf.createEntityManager();
	
	ModelMapper modelMapper = new ModelMapper();
	
	public ComptecousObj getComptecousByCompteId(Integer id);
	public List getComptecous();
	public  ComptecousObj updateComptecousByCompteId(Integer  id);
	public ComptecousObj deleteComptecousByCompteId(Integer id);
	public ComptecousObj createComptecousByCompteId(Integer id);
}

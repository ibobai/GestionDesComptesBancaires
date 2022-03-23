package fr.gestion.comptes.bancaires.daos.implement;

import java.util.List;
import fr.gestion.comptes.bancaires.dao.interfaces.CompteDAO;
import fr.gestion.comptes.bancaires.obj.CompteObj;
import fr.gestion.comptes.bancaires.pojos.Client;
import fr.gestion.comptes.bancaires.pojos.Compte;

public class CompteImplement implements CompteDAO {

	@Override
	public CompteObj getCompteById(Integer id) {
		Compte c = em.find(Compte.class, id);	
		CompteObj cc = modelMapper.map(c, CompteObj.class);   //ON appelle la fonction de mapping pour mapper de Client vers clientObj
		return cc;	
	}

	@Override
	public List getCompte() {
		List<Compte> lc =  em.createQuery("From Compte", Compte.class).getResultList();
		return lc;
	}

	@Override
	public CompteObj updateCompte(Integer id, int Change, String indic){
		Compte c = em.find(Compte.class, id);	
		CompteObj cc = modelMapper.map(c, CompteObj.class); 
		if (indic=="S") {
			cc.setSolde(Change);
		}
		em.persist(cc);	
		return cc;
	}

	@Override
	public CompteObj deleteCompte(Integer id) {
		try {
			//em.createQuery("DELETE from Client WHERE clientID ="+id);
			
			Compte c = em.find(Compte.class, id);

			  em.getTransaction().begin();
			  em.remove(c);
			  em.getTransaction().commit();
			
			System.out.println("Compte has been deleted");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Compte has not  been deleted "+e);
		}
		return null;
	}

	@Override
	public void createCompte(Compte c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
	}


}

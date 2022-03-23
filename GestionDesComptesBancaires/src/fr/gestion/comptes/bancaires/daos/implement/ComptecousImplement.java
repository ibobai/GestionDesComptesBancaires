package fr.gestion.comptes.bancaires.daos.implement;

import java.util.Arrays;
import java.util.List;

import javax.persistence.TypedQuery;

import fr.gestion.comptes.bancaires.dao.interfaces.ComptecousDAO;
import fr.gestion.comptes.bancaires.obj.ComptecousObj;
import fr.gestion.comptes.bancaires.pojos.Comptecous;

public class ComptecousImplement implements ComptecousDAO {

	@Override
	public ComptecousObj getComptecousByCompteId(Integer id) {
		//Comptecous c = em.find(Comptecous.class, id);
		
		Object cc = em.createQuery("SELECT b FROM Comptecous b WHERE b.compteID = "+id);
		//ComptecousObj cc = modelMapper.map(c, ComptecousObj.class);   //ON appelle la fonction de mapping pour mapper de Client vers clientObj
		TypedQuery<Comptecous> q = em.createQuery("SELECT b FROM Comptecous b WHERE b.compteID = "+id, Comptecous.class); 
		List<Comptecous> res = q.getResultList();
		 for (Comptecous str : res)
	      { 		      
	           System.out.println(str.getCompteCouID() + " This is the id of the comptC"); 		
	      }
		ComptecousObj ccc = new ComptecousObj();
		return  ccc;
	}

	@Override
	public List getComptecous() {
		List<Comptecous> lc =  em.createQuery("From Comptecous", Comptecous.class).getResultList();
		return lc;
	}
	
	

	@Override
	public ComptecousObj updateComptecousByCompteId(Integer id, int Change, String indic) {
		Comptecous c = em.find(Comptecous.class, id);
		ComptecousObj cc = modelMapper.map(c, ComptecousObj.class); 
		
		if (indic=="FT") {
			cc.setFraisTrans(Change);
		}
		else if (indic=="SM") {
			cc.setSoldeMin(Change);
		}
		
		em.persist(cc); // sauvegarder l objet dans la base de donn�e
		return cc;
	}  

	@Override
	public ComptecousObj deleteComptecousByCompteId(Integer id){
		try {
			//em.createQuery("DELETE from Client WHERE clientID ="+id);
			
			Comptecous c = em.find(Comptecous.class, id);

			  em.getTransaction().begin();
			  em.remove(c);
			  em.getTransaction().commit();
			
			System.out.println("Comptecous has been deleted");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Comptecous has not  been deleted "+e);

		}
		return null;
	}

	public void createComptecous(ComptecousObj co) {
		em.persist(co);
	}


}

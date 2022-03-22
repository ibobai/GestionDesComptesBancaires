package fr.gestion.comptes.bancaires.daos.implement;

import java.util.List;
import fr.gestion.comptes.bancaires.dao.interfaces.ComptecousDAO;
import fr.gestion.comptes.bancaires.obj.ClientObj;
import fr.gestion.comptes.bancaires.obj.ComptecousObj;
import fr.gestion.comptes.bancaires.pojos.Client;
import fr.gestion.comptes.bancaires.pojos.Comptecous;

public class ComptecousImplement implements ComptecousDAO {

	@Override
	public ComptecousObj getComptecousByCompteId(Integer id) {
		Comptecous c = em.find(Comptecous.class, id);
		ComptecousObj cc = modelMapper.map(c, ComptecousObj.class);   //ON appelle la fonction de mapping pour mapper de Client vers clientObj
		return cc;
	}

	@Override
	public List getComptecous() {
		List<Comptecous> lc =  em.createQuery("From Comptecous", Comptecous.class).getResultList();
//		for(Client c : lc) {
//			System.out.println(c.getNom());
//		}
		return lc;
	}
	
	/*

	@Override
	public ComptecousObj updateComptecousByCompteId(Integer  id) {
		
		Client c = em.find(Client.class, id);
		ClientObj cc = modelMapper.map(c, ClientObj.class); 
		
		if (indic=="N") {
			cc.setNom(Change);
		}
		else if (indic=="P") {
			cc.setPrenom(Change);
		}
        else if (indic=="T") {
        	cc.setTel(Change);
		}
        else if (indic=="A") {
        	cc.setAdresse(Change);
		}
        else if (indic=="E") {
        	cc.setEmail(Change);
		}
		
		em.persist(cc); // sauvegarder l objet dans la base de donnée
		return cc;
	}  */

	@Override
	public ComptecousObj deleteComptecousByCompteId(Integer id){
		try {
			//em.createQuery("DELETE from Client WHERE clientID ="+id);
			
			Client c = em.find(Client.class, id);

			  em.getTransaction().begin();
			  em.remove(c);
			  em.getTransaction().commit();
			
			System.out.println("Client has been deleted");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Client has not  been deleted "+e);

		}
		return null;
	}

	public void createClient(ClientObj co) {
		em.persist(co);
	}

	@Override
	public void createComptecous(ComptecousObj co) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ComptecousObj updateComptecousByCompteId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	

}

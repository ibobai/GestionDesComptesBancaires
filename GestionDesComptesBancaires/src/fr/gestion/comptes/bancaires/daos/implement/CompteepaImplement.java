package fr.gestion.comptes.bancaires.daos.implement;

import java.util.List;
import fr.gestion.comptes.bancaires.dao.interfaces.CompteepaDAO;
import fr.gestion.comptes.bancaires.obj.CompteepaObj;
import fr.gestion.comptes.bancaires.pojos.Compteepa;

public class CompteepaImplement implements CompteepaDAO {

	public CompteepaObj getCompteepaByCompteId(Integer id) {
		Compteepa c = em.find(Compteepa.class, id);
		CompteepaObj cc = modelMapper.map(c, CompteepaObj.class);   //ON appelle la fonction de mapping pour mapper de Client vers clientObj
		return cc;
	}

	@Override
	public List getCompteepa() {
		List<Compteepa> lc =  em.createQuery("From Compteepa", Compteepa.class).getResultList();
		return lc;
	}
	
	

	@Override
	public CompteepaObj updateCompteepaByCompteId(Integer id, int Change, String indic) {
		Compteepa c = em.find(Compteepa.class, id);
		CompteepaObj cc = modelMapper.map(c, CompteepaObj.class); 
		
		if (indic=="TI") {
			cc.setTauxInteret(Change);
		}
		else if (indic=="P") {
			cc.setPlafond(Change);		}
		
		em.persist(cc); // sauvegarder l objet dans la base de donnée
		return cc;
	}  

	@Override
	public CompteepaObj deleteCompteepaObjByCompteId(Integer id){
		try {
			//em.createQuery("DELETE from Client WHERE clientID ="+id);
			
			Compteepa c = em.find(Compteepa.class, id);

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

	public void createCompteepa(CompteepaObj co) {
		em.persist(co);
	}


}

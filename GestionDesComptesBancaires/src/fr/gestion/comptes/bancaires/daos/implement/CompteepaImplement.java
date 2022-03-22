package fr.gestion.comptes.bancaires.daos.implement;

import antlr.collections.List;
import fr.gestion.comptes.bancaires.dao.interfaces.CompteepaDAO;
import fr.gestion.comptes.bancaires.obj.ComptecousObj;
import fr.gestion.comptes.bancaires.obj.CompteepaObj;
import fr.gestion.comptes.bancaires.pojos.Comptecous;
import fr.gestion.comptes.bancaires.pojos.Compteepa;

public class CompteepaImplement implements CompteepaDAO {

	@Override
	public CompteepaObj getComptecousByCompteId(Integer id) {
		Compteepa c = em.find(Compteepa.class, id);	
		CompteepaObj cc = modelMapper.map(c, CompteepaObj.class);   //ON appelle la fonction de mapping pour mapper de Client vers clientObj
		return cc;
	}

	@Override
	public List getCompteepa() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompteepaObj updateCompteepaByCompteId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompteepaObj deleteCompteepaByCompteId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompteepaObj createCompteepaByCompteId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

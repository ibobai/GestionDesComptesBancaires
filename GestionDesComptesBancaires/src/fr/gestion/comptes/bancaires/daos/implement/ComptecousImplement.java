package fr.gestion.comptes.bancaires.daos.implement;

import java.util.List;
import fr.gestion.comptes.bancaires.dao.interfaces.ComptecousDAO;
import fr.gestion.comptes.bancaires.obj.ComptecousObj;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComptecousObj updateComptecousByCompteId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComptecousObj deleteComptecousByCompteId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComptecousObj createComptecousByCompteId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}

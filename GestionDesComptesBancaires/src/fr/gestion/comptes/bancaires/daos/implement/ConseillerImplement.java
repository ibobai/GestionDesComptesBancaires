package fr.gestion.comptes.bancaires.daos.implement;

import antlr.collections.List;
import fr.gestion.comptes.bancaires.dao.interfaces.ConseillerDAO;
import fr.gestion.comptes.bancaires.obj.CompteepaObj;
import fr.gestion.comptes.bancaires.obj.ConseillerObj;
import fr.gestion.comptes.bancaires.pojos.Compteepa;
import fr.gestion.comptes.bancaires.pojos.Conseiller;

public class ConseillerImplement implements ConseillerDAO {

	@Override
	public ConseillerObj getClientById(Integer id) {
		Conseiller c = em.find(Conseiller.class, id);	
		ConseillerObj cc = modelMapper.map(c, ConseillerObj.class);   //ON appelle la fonction de mapping pour mapper de Client vers clientObj
		return cc;
	}

	@Override
	public List getTransferts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConseillerObj updateConseiller(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConseillerObj deleteConseiller(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConseillerObj createConseiller() {
		// TODO Auto-generated method stub
		return null;
	}

	

}

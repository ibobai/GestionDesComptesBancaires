package fr.gestion.comptes.bancaires.daos.implement;

import antlr.collections.List;
import fr.gestion.comptes.bancaires.dao.interfaces.TransfertDAO;
import fr.gestion.comptes.bancaires.obj.ConseillerObj;
import fr.gestion.comptes.bancaires.obj.TransfertObj;
import fr.gestion.comptes.bancaires.pojos.Conseiller;
import fr.gestion.comptes.bancaires.pojos.Transfert;

public class TransfertImplement implements TransfertDAO {

	@Override
	public TransfertObj getClientById(Integer id) {
		Transfert c = em.find(Transfert.class, id);	
		TransfertObj cc = modelMapper.map(c, TransfertObj.class);   //ON appelle la fonction de mapping pour mapper de Client vers clientObj
		return cc;
	}

	@Override
	public List getTransferts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransfertObj updateTransfert(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransfertObj deleteTransfert(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransfertObj createTransfert() {
		// TODO Auto-generated method stub
		return null;
	}

}

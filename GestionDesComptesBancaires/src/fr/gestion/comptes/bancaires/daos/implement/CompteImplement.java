package fr.gestion.comptes.bancaires.daos.implement;

import antlr.collections.List;
import fr.gestion.comptes.bancaires.dao.interfaces.CompteDAO;
import fr.gestion.comptes.bancaires.obj.CompteObj;
import fr.gestion.comptes.bancaires.obj.CompteepaObj;
import fr.gestion.comptes.bancaires.pojos.Compte;
import fr.gestion.comptes.bancaires.pojos.Compteepa;

public class CompteImplement implements CompteDAO {

	@Override
	public CompteObj getClientById(Integer id) {
		Compte c = em.find(Compte.class, id);	
		CompteObj cc = modelMapper.map(c, CompteObj.class);   //ON appelle la fonction de mapping pour mapper de Client vers clientObj
		return cc;	
	}

	@Override
	public List getTransferts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompteObj updateCompte(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompteObj deleteCompte(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompteObj createCompte(Compte c) {
		// TODO Auto-generated method stub
		return null;
	}


}

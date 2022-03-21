package fr.gestion.comptes.bancaires.dao.interfaces;

import antlr.collections.List;
import fr.gestion.comptes.bancaires.daos.Comptecous;

public interface ComptecousDAO {
	
	public Comptecous getComptecousByCompteId(Integer id);
	public List getComptecous();
	public  Comptecous updateComptecousByCompteId(Integer  id);
	public Comptecous deleteComptecousByCompteId(Integer id);
	public Comptecous createComptecousByCompteId(Integer id);
}

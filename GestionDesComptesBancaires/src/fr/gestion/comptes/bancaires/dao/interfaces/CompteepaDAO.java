package fr.gestion.comptes.bancaires.dao.interfaces;

import antlr.collections.List;
import fr.gestion.comptes.bancaires.daos.Compteepa;

public interface CompteepaDAO {
	public Compteepa getComptecousByCompteId(Integer id);
	public List getCompteepa();
	public  Compteepa updateCompteepaByCompteId(Integer  id);
	public Compteepa deleteCompteepaByCompteId(Integer id);
	public Compteepa createCompteepaByCompteId(Integer id);
}

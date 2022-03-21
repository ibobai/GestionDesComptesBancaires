package fr.gestion.comptes.bancaires.dao.interfaces;

import antlr.collections.List;
import fr.gestion.comptes.bancaires.daos.Compte;

public interface CompteDAO {
	public Compte getClientById(Integer id);
	public List getTransferts();
	public  Compte updateCompte(Integer  id);
	public Compte deleteCompte(Integer id);
	public Compte createCompte();

}

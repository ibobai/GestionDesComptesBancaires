package fr.gestion.comptes.bancaires.dao.interfaces;

import antlr.collections.List;
import fr.gestion.comptes.bancaires.daos.Conseiller;


public interface ConseillerDAO {
	public Conseiller getClientById(Integer id);
	public List getTransferts();
	public  Conseiller updateConseiller(Integer  id);
	public Conseiller deleteConseiller(Integer id);
	public Conseiller createConseiller();
}

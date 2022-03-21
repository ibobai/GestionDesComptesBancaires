package fr.gestion.comptes.bancaires.dao.interfaces;

import antlr.collections.List;
import fr.gestion.comptes.bancaires.daos.Transfert;

public interface TransfertDAO {
	public Transfert getClientById(Integer id);
	public List getTransferts();
	public  Transfert updateTransfert(Integer  id);
	public Transfert deleteTransfert(Integer id);
	public Transfert createTransfert();
	

}

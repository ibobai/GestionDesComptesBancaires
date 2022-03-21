package fr.gestion.comptes.bancaires.dao.interfaces;

import antlr.collections.List;
import fr.gestion.comptes.bancaires.daos.Client;

public interface ClientDAO {

	public Client getClientById(Integer id);
	public List getClients();
	public Client updateClient(Integer  id);
	public Client deleteClient(Integer id);
	public Client createClient();
	

}

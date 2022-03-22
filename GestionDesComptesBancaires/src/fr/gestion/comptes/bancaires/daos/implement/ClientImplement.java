package fr.gestion.comptes.bancaires.daos.implement;

import java.util.List;

import fr.gestion.comptes.bancaires.dao.interfaces.ClientDAO;
import fr.gestion.comptes.bancaires.obj.ClientObj;
import fr.gestion.comptes.bancaires.pojos.Client;

public class ClientImplement implements ClientDAO {

	@Override
	public ClientObj getClientById(Integer id) {
		Client c = em.find(Client.class, id);
		ClientObj cc = modelMapper.map(c, ClientObj.class);   //ON appelle la fonction de mapping pour mapper de Client vers clientObj
		System.out.println(cc.getNom() +" "+ cc.getPrenom());
		return cc;
	}

	@Override
	public List getClients() {
		List<Client> lc =  em.createQuery("From Client", Client.class).getResultList();
//		for(Client c : lc) {
//			System.out.println(c.getNom());
//		}
		return lc;
	}

	@Override
	public ClientObj updateClient(Integer id) {
		// TODO Auto-generated method stub	
		Client c = em.find(Client.class, id);
		return null;
	}

	@Override
	public ClientObj deleteClient(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientObj createClient(Client c) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void test() {
		System.out.println("It's working ! !");
	}

}

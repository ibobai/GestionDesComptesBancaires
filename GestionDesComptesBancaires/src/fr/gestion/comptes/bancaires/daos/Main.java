package fr.gestion.comptes.bancaires.daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.gestion.comptes.bancaires.pojos.Compte;

public class Main {

	

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionDesComptesBancaires");
	private static EntityManager em = emf.createEntityManager();

	public static void getCompte(Integer id) {
		Compte p1 = em.find(Compte.class, id);
		System.out.println(p1.getNumCom());
	}
	public static void persistCompte(Compte  c) {

		Compte p2 = new Compte();
		p2.setNumCom(c.getNumCom());
		p2.setSolde(c.getSolde());
		p2.setClientID(c.getClientID());

		em.getTransaction().begin();
		em.persist(p2);
		em.getTransaction().commit();
		System.out.println("Compte has been persisted ");

	}
}

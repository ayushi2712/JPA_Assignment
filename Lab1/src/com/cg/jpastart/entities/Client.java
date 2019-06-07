package com.cg.jpastart.entities;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

	public class Client {

		public static void main(String[] args) {
			EntityManagerFactory factory = Persistence
					.createEntityManagerFactory("JPA-PU");
			//factory contains collection  of managers
			//the name "JPA-PU" should match the persistence unit name
			EntityManager em = factory.createEntityManager();
			//entire life cycle of entity is managed by entity manager
			// creating one entity manager from factory
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();//unit of operations is Transaction
						Greet greet = new Greet();//creating object
			greet.setMessage("Welcome to JPA!");
			
			em.persist(greet);//generates sql query
			
			System.out.println("Added greeting to database.");

			transaction.commit();//saving the record permanently
			em.close();
			factory.close();
		}
	}




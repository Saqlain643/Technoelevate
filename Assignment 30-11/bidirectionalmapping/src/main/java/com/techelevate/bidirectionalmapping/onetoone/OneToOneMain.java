package com.techelevate.bidirectionalmapping.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToOneMain {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("bimapping");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

//			mapping wrt person
//			Person person=new Person();
//			person.setPerson_name("Saqlain");
//			Country country=new Country();
//			country.setC_name("India");
//			person.setCountry(country);
//			country.setPerson(person);
//			entityManager.persist(person);

//			mapping wrt country
			Country country = new Country();
			country.setC_name("Ireland");
			Person person = new Person();
			person.setPerson_name("Kevin");
			country.setPerson(person);
			person.setCountry(country);
			entityManager.persist(country);

			entityTransaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (entityManagerFactory != null) {
				entityManagerFactory.close();
			}
			if (entityManager != null) {
				entityManager.close();
			}
			if (entityTransaction != null) {
				entityTransaction.rollback();
			}
		}
	}
}

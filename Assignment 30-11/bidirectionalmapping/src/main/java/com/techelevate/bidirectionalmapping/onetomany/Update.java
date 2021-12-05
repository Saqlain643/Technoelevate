package com.techelevate.bidirectionalmapping.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("bimapping");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			Teachers find = entityManager.find(Teachers.class, 34);
			find.setTeacher_name("Bellamy");
			
			entityTransaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package com.techelevate.bidirectionalmapping.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Read {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("bimapping");
			entityManager=entityManagerFactory.createEntityManager();
			
			Teachers find = entityManager.find(Teachers.class, 34);
			
			System.out.println(find.getTeacher_name());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

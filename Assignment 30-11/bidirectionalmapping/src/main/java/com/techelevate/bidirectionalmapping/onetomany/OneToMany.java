package com.techelevate.bidirectionalmapping.onetomany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToMany {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("bimapping");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			School school=new School();
			school.setSchool_name("Oxford English Medium School");
			Teachers teachers=new Teachers();
			teachers.setTeacher_name("David");
			Teachers teachers1=new Teachers();
			teachers1.setTeacher_name("Jellal");
			Teachers teachers2=new Teachers();
			teachers2.setTeacher_name("Murthy");
			List<Teachers> list=Arrays.asList(teachers,teachers1,teachers2);
			school.setTeachers(list);
			teachers.setSchool(school);
			teachers1.setSchool(school);
			teachers2.setSchool(school);
			entityManager.persist(school);
			
			entityTransaction.commit();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

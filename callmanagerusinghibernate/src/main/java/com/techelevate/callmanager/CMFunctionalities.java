package com.techelevate.callmanager;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class CMFunctionalities {
	static EntityManagerFactory entityManagerFactory = null;
	static EntityManager entityManager = null;
	static Scanner sc = new Scanner(System.in);

	public static void myConnections() {
		entityManagerFactory = Persistence.createEntityManagerFactory("callmanager");
		entityManager = entityManagerFactory.createEntityManager();
	}

	public static void showAllContacts() {
		try {
			myConnections();
			Query createQuery = entityManager.createQuery("from Contacts");
			List resultList = createQuery.getResultList();
			for (Object object : resultList) {
				System.out.println(object);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void search() {
		myConnections();
		System.out.println("search here...");
		String name = sc.next();
		Query createQuery = entityManager.createQuery("select name from Contacts");
		List resultList = createQuery.getResultList();
		int count = 0;
		for (Object object : resultList) {
			if (((String) object).equals(name)) {
				count++;
				System.out.println("result found " + object);

			}
		}
		if (count == 0) {
			System.out.println("No contacts found");
		}
		if (count > 0) {
			System.out.println("1. Call\n2. Text\n3. Go back\nChoose an option");
			int input = sc.nextInt();
			if (input == 1) {
				call(name);
			} else if (input == 2) {
				text(name);
			} else {
				System.out.println("Going back");
			}
		}
	}

	public static void call(String object) {

		System.out.println("Calling " + object + "...");
	}

	public static void text(String object) {
		System.out.println("Enter the text...");
		String string = sc.nextLine();
		System.out.println("Sending text to " + object + "...");
	}

	public static void add() {
		myConnections();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter email");
		String email = sc.next();
		System.out.println("Enter number");
		long number = sc.nextLong();

		Contacts contacts = new Contacts();
		contacts.setId(id);
		contacts.setName(name);
		contacts.setEmailId(email);
		contacts.setNumber(number);
		entityManager.persist(contacts);
		entityTransaction.commit();
		System.out.println("Contact added sucessfully");
	}

	public static void delete() {
		System.out.println("Enter the contact name to be deleted");
		String name = sc.next();

		myConnections();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		Query createQuery = entityManager.createQuery("delete from Contacts where name='" + name + "'");
		int executeUpdate = createQuery.executeUpdate();
		System.out.println(executeUpdate);
		if(executeUpdate==1) {
			System.out.println("Deleted sucessfully");
		}else {
			System.out.println("error404");
		}
		entityTransaction.commit();
	}

	public static void update() {
		EntityTransaction entityTransaction;
		try {
			myConnections();
			entityManagerFactory = Persistence.createEntityManagerFactory("callmanager");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			System.out.println("Enter the name");
			String name = sc.next();
			System.out.println("Enter the number");
			long l = sc.nextLong();
			Query createQuery = entityManager
					.createQuery("update Contacts set number=" + l + "where name ='" + name + "'");
			System.out.println("Updated succesfully");
			int executeUpdate = createQuery.executeUpdate();
			if(executeUpdate==1) {
				System.out.println("Deleted sucessfully");
			}else {
				System.out.println("error404");
			}
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
		}
	}
}

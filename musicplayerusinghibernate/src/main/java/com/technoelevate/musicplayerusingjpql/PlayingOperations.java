package com.technoelevate.musicplayerusingjpql;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PlayingOperations {
	static EntityManagerFactory entityManagerFactory = null;
	static EntityManager entityManager = null;

	public static void neededThings() {
		entityManagerFactory = Persistence.createEntityManagerFactory("musicplayer");
		entityManager = entityManagerFactory.createEntityManager();
	}

	public static void playASong() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Play all song\n2. Play a random song\n3. Play a particular song");
		int input = scanner.nextInt();

		switch (input) {
		case 1:

			try {
				neededThings();
				Query createQuery = entityManager.createQuery("select songName from Songs");
				List resultList = createQuery.getResultList();

				for (Object object : resultList) {
					System.out.println(object + " playing");
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (entityManager != null) {
					entityManager.close();
				}
				if (entityManagerFactory != null) {
					entityManagerFactory.close();
				}
			}
			break;
		case 2:
			try {
				neededThings();
				int n = (int) (Math.random() * 4);
				Query createQuery = entityManager.createQuery("select songName from Songs where songId=" + n);
				Object singleResult = createQuery.getSingleResult();
				System.out.println(singleResult + " playing");

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (entityManager != null) {
					entityManager.close();
				}
				if (entityManagerFactory != null) {
					entityManagerFactory.close();
				}
			}
			break;
		case 3:

			try {
				neededThings();
				System.out.println("Enter which song to be played");
				String song = scanner.next();
				Query createQuery = entityManager.createQuery("select songName from Songs");
				List resultList = createQuery.getResultList();
				int count = 0;
				for (Object object : resultList) {
					if (((String) object).equals(song)) {
						System.out.println(object + " playings");
						count++;
					}
					if (count != 0) {
						System.out.println(object + " not present");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (entityManager != null) {
					entityManager.close();
				}
				if (entityManagerFactory != null) {
					entityManagerFactory.close();
				}
			}
			break;
		}
	}
}

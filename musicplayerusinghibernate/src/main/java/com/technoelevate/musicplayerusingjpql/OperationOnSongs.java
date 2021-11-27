package com.technoelevate.musicplayerusingjpql;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class OperationOnSongs {
	static EntityManager entityManager = null;
	static EntityManagerFactory entityManagerFactory = null;
	static EntityTransaction entityTransaction = null;

	public static void search() {
		Scanner scanner = new Scanner(System.in);
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("musicplayer");
			entityManager = entityManagerFactory.createEntityManager();
			System.out.println("Enter which song to be played");
			String song = scanner.next();
			Query createQuery = entityManager.createQuery("select songName from Songs");
			List resultList = createQuery.getResultList();
			int count = 0;
			for (Object object : resultList) {
				if (((String) object).equals(song)) {
					System.out.println(object + " found");
					count++;
				}
				if (count != 0) {
					System.out.println(object + " not found");
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
	}

	public static void operations() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Add a song\n2. Delete a song");
		int input = scanner.nextInt();

		switch (input) {
		case 1:
			entityManagerFactory = Persistence.createEntityManagerFactory("musicplayer");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Songs songs = new Songs();
			System.out.println("Enter id of the song");
			int id = scanner.nextInt();
			System.out.println("Enter name of the song");
			String name = scanner.next();
			System.out.println("Enter artist name of the song");
			String artistName = scanner.next();
			System.out.println("Enter album name of the song");
			String albumName = scanner.next();
			songs.setSongId(id);
			songs.setSongName(name);
			songs.setArtistName(artistName);
			songs.setAlbum(albumName);
			entityManager.persist(songs);
			entityTransaction.commit();
			break;
		case 2:
			try {
				entityManagerFactory = Persistence.createEntityManagerFactory("musicplayer");
				entityManager = entityManagerFactory.createEntityManager();
				entityTransaction = entityManager.getTransaction();
				entityTransaction.begin();

				System.out.println("Enter the songs to be deleted");
				int n = scanner.nextInt();

				Songs find = entityManager.find(Songs.class, n);
				entityManager.remove(find);

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
}

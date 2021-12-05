package com.techelevate.callmanager;

import java.util.Scanner;

public class CallManagerMain {
	public static void main(String[] args) {
		boolean loop = true;
		while (loop) {
			System.out.println("1. Show all contacts\n2. Search contact\n3. Operations on contacts\n4. Exit\nChoose an option");
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			switch (n) {
			case 1:
				CMFunctionalities.showAllContacts();
				break;
			case 2:
				CMFunctionalities.search();
				break;
			case 3:
				System.out.println("1. Add contact\n2. Delete contact\n3. Update contact");
				int in = scanner.nextInt();
				if (in == 1) {
					CMFunctionalities.add();
				} else if (in == 2) {
					CMFunctionalities.delete();
				} else if (in == 3) {
					CMFunctionalities.update();
				}
				break;
			case 4:
				loop=false;
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
		}
	}
}

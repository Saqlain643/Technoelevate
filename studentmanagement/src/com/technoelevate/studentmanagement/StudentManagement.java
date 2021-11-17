package com.technoelevate.studentmanagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentManagement {
	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<>();
		arrayList.add(new Student(1, 22, 546, 9934557855L, "Eren", "Male"));
		arrayList.add(new Student(2, 23, 566, 9934457855L, "Sakura", "Female"));
		arrayList.add(new Student(5, 22, 556, 9968442585L, "Natsu", "Male"));
		arrayList.add(new Student(3, 21, 496, 1235478958L, "Erza", "Female"));
		arrayList.add(new Student(4, 24, 599, 8249299852L, "Bakugou", "Male"));
		arrayList.add(new Student(61, 23, 430, 8456975284L, "Gon", "Male"));

		Scanner scanner = new Scanner(System.in);

		boolean loop = true;
		while (loop) {
			System.out.println(
					"Press an option\n1. Sort by ID\n2. Sort by name\n3. Sort by age\n4. Sort by Number\n5. Sort by gender\n6. To exit");
			int input = scanner.nextInt();
			switch (input) {
			case 1:

				Collections.sort(arrayList, new SortById());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;
			case 2:
				Collections.sort(arrayList, new SortByName());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;
			case 3:
				Collections.sort(arrayList, new SortByAge());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;
			case 4:
				Collections.sort(arrayList, new SortByNumber());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;
			case 5:
				Collections.sort(arrayList, new SortByGender());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;
			case 6:
				loop = false;
				System.out.println("You have choosen to exit..");
			}
		}
		scanner.close();
	}
}

package com.technoelevate.musicplayerusingjpql;

import java.util.Scanner;

public class SongManipulation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean loop = true;
		while (loop) {
			System.out.println("1. Play a song\n2. Search for song\n3. Operation on musicplayer\n4. Exit");
			int n = scanner.nextInt();
			switch (n) {
			case 1:
				PlayingOperations.playASong();
				break;
			case 2:
				OperationOnSongs.search();
				break;
			case 3:
				OperationOnSongs.operations();
				break;
			case 4:
				loop = false;
			}
		}
	}
}

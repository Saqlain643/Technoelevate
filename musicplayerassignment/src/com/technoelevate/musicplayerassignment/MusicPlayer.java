package com.technoelevate.musicplayerassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicPlayer {
	
	public static void main(String args[]) {
		
		ArrayList list=new ArrayList();
		list.add("abc");
		list.add("xyz");
		list.add("def");
		list.add("efg");
		list.add("cda");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Play a song\n2. Search for song\n3. Operation on musicplayer");
		int input = scanner.nextInt();

		switch (input) {
		case 1:
			PlayASong.playSong(list);
			return;
		case 3:
			Operations.operationOnPlayer(list);
			return;
		case 2:
			Search.searchList(list);
			return;
		default:
			System.out.println("Invalid input");
		}

	}
}

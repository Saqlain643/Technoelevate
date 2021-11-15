package com.technoelevate.musicplayerassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayASong {
	public static void playSong(ArrayList list) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("1. Play all song\n2. Play a random song\n3. Play a particular song");
		int input=scanner.nextInt();
		
		switch(input){
		case 1:
			System.out.println(list +" playing");
			break;
		case 2:
			System.out.println(list.get((int)(Math.random()*5)));
			break;
		case 3:
			System.out.println("Select a song");
			String inputSong=scanner.next();
			for(int i=0;i<list.size();i++) {
				if(list.get(i).equals(inputSong)) {
					System.out.println(list.get(i));
				}
			}
			break;
		default:
			System.out.println("Invalid input");
		}
	}
}

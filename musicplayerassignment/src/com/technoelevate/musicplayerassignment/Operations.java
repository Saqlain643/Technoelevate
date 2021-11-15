package com.technoelevate.musicplayerassignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Operations {
	
	public static void operationOnPlayer(ArrayList list){
		Scanner scanner=new Scanner(System.in);
		System.out.println("1. Add a song\n2. Delete a song");
		int input=scanner.nextInt();
		
		switch (input) {
		case 1:
			System.out.println("Enter song");
			String songName=scanner.next();
			list.add(songName);
			System.out.println("Song added succesfully");
			return;
			
		case 2:
			System.out.println("Delete a song");
			String songName1=scanner.next();
			for(int i=0;i<list.size();i++) {
				if(songName1.equals(list.get(i))){
					list.remove(i);
					System.out.println("Song Deleted");
				}
			}
			return;
		default:
			System.out.println("Invalid input");
		}
	}
}
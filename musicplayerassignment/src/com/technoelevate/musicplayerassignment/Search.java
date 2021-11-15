package com.technoelevate.musicplayerassignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {
	public static void searchList(ArrayList list) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Select a song");
		String inputSong=scanner.next();
		
		for(int i=0;i<list.size();i++) {
			if(inputSong.equals(list.get(i))){
				System.out.println(list.get(i)+ " playing");
			}
		}
		return;
	}
}

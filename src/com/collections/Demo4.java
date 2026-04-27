package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Demo4 {

	public static void main(String[] args) {
		Collection<String> team1=new ArrayList<>();
		team1.add("a");
		team1.add("b");
		team1.add("c");
		team1.add("d");
		System.out.println("team1:"+team1);
		
		Collection<String> team2=new ArrayList<>();
		team2.add("a");
		team2.add("b");
	
		
		System.out.println("team2:"+team2);
		
		System.out.println(team1.contains(team2));//false
		System.out.println(team2.contains(team1));//false
		
		System.out.println(team1.containsAll(team2));//true ..team 2 lo unnavi anni tema1 lo unnae
		System.out.println(team2.containsAll(team1));//false
	}

}

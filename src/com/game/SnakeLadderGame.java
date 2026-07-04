package com.game;

import java.util.Random;

class Player{
	String name;
	int position;
	
	public Player(String name) {
		this.name=name;
		this.position=0;
	}
}
public class SnakeLadderGame {
	public static void main(String[] args) {
		Player p1 = new Player("Player1");
		Player p2 = new Player("Player2");
		
		int[] board = new int[101];
		//ladders
		board[4] = 25;
		board[13] = 46;
		board[33] = 49;
		board[42] = 63;
		
		//snakes
		board[40] = 3;
		board[54] = 31;
		board[66] = 45;
		board[89] = 53;
    
		System.out.println(p1.name);
		System.out.println(p1.position);
		
		Random random=new Random();
		
		while(p1.position < 100)
		{
		    int dice = random.nextInt(6) + 1;

		    System.out.println("Dice = " + dice);

		    if(p1.position + dice <= 100)
		    {
		        p1.position += dice;
		    }

		    System.out.println("Position = " + p1.position);
		}
		
		
		
		if(board[p1.position] != 0)
		{
		    p1.position = board[p1.position];
		}
		System.out.println("Winner Winner!");
		System.out.println("Player Reached 100");
	}
	
	public static void playTurn(Player player, Random random,int[] borad) {
		
	}

}

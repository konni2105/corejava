package com.alltasks;
// every 3 wrappers->one chocolate
//no.of choco=wappercount
//find final wappers and chocolates
import java.util.Scanner;

public class TaskaProblemSolving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no chocolates");
		int choco = sc.nextInt();
		System.out.println("enter amount");
		int cash = sc.nextInt();
		int wappercount = cash/choco;
		int chococount=wappercount;
		 
		System.out.println("before offer wrappercount:"+wappercount);
		while (wappercount >= 3) {
			int temp =wappercount%3;
			 wappercount=wappercount/3;
			 chococount=chococount+wappercount;
			 wappercount+=temp;
			  
		}
		System.out.println("total chocolate:"+chococount);
		System.out.println("after offer wappercount:"+wappercount);
		sc.close();
	}

}

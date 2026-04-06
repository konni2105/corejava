package com.lab;
//You are going to a shop to buy chocolates and cookies.
//Each chocolate costs ₹15
//Each cookie costs ₹10
//You have ₹450 in total
//If you decide to buy 10 chocolates and 5 cookies,calculate remaing amount
public class Lab4 {

	public static void main(String[] args) {
		int chochoscost = 15;
		int cookiescost =10;
	    int totalprice = 450;
	    int chochosbought=10;
	    int cookiesbought=5;
	    int totalbought=(chochoscost * chochosbought )+(cookiescost * cookiesbought);
	    int remaingamnt =totalprice-totalbought ;
		System.out.println("remaingamnt:"+remaingamnt);
	}

}

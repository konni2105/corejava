package com.constructors;
//copyconstructor
public class Movie {
	String name;
	String hero;
	String director;
	String heroine;
	double budget;
	Movie(String director,String hero){
		this.director=director;
		this.hero=hero;
	}
	Movie(Movie mv,String name){
		this.name=name;
		this.director=mv.director;
		this.hero=mv.hero;
	}
	Movie(Movie mv,String heroine,double budget){
		this.name=mv.name;
		this.hero=mv.hero;
		this.director=mv.director;
		this.heroine=heroine;
		this.budget=budget;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to TFI!!!");
		Movie mv=new Movie("SS RajMouli","Mahesh Babu");
		mv.show();
		Movie mv1=new Movie(mv,"Varanasi");
		mv1.show();
		Movie mv2=new Movie(mv1,"Priyanka Chopra",2000000000);
		mv2.show();
	}
	void show() {
		System.out.println("Moviename:"+name);
		System.out.println("Moviehero:"+hero);
		System.out.println("Moviedirector:"+director);
		System.out.println("Movieheroine:"+heroine);
		System.out.println("Moviebudget:"+budget);
		System.out.println("*************************");
	}
}

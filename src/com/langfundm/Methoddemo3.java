package com.langfundm;

import java.util.Scanner;
import java.lang.Math;

//with return,with arg
//wrp get areas of tringle,squr,rectngle,circle
public class Methoddemo3 {
	//tri_area=0.5*base*height 
	double findAraOfTri(double base , double height){
		double artr=0.0;
		artr=0.5*base*height;
		return artr;
	}
	//sqr_area=side*side
	double findAraOfsqr(double side){
		double arsqr=0.0;
		arsqr=side*side;
		return arsqr;
	}
	//rect_area=length*breadth
	double findAraOfrect(double length,double breadth){
		double arrec=0.0;
		arrec=length*breadth;
		return arrec;
	}
	//cir_area=PI*r*r
	double findAraOfcir(double radius){
		double arcir=0.0;
		arcir= Math.PI * radius * radius;
		return arcir;
	}

	public static void main(String[] args) {
		System.out.println("main method");
		Scanner sc=new Scanner(System.in);

		System.out.println("entr base: ");
		double b=sc.nextDouble();

		System.out.println("entr height: ");
		double h=sc.nextDouble();

		System.out.println("entr side: ");
		double s=sc.nextDouble();

		System.out.println("entr length: ");
		double l=sc.nextDouble();

		System.out.println("entr breadth: ");
		double br=sc.nextDouble();

		System.out.println("entr radius: ");
		double r=sc.nextDouble();

		Methoddemo3 m=new Methoddemo3();
		//finding tri area
		double artr=m.findAraOfTri(b, h);
		System.out.println("area of triangle"+ artr);
		//finding sqr area
		double arsqr=m.findAraOfsqr(s);
		System.out.println("area of sqr"+ arsqr);
		//finding rect area
		double arrec=m.findAraOfrect(l,br);
		System.out.println("area of rect"+ arrec);
		//finding cir area
		double arcir=m.findAraOfcir(r);
		System.out.println("area of cir"+ arcir);
	}

}

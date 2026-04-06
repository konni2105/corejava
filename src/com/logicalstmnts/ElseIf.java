package com.logicalstmnts;
//>>Do mistakes***learn from mistakes ***<<
/* if enter 82....it will gives just passed only why because 
  marksP >= 35 → true
  Java executes "Just pass"
  Remaining else if blocks are NOT checked
✔ This is how else-if works:
Once a condition is true, the rest are skipped */
import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner s=new Scanner(System.in);
		System.out.println("enter marks percentage");
        double marksP=s.nextDouble();
	if(marksP>100 || marksP<0) {
		System.out.println("Invalid percentage");
	}else if(marksP>=35){
		System.out.println("Just pass");
	}else if(marksP>=60){
		System.out.println("grade d");
	}else if(marksP>=70){
		System.out.println("grade c");
	}else if(marksP>=80){
		System.out.println("grade b");
	}else if(marksP>=90){
		System.out.println("grade a");
	}
	else {
		System.out.println("don't waste time,chadhuvuko first!");
	}
	
	System.out.println("main method ended");
	}

}
/*“In an else-if ladder, 
 * conditions are evaluated from top to bottom.
 *  Once a condition becomes true, 
 *  Java executes that block and 
 *  skips the remaining conditions. 
 *  Therefore, conditions must be ordered from highest to lowest range.”*/

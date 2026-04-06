package com.patterns;

public class Basic {
   public static void main(String args[]) { 
	 
/*     * * * * * 
	   * * * * * 
	   * * * * * 
	   * * * * * 
	   * * * * * 
	int n=5;
	System.out.println("sqr patrn");
	for(int i=1;i<=n;i++) {  //rows=n
		for(int j=1;j<=n;j++) {  //colms=n
			System.out.print("* ");//print for every column
			
		}
		System.out.println();//next for each row
	} */
	   
	    /*
***
***
***
***
***
		System.out.println("rectangle patrn");
		for(int i=1;i<=5;i++) {  
			for(int j=1;j<=3;j++) {  
				System.out.print("*");//print for every column
				
			}
			System.out.println();//next for each row
		}  */
	
		
	   /*
1 1 1 1 
2 2 2 2 
3 3 3 3 
4 4 4 4
	    
	   System.out.println("solid nmbr sqr");
		int n=4;
		for(int i=1;i<=n;i++) {  
			for(int j=1;j<=n;j++) {  
				System.out.print(i+" ");//Row number prints repeatedly
				
			}
			System.out.println();//next for each row
		} */
	  
	/* 1 2 3 4 
	   1 2 3 4 
	   1 2 3 4 
	   1 2 3 4 

	  
	   
	   System.out.println("column nmbr pattern");
		int n=4;
		for(int i=1;i<=n;i++) {  
			for(int j=1;j<=n;j++) {  
				System.out.print(j+" ");//clm number prints repeatedly
				
			}
			System.out.println();//next for each row
		}*/
	   
	   
	  	System.out.println("single row pattern");    
		int n=4;
		for(int i=1;i<=n;i++) {  //Only 1 row → loop rows  -->Print one star per line
			
			System.out.print("* ");	
			}
		System.out.println();
		
		System.out.println("single clm pattern");  //Only 1 column → loop rows-->Print one star per line
		for(int i=1;i<=n;i++) {  
			
			System.out.println("*");
		} 
	   
	   
	   
	
   }
}

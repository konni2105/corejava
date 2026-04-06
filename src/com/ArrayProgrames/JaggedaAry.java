package com.ArrayProgrames;
//jagedary:2D array where each row can have a different number of columns.
public class JaggedaAry {

	public static void main(String[] args) {
		int[][] n=new int[2][];
		                    //  0   1   2
		//matrix rpresntn--> 0  10  20  30
		                  // 1  40  50
		
		//jgedary creation
		n[0]=new int[3];
		n[1]=new int[2];// or n[1]=new int[]{40,50};
		

		n[0][0]=10;
		n[0][1]=20;
		n[0][2]=30;
		
		n[1][0]=40;
		n[1][1]=50;
		
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
	}

}

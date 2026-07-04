package com.patterns;

public class AdvncPatrnMatrixLevel {

	public static void main(String[] args) {
		
/*		
1	2	3	4	
12	13	14	5	
11	16	15	6	
10	9	8	7
 
 
 
		System.out.println("spiral matrix");
		 int n=4;
		 int[][] arr=new int[n][n];
		 
		 int top=0,bottom=n-1;
		int left=0,right=n-1;
		int num=1;
		while(top<=bottom && left <= right) {
			//left->right
			for(int i=left; i<=right;i++) {
				arr[top][i]=num++;
			}
			top++;
			//top->bottom
			for(int i = top; i <= bottom; i++)
		        arr[i][right] = num++;
		    right--;
		    //right->left
		    for(int i = right; i >= left; i--)
		        arr[bottom][i] = num++;
		    bottom--;
		    //bottom->top
		    for(int i = bottom; i >= top; i--)
		        arr[i][left] = num++;
		    left++;

		}
		//print matrix
		for(int i = 0; i < n; i++) {
		    for(int j = 0; j < n; j++) {
		        System.out.print(arr[i][j] + "\t");
		    }
		    System.out.println();
		}
*/
	
/*		1 2 3 
		6 5 4 
		7 8 9 
		System.out.println("wave/snake pattern");
		
		int n = 3;
		int[][] arr = {
		    {1, 2, 3},
		    {4, 5, 6},
		    {7, 8, 9}
		};

		for(int i = 0; i < n; i++) {

		    if(i % 2 == 0) {
		        // left to right
		        for(int j = 0; j < n; j++) {
		            System.out.print(arr[i][j] + " ");
		        }
		    } else {
		        // right to left
		        for(int j = n - 1; j >= 0; j--) {
		            System.out.print(arr[i][j] + " ");
		        }
		    }

		    System.out.println();
		}
		
		---------------------------------------------------------
		int n = 3;
int num = 1;

for(int i = 0; i < n; i++) {

    int start = num;
    int end = num + n - 1;

    if(i % 2 == 0) {
        for(int j = start; j <= end; j++) {
            System.out.print(j + " ");
        }
    } else {
        for(int j = end; j >= start; j--) {
            System.out.print(j + " ");
        }
    }

    num += n;
    System.out.println();
}
*/
/*		System.out.println("X");
		int n = 5;

		for(int i = 0; i < n; i++) {
		    for(int j = 0; j < n; j++) {

		        if(i == j || i + j == n - 1)
		            System.out.print("* ");
		        else
		            System.out.print("  ");
		    }
		    System.out.println();
		}
		
*/
		
/*		1
		0 1
		1 0 1
		0 1 0 1
		
		System.out.println("Binary(0/1)");
		int n=5;
		for(int i = 1; i <= n; i++) {
		    for(int j = 1; j <= i; j++) {
		        System.out.print((i + j) % 2 + " ");
		    }
		    System.out.println();
		}
		*/
	}

}

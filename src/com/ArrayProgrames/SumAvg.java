package com.ArrayProgrames;

public class SumAvg {

	public static void main(String[] args) {
		int[] marks= {72,78,92,98,67};
		double sum=0;
		double avg=0;
		for(int i=0;i<marks.length;i++) {
			sum=sum+marks[i];
		}
		avg=sum/marks.length;
		System.out.println("sum of marks"+sum);
		System.out.println("avg of marks"+avg);
	}

}

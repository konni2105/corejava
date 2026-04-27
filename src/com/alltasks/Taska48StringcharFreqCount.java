package com.alltasks;
 
public class Taska48StringcharFreqCount {

	public static void main(String[] args) {

		String str = "Programming";
		boolean visted[] = new boolean[str.length()];
		for (int i = 0; i < str.length(); i++) {
			int count=1;
			if (visted[i]) {
				continue;
			}
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j))
					
				{
					count++;
					visted[j] = true;
				}
				
			}
			System.out.println(str.charAt(i) + "=" + count);
		}

		 

			 
		

	}
}

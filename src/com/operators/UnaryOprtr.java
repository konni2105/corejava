package com.operators;
/*pre :                 post:
      incre :++a              incre:a++
      decre :--a              decre:a--  */
public class UnaryOprtr {

	public static void main(String[] args) {
		/*int i=6;
		int j=4;
		System.out.println(i++);
		System.out.println(++i);
		System.out.println(--i);
		System.out.println(++j);
		System.out.println(i--);
		System.out.println(--i);
		System.out.println(++i);
		System.out.println(j++);
		System.out.println(--i);
		System.out.println(j--);
		System.out.println(--j);
		System.out.println(j++);
		System.out.println(--j);
		System.out.println(++j);
		System.out.println(j--);
		
		System.out.println("i value"+i);//5
		System.out.println("j value"+j);//4  */
		System.out.println("==============================");
		
		/*int a = 5;
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a);*/

		/*int a = 10;
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(--a);
		System.out.println(a);*/
		/*int x = 3;
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(++x);
		int i = 6;
		System.out.println(i++);
		System.out.println(++i);
		System.out.println(i--);
		System.out.println(--i);
		System.out.println(i);
		int a = 4;
		System.out.println(--a);
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(a);*/
		/*int i = 5, j = 3;
		System.out.println(i++ + j++);
		System.out.println(++i + ++j);
		System.out.println(i + j);

		int a = 8, b = 2;
		System.out.println(a-- - b++);
		System.out.println(++a + --b);
		System.out.println(a * b);*/

		/*int i = 5;
		int result = i++ + ++i + i--;
		System.out.println(result);
		System.out.println(i);
		int x = 4;
		int y = x++ + x++ + ++x;
		System.out.println(y);
		System.out.println(x);
		int i = 7;
		System.out.println(i++ + i++);
		int a = 3;
		System.out.println(++a + a++ + ++a);int a = 6;
		a = a-- + a++;
		System.out.println(a);
		int i = 5;
		i = i++ + ++i;
		System.out.println(i);int a = 6;
		a = a-- + a++;
		System.out.println(a);


		int a = 6;
		a = a-- + a++ ;
		System.out.println(a);*/

		/*int i = 10;
		System.out.println(i--);
		System.out.println(--i);
		System.out.println(i++);
		System.out.println(++i);
		System.out.println("Final i = " + i);
		int j = 1;
		System.out.println(j++);
		System.out.println(j++);
		System.out.println(++j);
		System.out.println(j--);
		System.out.println("Final j = " + j);*/
		   int a=3;
		   int b=4;
		   System.out.println(a++ + ++a -b++ - --b+ a++);
        System.out.println("aval:"+a);
        System.out.println("bval"+b);
        int res=(a+b);
        System.out.println(res);
        System.out.println(b++ + a + a-- -b+ res + ++a + --b );
		
	}

}

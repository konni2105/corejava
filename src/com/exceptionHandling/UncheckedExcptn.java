package com.exceptionHandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/*
Most Important Runtime/unchecked Exceptions:

       Exception	                         When it occurs

ArithmeticException                    	Divide by zero
NullPointerException	                Accessing null object
ArrayIndexOutOfBoundsException	        Invalid array index
StringIndexOutOfBoundsException	        Invalid string index
NumberFormatException	                Invalid string to number conversion
ClassCastException	                    Invalid type casting
IllegalArgumentException	            Invalid argument passed
IllegalStateException	                Method called at wrong time
IllegalThreadStateException	            Starting thread twice
NegativeArraySizeException	            Creating array with negative size
ArrayStoreException	                    Wrong object stored in array
UnsupportedOperationException	        Unsupported operation
ConcurrentModificationException	        Modifying collection during iteration
NoSuchElementException	                Element not found
InputMismatchException                  Wrong input type from Scanner
EmptyStackException	                    Accessing empty stack
IndexOutOfBoundsException	            Invalid index generally
IllegalMonitorStateException	        Calling wait/notify without lock
MissingResourceException	            Resource file missing
BufferOverflowException	                Buffer exceeds limit
BufferUnderflowException	            Reading empty buffer
UncheckedIOException	                Wrapper for IO exception*/
public class UncheckedExcptn {

	public static void main(String[] args) {
	
//ArithmeticException
		int i=10/0;
		System.out.println(i);
		
//NullPointerException
		
		String s=null;
		System.out.println(s.length());
		
//ArrayIndexOutOfBounds
		int[] arr= {10,20,30};
		System.out.println(arr[5]);
		
//StringIndexOutOfBoundsException -> invalid string index
		String str="java";
		System.out.println(s.charAt(10));
		
//NumberFormatException ->Invalid string to number conversion
		 int n = Integer.parseInt("abc");// solution ->("10")

	        System.out.println(n);
	    
//ClassCastException ..->invalid type casting
	        Object obj = "Java";

	        Integer n1 = (Integer)obj;  
	        
//IllegalArgumentException
	       
	        Thread t = new Thread();

	        t.setPriority(20);//Priority range is only 1 to 10.

//IllegalStateException
	        
	        Scanner sc = new Scanner(System.in);

	             sc.close();//sc already closed 
	             sc.nextInt();
	        
// IllegalThreadStateException
		
	             /*  class MyThread extends Thread {

				    public void run() {
				        System.out.println("Thread running");
				    }
				}
				
				public class Test {
				    public static void main(String[] args) {
				
				        MyThread t = new MyThread();
				
				        t.start();
				        t.start();
				    }
				}											*/
	             
 //  NegativeArraySizeException
	             
	             int[] arr1 = new int[-5];
	             
 //ArrayStoreException
	             Object[] arr2 = new String[5];

	             arr[0] = 100;
	           
//UnsupportedOperationException
	             
	             List<Integer> list =Arrays.asList(1,2,3);

	                 list.add(4);
	                 
//ConcurrentModificationException
	                 ArrayList<Integer> list1 =new ArrayList<>();

	                     list1.add(10);
	                     list1.add(20);

	                     for(Integer i1 : list1) {

	                         list1.add(30);
	                     }
	                     
  //NoSuchElementException
	        ArrayList<Integer> list2 = new ArrayList<>();

	          Iterator<Integer> itr =list.iterator();

	          itr.next();
	          
//InputMismatchException 
	          int n2 = sc.nextInt();//scanner input abc
	      
//EmptyStackException
	          Stack<Integer> stack = new Stack<>();

	              stack.pop();
//IndexOutOfBoundsException
	             ArrayList<Integer> list3 = new ArrayList<>();

	                  list3.add(10);

	                  System.out.println(list3.get(5)); 
	                  
 //IllegalMonitorStateException
            /*  public class Test {
    				public static void main(String[] args)throws Exception {

					        Test t = new Test();
					
					        t.wait();
					    }
		       } */
	                  
//BufferOverflowException
	      /* 
	               import java.nio.*;
	      		public class Test {
					    public static void main(String[] args) {
					
					        ByteBuffer buffer =
					            ByteBuffer.allocate(5);
					
					        buffer.put(new byte[10]);
					    }
					}           */ 
//BufferUnderflowException
	                  
	      /*
	        import java.nio.*;

					public class Test {
					    public static void main(String[] args) {
					
					        ByteBuffer buffer =
					            ByteBuffer.allocate(5);
					
					        buffer.get();
					    }
					}
	        */
	                     
	}

}

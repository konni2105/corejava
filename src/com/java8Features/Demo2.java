package com.java8Features;

//instead of creating cls simple we use lambda expsns



@FunctionalInterface
interface Intrfc {
    public abstract void method1();
}

//class TestDemo1 implements Intrfc{ 
	// // @Override 
	// public void method1() { 
	// System.out.println("java 8 features"); 
	// } 
	//}
//}

public class Demo2 {

    public static void main(String[] args) {

        // Correct: assign lambda to functional interface
        Intrfc d = () -> {
            System.out.println("java 8 features");
        };

        d.method1();
    }
}
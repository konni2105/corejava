package com.exceptionHandling;
/*
Most Important Compile/Checked Exceptions


        Exception	                             When it occurs
IOException	                               Input/output failure
FileNotFoundException	                   File missing
EOFException	                           End of file reached
SQLException	                           Database issue
ClassNotFoundException	                   Class missing
InterruptedException	                   Thread interrupted
CloneNotSupportedException	               Clone unsupported
InstantiationException					   Object creation failure
NoSuchMethodException	      				Method missing
NoSuchFieldException	                    Field missing
IllegalAccessException	                    Access denied
InvocationTargetException	                Reflection method issue
ParseException                          	Parsing failure
MalformedURLException	                    Invalid URL
UnknownHostException	                    Host not found
TimeoutException	                        Operation timeout
ExecutionException	                        Task execution failure
NamingException	                            Naming service failure


*/
public class CheckedExcptn {
	public static void main(String[] args) {
// IOException
		/* 
		 import java.io.*;
		

			public class Test {
			    public static void main(String[] args)
			            throws IOException {
			
			        FileReader fr = new FileReader("abc.txt"); 
							fr.read();     
							                     //solution-->                      int data = fr.read();

                                                                      System.out.println((char)data);

                                                                       fr.close();            
			    }
			}	*/
		
//FileNotFoundException
	
		/*	import java.io.*;

		public class Test {
		    public static void main(String[] args)
		            throws FileNotFoundException {

		        FileReader fr = new FileReader("xyz.txt");-->If file does not exist → exception occurs.		 
		     }
		} */

		
//EOFException --->Occurs after file data ends.
	/*	import java.io.*;

		public class Test {
		    public static void main(String[] args)
		            throws Exception {

		        FileInputStream fis =
		            new FileInputStream("abc.txt");

		        ObjectInputStream ois =
		            new ObjectInputStream(fis);

		        while(true) {

		            System.out.println(ois.readObject());
		        }
		    }
		} */
		
//	SQLexcption
/*		import java.sql.*;

		public class Test {
		    public static void main(String[] args)
		            throws SQLException {

		        Connection con =
		            DriverManager.getConnection(
		                "jdbc:mysql://localhost:3306/test",
		                "wrongUser",
		                "wrongPass"
		            );
		    }
		}*/
		
//ClassNotFoundException
/*		public class Test {
		    public static void main(String[] args)
		            throws ClassNotFoundException {

		        Class.forName("abc.Test");
		    }
		}*/

//InterruptedException
/*		 class TestA {

		    public static void main(String[] args)
		            throws Exception {

		        Thread t = new Thread(() -> {

		            try {

		                Thread.sleep(5000);

		            } catch (InterruptedException e) {

		                System.out.println("Thread interrupted");
		            }
		        });

		        t.start();

		        t.interrupt();//main interupt the sleepinh thread 
		    }
		} */
		
//cloneNotSupported 
		
		//class not implyments Clonable
/*		public class Test {

		    public static void main(String[] args)
		            throws CloneNotSupportedException {

		        Test t = new Test();

		        t.clone();
		    }
		}*/

//instantiationExcptn
		//cant create abstract class object 
/*		abstract class A {

		}

		public class Test {
		    public static void main(String[] args)
		            throws Exception {

		        Class c = A.class;

		        c.newInstance();
		    }
		}	*/
	}

}

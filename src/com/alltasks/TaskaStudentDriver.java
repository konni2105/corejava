package com.alltasks;

public class TaskaStudentDriver {

	public static void main(String[] args) {
		System.out.println("Driver class");
		 
		
		//TaskaStudentDetails ts= new TaskaStudentDetails("kamalesh","CSE");
		TaskaStudentDetails ts= new TaskaStudentDetails();
		//ts.setSid(0);
		ts.setGenerateSid();
		ts.setSname("kamalesh");
		ts.setSbranch("ECE");
		System.out.println(ts.getSid());
		System.out.println(ts.getSname());
		System.out.println(ts.getSbranch());
		//TaskaStudentDetails ts1= new TaskaStudentDetails("pradeep","ece");
		TaskaStudentDetails ts1= new TaskaStudentDetails();
		ts1.setGenerateSid();
		ts1.setSname("kamalesh");
		ts1.setSbranch("ECE");
		System.out.println(ts1.getSid());
		System.out.println(ts1.getSname());
		System.out.println(ts1.getSbranch());
	}

}

package com.alltasks;

//plain old java object
public class TaskaStudentDetails {
	public static int count=1;
	private  int sid;
	private String sname;
	private String sbranch;
	
//	public TaskaStudentDetails(String sname,String sbranch) {
//		this.sid=count++;
//		this.sname=sname;
//		this.sbranch=sbranch;
//	}

	public int getSid() {
		return sid;
	}
	
	public String getSname() {
		return sname;
	}

	public String getSbranch() {
		return sbranch;
	}
	
	
	public void setGenerateSid() {
		 this.sid = count++;
	}

 

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setSbranch(String sbranch) {
		this.sbranch = sbranch;
	}
 

}

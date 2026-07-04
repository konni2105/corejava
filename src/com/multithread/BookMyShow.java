package com.multithread;

class TicketBooking{
	int totalTickets=10;
	public synchronized void bookMyTickets(int requestedTickets){
	
		if(requestedTickets<=totalTickets) {
			System.out.println("your tickets booked successfully");
			System.out.println("total number of tickets booked from you is:"+requestedTickets);
			
			totalTickets=totalTickets-requestedTickets;
			System.out.println("the available tickets are:"+totalTickets);
			
		}else {
			System.out.println("sorry tickets are sold out!!");
			System.out.println("the available tickets are:"+totalTickets);
		}
	
    }
	
}
class UserThread extends Thread{
	
	TicketBooking Booking;//creating objectrefnce
	String userName;
	int requestedTickets;
	
	public void run() {
		Booking.bookMyTickets(requestedTickets);
	}
	
	public UserThread(TicketBooking Booking ,String userName,int requestedTickets) {
		this.Booking=Booking;
		this.userName=userName;
		this.requestedTickets=requestedTickets;
		
		}	
}

public class BookMyShow {

	public static void main(String[] args) {
		
   TicketBooking booking=new TicketBooking();
                                                                   
   UserThread user1=new UserThread(booking,"abhi",8);
   UserThread user2=new UserThread(booking,"tom",6);
   UserThread user3=new UserThread(booking,"jerry",6);
   user1.start();
   user2.start();
   user3.start();
   
	}

}

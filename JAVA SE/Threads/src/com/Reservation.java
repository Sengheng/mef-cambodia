package com;

class Operator implements Runnable {

	int noOfSeats = 5;
	int wanted;

	Operator(int wanted) {
		this.wanted = wanted;
	}

	@Override
	public void run() {
		bookTicket();
	}

	public void bookTicket() {
		
		String tname = Thread.currentThread().getName();
		System.out.println("Available seats are: " + noOfSeats);
		System.out.println("Trying Booking " + wanted + " Seats for " + tname);
		
		synchronized (this) {
			if (wanted <= noOfSeats) {
				System.out.println(tname + " is making payment");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				noOfSeats = noOfSeats - wanted;
				System.out.println(wanted + " Seats Booked for " + tname);

			} else {
				System.out
						.println("Sorry. No Seats are avaiable to Book for " + tname + " " + noOfSeats + " Available");
			}

		}

	}

}

public class Reservation {

	public static void main(String[] args) {

		Operator op = new Operator(3);

		Thread p1 = new Thread(op);
		Thread p2 = new Thread(op);

		p1.setName("Passenger1");
		p2.setName("Passenger2");

		p1.start();
		p2.start();

	}

}

package org.bike;

public class Ktm implements Bike{
	public void cost() {
	System.out.println("The Cost of the bike is Rs.50,000");
	}
	public void speed() {
	System.out.println("The Speed of the bike is 50 mph");
	}
	public static void main(String[] args) {
		Ktm k = new Ktm();
		k.cost();
		k.speed();
		
	}
}

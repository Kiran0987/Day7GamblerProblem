package com.bridgelab.gambler;

public class Gambler{
	double stake = 100;
	int betPrice = 1;
	
	public void display () {
		System.out.println("Stake is:" + stake);
		System.out.println("Bet price:" + betPrice);
	}
	public static boolean winOrLoss() {
		if(Math.random()>0.5)
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {

		System.out.println("Gambler simulation program");
		System.out.println(winOrLoss());
		Gambler gambler = new Gambler();
		gambler.display();
		winOrLoss();
		
		
	}
}
package main;

import Kitchen.Cup;


public class Application {

	public static void main(String[] args) {

		Cup cupA = new Cup( "Milk", 300); // mll
		Cup cupB = new Cup( "Water", 500 ); // mll


		cupA.setLiquidVolume(cupA.getLiquidVolume() - 50); // pour out 50 mll of milk
		cupB.setLiquidVolume(cupB.getLiquidVolume() + 50); // pour 50 mll of Water

// Results
		System.out.println(cupA.getLiquidName() + " " + cupA.getLiquidVolume() + " mll");
		System.out.println(cupB.getLiquidName() + " " + cupB.getLiquidVolume() + " mll");

	}

}


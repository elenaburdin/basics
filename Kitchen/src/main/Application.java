package main;

import Kitchen.Cup;


public class Application {

	public static void main(String[] args) {

		Cup cupA = new Cup( "Milk", 300); // mll
		Cup cupB = new Cup( "Water", 500 ); // mll
		Cup cupC = new Cup( "Tea", 200 ); // mll
		Cup cupD = new Cup( "Water", 200); // mll


		cupA.setLiquidVolume(cupA.getLiquidVolume() - 50); // pour out 50 mll of milk
		cupB.setLiquidVolume(cupB.getLiquidVolume() + 50); // pour 50 mll of Water
		
	
// Results
		System.out.println(cupA.getLiquidName() + " " + cupA.getLiquidVolume() + " mll");
		System.out.println(cupB.getLiquidName() + " " + cupB.getLiquidVolume() + " mll");
		System.out.println(cupC.getLiquidName() + " " + cupC.getLiquidVolume() + " mll");
		System.out.println(cupD.getLiquidName() + " " + cupD.getLiquidVolume() + " mll");
		System.out.print("From Cup B to Cup D: ");
		System.out.print(cupD.getLiquidVolume() + cupB.getLiquidVolume() + " mll");

	}

}


package basics;
//main class
public class MoneyWireApp {

	public static void main(String[] args) {
		//Bank.transferFromJuridicToPhysical(120);
		//Bank.accountMoney();
		Solver.solve();

	}

}
class Solver {
	static void solve() {
		
		for( int a1 = 100; a1 <= 5000; a1++ ) {
			
			for( int a2 = 100; a2 <= 5000; a2++ ) {
				
				Bank.PhysicalPersonClient.money = 100;
				Bank.JuridicPersonClient.money = 1000000;
				Bank.money = 0;
				
				int t1 = 40050 / a1;
				for( int i = 1; i <= t1; i++ ) {
					Bank.transferFromJuridicToPhysical(a1);
				}
				int t2 = ( 40050 - Bank.PhysicalPersonClient.money ) / a2;
				for( int i = 1; i <= t2; i++ ) {
					Bank.transferFromJuridicToPhysical( a2 );
				}
				if( 
						Bank.PhysicalPersonClient.money ==( 39640 + 100 ) && 
						Bank.JuridicPersonClient.money == 959950 && 
						Bank.money == 410
						) 
				{
				Bank.accountMoney();
				System.out.println("--------- SOLUTION ---------");
				System.out.println("Transfer " + t1 + " times x " + a1 + " money  +" + t2 + " times x " + a2 + " money");
				System.out.println("-----------------------------");
				break;
					
				}
			}
		}
	}
}
//Bank class

class Bank {

static int money = 0;

 static class PhysicalPersonClient {
     static int money = 100;
 }
 static class JuridicPersonClient {
     static int money = 1000000;
 }


 static void transferFromJuridicToPhysical(int amount){
//The transfer from juridical person
	 if(amount >= 100 && amount <= 5000) { 
		 JuridicPersonClient.money -= amount;
		
//Calculation the transfer to physical person		 
		  if( amount > 500 ) {
			 int percentage = amount / 100;
			 Bank.money += percentage;
			 amount -= percentage;
		 } else if( amount <= 500 ) {
			 Bank.money += 10;
			 amount -= 10;
		 }
		  PhysicalPersonClient.money += amount;
	 } 
	 
	 //Disclaimers for transfer if something will go wrong
	 if( amount < 100 ) {
		 System.out.println("Too small amount for transfer. Please transfer more then 99");
	 } else if( amount > 5000 ) {
		 System.out.println("Too hight amount for transfer. Please transfer less then 5001");
	 }
  }

 static void accountMoney() {
	 System.out.println("Physical Person Client " + PhysicalPersonClient.money + "$");
	 System.out.println("Juridic Person Client " + JuridicPersonClient.money + "$");
	 System.out.println("Bank Money " + Bank.money + "$");
	 
 }
}





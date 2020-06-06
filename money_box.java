package basics;

public class money_box {

	public static void main(String[] args) {
		bank.money_system();
	}
}

class bank {
	
	static void money_system() {
		
	int money_1 = 100;
    int money_2 = 200;
    int money_3 = 300;
    
    int money_accumulator = 0;
    int expenses = 45;
    
    money_accumulator += money_1 + money_2 + money_3;
    money_accumulator -= expenses;
    
    System.out.println( "  " + money_accumulator + "MDL:\n  " + money_1 + "MDL\n+ " + money_2 + "MDL\n+ " + money_3 + "MDL " );
    System.out.println( "--------");
    System.out.println( "- " + expenses + "MDL" );    
    
	}	 
	
}

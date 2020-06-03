package basics;

public class CalculatorMethodsApp {
	
	// CLASS BEGIN
	
	static void printResult( int result ) {
				System.out.printf( "Result: %08d\n",result );
	}	
	static int add( int a, int b ) {
	    int r = a + b;
	    return r;
	}
	static int sub( int a, int b ) {
	    int r = a - b;
	    return r;
	}
	static int mul( int a, int b ) {
	    int r = a * b;
	    return r;
	}
	static int div( int a, int b ) {
	    int r = a / b;
	    return r;
	}
	static int pow( int v, int e ) {
		int r = 1;
		for ( int n = 1; n <= e; n++ ){
			r = r * v;
		}
		return r;
	} 	
	static void printDivider() {
	    System.out.println( "################" );
	    
	}
	public static void main(String[] args) {
		  printDivider();
		  printResult( sub ( add ( div ( mul ( pow ( 2, 3 ),3 ),4 ),1 ),5 ) );
		  printDivider();
	}
	
	// CLASS END
}
package basics;

public class factorial_loop {

	public static void main(String[] args) {
		results();
	}

public static void results() {
	
	int number = 5; //the number to calculate the factorial
	
	//printing the results of loops
	System.out.println("The factorial of " + number + " is : "  + forLoop(number));
	System.out.println("The factorial of " + number + " is : "  + whileLoop(number));
	System.out.println("The factorial of " + number + " is : "  + doWhileLoop(number));
	
	System.out.println();
	
	//printing the results for recursion
	System.out.println("The factorial (using recursion) of " + number + " is : "  + recursion(number));
	
}

//using loop for, while and do while

public static short forLoop( int number ) {

	short factorial = 1;
	for (int a = 1; a <= number; a++ ) {
		//calculating the factorial
		factorial *= a;
	}
	
	return factorial;
  }


public static short whileLoop( int number ) {
	
	short factorial = 1;
	int a = 1;
	while( a <= number ) {
		
		//calculating the factorial
		factorial *= a;
		a++;
	}
	return factorial;	
}

public static short doWhileLoop( int number ) {
	
	short factorial = 1;
    int a = 1;

    do {
    	
    	//calculating the factorial
    	 factorial *= a; 
         a++;
}
    while (a <= number);
    return factorial;
    
   }

//recursion for factorial
public static int recursion( int number) {

	  if ( number == 0 )    
		    return 1;    
		  else    
			  return number * recursion( number - 1 );  
		 }
}





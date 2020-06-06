package basics;

public class operations {

	public static void main(String[] args) {
		
		//1.Увеличивает a и b 1 раз (a++ + b++ + c) и использует изначальное значение в a + b + c  (постинкремент)
		int a = 10;    //11
		int b = 100;   //101
		int c = 1000;  //1000
        int result1 = a+++b+++c; //10+100+1000 -> 1110
		
		System.out.println( "( " + a + "," + b + "," + c + " ) -> " + result1 );
		
		
		//2.Увеличивает все значения 1 раз (преинкремент)
		int d = 10;   //11
		int e = 100;  //101
		int f = 1000; //1001
		int result2 = ++d + ++e + ++f; //11+101+1001 -> 1113

		System.out.println( "( " + d + "," + e + "," + f + " ) -> " + result2 );
		
		
		//3.Увеличивает на 1, 3 раза значение (преинкремент)
		int x = 10;   //11+12+13 -> 36
		int result3 = ++x + ++x + ++x;

		System.out.println( "( " + x + " ) -> " + result3 );
		
		
		
		//4.Увеличивает второе значение 1 раз а третья значение на 2 (постинкремент)
		int y = 10; //10+11+12 -> 33
		int result4 = y+++y+++y; 

		System.out.println( "( " + y + " ) -> " + result4 );
		
		
	}
	

}




package basics;

public class marks_if_else {

	public static void main(String[] args) {
		
		int s1 = 10;
		int s2 = 9;
		int ex = 8;
		
		// 0.2 semester ratio
		// 0.6 total ratio exam
		
		float gm = ( s1 + s2 ) * 0.2f + ex * 0.6f; //total of general mark
		
		System.out.println( "Semester 1: " + s1 );
		System.out.println( "Semester 2: " + s2 );
		System.out.println( "Exam: " + ex );
		System.out.println( "General mark: " + gm );
		
		if( gm >= 1.0 && gm < 4.9 ) {
			System.out.println( "very bad mark");
		} else if ( gm >= 5.0 && gm < 6.9 ) {
		    System.out.println( "bad mark" );
		} else if ( gm >= 7.0 && gm < 8.9) {
			System.out.println( "good mark" );
		} else if ( gm >= 9.0 && gm < 10.0) {
			System.out.println( "excellent mark" );
		} else {
			System.out.println( "Wrong Value" );
		}
		
		

	}

}

package basics;

//main class

public class DataWrapApp {

	public static void main(String[] args) {
		DataWrapper.wrapApp();
	}

}


// secondary class
class DataWrapper {
	
	static void wrapApp() {
		
		System.out.println( wrapSquare( "array" ) );
		System.out.println( wrapAngle( "tag" ) );
		System.out.println( wrapRound( "0.5" ) );
		
	}
	
	//wrapSquare[]
	static String wrapSquare( String text ) {
		  return "[" + text + "]";
		}
	static String wrapSquare( int text ) {
		  return "[" + text + "]";
		}
	static String wrapSquare( double text ) {
		  return "[" + text + "]";
		}
	static String wrapSquare( char text ) {
		  return "[" + text + "]";
		}
	
	//wrapAngle<>
	static String wrapAngle( String text ) {
		  return "<" + text + ">";
		}
	static String wrapAngle( int text ) {
		  return "<" + text + ">";
		}
	static String wrapAngle( double text ) {
		  return "<" + text + ">";
		}
	static String wrapAngle( char text ) {
		  return "<" + text + ">";
		}
	
	//wrapRound()
	static String wrapRound( String text ) {
		  return "(" + text + ")";
		}
	static String wrapRound( int text ) {
		  return "(" + text + ")";
		}
	static String wrapRound( double text ) {
		  return "(" + text + ")";
		}
	static String wrapRound( char text ) {
		  return "(" + text + ")";
		}
	

}
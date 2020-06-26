package basics;

import java.lang.Math;

public class SecondExampleApp {
	
	public static void main(String[] args) {
		
		 Circle bigCircle = new Circle( 11, 0, 100 );
		 Circle smallCircle = new Circle( 0, -10, 10 );

		 
		        bigCircle.print();
		        smallCircle.print();
		
	}

}

class Circle {
	 
	int cx;
	int cy;
	int radius;
	boolean valid;
	private float area;
	
	//constructor
	Circle(int pcx, int pcy, int pr) {
	//	System.out.println("It works");
		cx = pcx;
		cy= pcy;
		if( pr >= 0 ) {
			radius = pr;
			valid = true;
		} else {
			System.out.println("NEGATIVE RADIUS VALUE!!!");
			valid = false;
		}
		
		
	}
	
	//printing logic
	void print() {
		if( valid ) {
		    System.out.println(
				"########## CIRCLE ##########\n" +
		        "RADIUS: " + radius + "\n"       +
		        "center: " + cx + "," + cy + "\n"+ 
		        "############################\n" 
				);
		} else {
			System.out.println(
			    "########## CIRCLE (BROKEN!!!)##########\n"
				);
		}
		
	}
	//it will check: if valid   -> will return area
	//               if invalid -> will return -1
	float calculateArea() {
		if ( valid ) {
			area = ( float ) ( radius * radius * Math.PI );
			return ( float ) area;
	} else {
		    return -1;
    }
  }

}
  

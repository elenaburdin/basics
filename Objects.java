package basics;

public class Objects {

	public static void main(String[] args) {
		
		Student goodStudent = new Student();
		        goodStudent.setProperties(8.0f, (byte) 3, true);
		      
		        
		Student badStudent = new Student();
		        badStudent.setProperties(1.0f, (byte) 2, false);
		      
		        goodStudent.sayAbout();
		         badStudent.sayAbout();
		
		
		

	}

}

class Student {
	//dynamic properties
	float   avgMark;
	byte    grade;
	boolean approved;
	
	//dynamic methods - behavior
	void setProperties(float am, byte g, boolean ap) {
		//block for marks 
		if( am < 10.1 && am > 0.0 ) {
			avgMark = am;
		} else {
			System.out.println( "Wrong value");
		}
		avgMark  = am;
		grade    = g;
		approved = ap;
		
		
	}
	void sayAbout() {
		System.out.println( "I am a student!" );
		System.out.println( "I am in the " + grade + " grade" );
		//5 levels of student performance
		if( avgMark == 10.0f ) {
			System.out.println( "I am a perfect student");
		} else if (avgMark >= 9.0f ) {
		    System.out.println( "I am a excelent student" );
		} else if ( avgMark >= 7.0f ) {
			System.out.println( "I am a good student" );
		} else if ( avgMark >= 5.0f ) {
			System.out.println( "I am bad student" );
		}  else if ( avgMark >= 1.0f ) {
			System.out.println( "I stay in the second year" );
		}
		System.out.println();
	}
	
}
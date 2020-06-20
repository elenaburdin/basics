package basics;

public class Inheritance {

	public static void main(String[] args) {
		HorizontalLine.drawLine(7);
		VertivalLine.drawLine(3);
		Rectangle.drawRect(4,4);
		

	}

}
//Basic class
class Shape {
    static void drawHash() {
        System.out.print("#");
    }
    static void drawSpace() {
        System.out.print(" ");
        
    }
    static void NoSpace() {
        System.out.print("");
        
    }
    static void newLine() {
        System.out.print("\n");
    }
}

class HorizontalLine extends Shape{
    static void drawLine(int length) {
        for(int i=0; i<length; i++){
            drawHash();
            NoSpace();
        }
    }
}

class VertivalLine extends Shape{
    static void drawLine(int length) {
        for(int i=0; i<length; i++){
        	System.out.println();
        	newLine();
            drawHash();
            drawSpace();
            
        }
        System.out.println();
   
    }
}

class Rectangle extends Shape{
    static void drawRect(int length, int width) {
        for(int i=1; i <= length; i++){
        	
        	newLine();
        	drawHash();
        	drawHash();
        	drawHash();
        	drawHash();
        	for(int n=1; n <= width; n++){
        	

        	}
        }
    }
}








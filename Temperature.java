package basics;

public class Temperature {

	public static void main(String[] args) {
		
		System.out.println("Fahrenheit to Celsius " + Fahrenheit.toFahrenheit(50.0f));
		System.out.println("Celsius to Fahrenheit " + Celsius.toCelsius(10.0f));



	}

}
//Convert Fahrenheit temperature to Celsius temperature
class Fahrenheit {

	static float toFahrenheit ( float fahrenheit ) {
	    return (fahrenheit - 32.0f ) * 5.0f / 9.0f;
  }
}
//Convert Celsius temperature to Fahrenheit temperature
class Celsius {
	static float toCelsius (float celsius) {
		return celsius * 1.8f + 32.0f;
		
	}
}
	

	
	
	



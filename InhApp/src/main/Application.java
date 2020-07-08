package main;

import auto.AutoTransport;
import auto.AviaTransport;
import auto.Transport;


public class Application {

	public static void main(String[] args) {
		
		// FORBIDDEN
        //Transport tp1 = new Transport();
    
        Transport avt; // polymorth - SOLID
                  avt = new AviaTransport();
                  avt.printInfo();
                  ((AviaTransport)avt).letsSee();
                  
                  avt = new AutoTransport();
                  avt.printInfo();
                  

         
        
	}

	

}

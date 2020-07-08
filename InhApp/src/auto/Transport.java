package auto;


public abstract class Transport {

	
	private String environment; // "air", "water", "under water", "land",..
	
	// constructor
    public Transport () {} // default constructor
    public Transport (String environment) {
		
		this.setEnvironment(environment);
	}
	public String getEnvironment () {
		return environment;
	}
	public void setEnvironment (String environment) {
//if else -> only for "air", "water", "under water", "land",..
   
		if( environment == "air" || environment == "water" || environment == "under water" || environment == "land") {
		this.environment = environment;	
		} else {
			System.out.println("Wrong transport");
		}
	}
		
		public void printInfo () {
			System.out.println("################################");
			if(environment != null) {
				System.out.println("Transport for " + environment);
			} else {
				System.out.println("Unknown Environment!");
			}	
			System.out.println("################################\n");
		}
    }



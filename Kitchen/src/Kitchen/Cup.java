package Kitchen;

public class Cup {
	
	 private String liquidName;
	 private int liquidVolume;
	 
	 Cup() { 
	    }
	 
	    public Cup ( String liquidName, int liquidVolume ) {
	          this.liquidName = liquidName;
	          this.liquidVolume = liquidVolume;
	    }

	    //  +set/+get
	 public String getLiquidName() {
		  return liquidName;
		}
	 
	 public void setLiquidName( String liquidName ) {
	  if ( liquidName.trim().equals ("Water") && liquidName.trim().equals ("Milk") && liquidName.trim().equals ("Tea") )
		  this.liquidName = liquidName;
	}
	 public int getLiquidVolume() {
			return liquidVolume;
		}
	 public void setLiquidVolume( int liquidVolume ) {
		 if ( liquidVolume > 0 && liquidVolume < 600 ) {
			 this.liquidVolume = liquidVolume;
		 } else {
			 System.out.println("wrong mll");
		 }
		 
	 }

}
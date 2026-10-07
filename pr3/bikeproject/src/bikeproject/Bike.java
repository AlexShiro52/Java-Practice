package bikeproject;

public class Bike implements BikeParts {

	private String handleBars, frame, tyres, seatType;
	private int NumGears;
	private final String make;
	
	public String getHandleBars() {
		return handleBars;
	}

	public void setHandleBars(String newValue) {
		this.handleBars = newValue;
	}

	public String getFrame() {
		return frame;
	}

	public void setFrame(String newValue) {
		this.frame = newValue;
	}

	public String getTyres() {
		return tyres;
	}

	public void setTyres(String newValue) {
		this.tyres = newValue;
	}

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String newValue) {
		this.seatType = newValue;
	}

	public int getNumGears() {
		return NumGears;
	}

	public void setNumGears(int newValue) {
		this.NumGears = newValue;
	}
	public Bike() {
		this.make = BikeParts.MAKE;
	}//end constructor
	
	public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
		this.handleBars = handleBars;
		this.frame = frame;
		this.tyres = tyres;
		this.seatType = seatType;
		NumGears = numGears;
		this.make = BikeParts.MAKE;
	}//end constructor

	protected void printDescription()
	{
		System.out.println("\n" + this.make + "\n" 
				          + "This bike has " + this.handleBars + " handlebars on a " 
				          + this.frame + " frame with " + this.NumGears + " gears."  
				          + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
	}//end method printDescription

}//end class Bike
	
	


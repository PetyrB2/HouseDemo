
public class House {

	// Attributes
	private String ID;
	private int houseNumber;
	private String address;
	private int numStories;
	private int numBedRooms;
	private int numWindows;
	private String colour;

	// No-Arg Constructor (Default ctor)
	public House() {
		ID = "Z001";
		houseNumber = 1;
		address = "Home";
		numStories = 2;
		numBedRooms = 2;
		numWindows = 8;
		colour = "White";
	}// end ctor

	// Parameterised Constructor
	public House(String ID, int houseNumber, String address, int numStories, 
			int numBedRooms, int numWindows, String colour) {

		this.ID = ID;
		this.houseNumber = houseNumber;
		this.address = address;
		this.numStories = numStories;
		this.numBedRooms = numBedRooms;
		this.numWindows = numWindows;
		this.colour = colour;
		
	}// end ctor

	// Getters and Setters

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumStories() {
		return numStories;
	}

	public void setNumStories(int numStories) {
		this.numStories = numStories;
	}

	public int getNumWindows() {
		return numWindows;
	}

	public void setNumWindows(int numWindows) {
		this.numWindows = numWindows;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNumBedRooms() {
		return numBedRooms;
	}

	public void setNumBedRooms(int numBedRooms) {
		this.numBedRooms = numBedRooms;
	}

}// EOF


public class HouseDemo {

	public static void main(String[] args) {
		// Intro
		System.out.println("=======================================================");
		System.out.println("Title: House Demo");
		System.out.println("Genre: Java Basics");
		System.out.println("Author: Peter Broadbent");
		System.out.println("Language: Java \n" + "Version: " + System.getProperty("java.version"));
		System.out.println("Description:\n\tA basic Java program to list houses and "
				+ "\n\ttheir details, such as number of windows etc.");
		System.out.println("=======================================================\n");

		// Begin code
		House theGateHouse47 = new House();
		House theTowerHouse = new House();

		theGateHouse47.setID("OX001");
		theGateHouse47.setNumBedRooms(4);
		theGateHouse47.setAddress("The Gate House, Oxshott");
		theGateHouse47.setColour("White");
		theGateHouse47.setHouseNumber(47);
		theGateHouse47.setNumStories(3);
		theGateHouse47.setNumWindows(14);

		theTowerHouse.setID("LON001");
		theTowerHouse.setHouseNumber(1);
		theTowerHouse.setAddress("The Tower, London");
		theTowerHouse.setNumStories(4);
		theTowerHouse.setNumBedRooms(6);
		theTowerHouse.setNumWindows(12);
		theTowerHouse.setColour("Grey");

		System.out.println("Begin Listings....");
		System.out.println("");
		
		// Print out the Gate House 47
		System.out.println("=================================================");
		System.out.println("Listing ID: " + theGateHouse47.getID());
		System.out.println("House Number: " + theGateHouse47.getHouseNumber());
		System.out.println("House Address: " + theGateHouse47.getAddress());
		System.out.println("Number of Stories: " + theGateHouse47.getNumStories());
		System.out.println("Number of Bedrooms: " + theGateHouse47.getNumBedRooms());
		System.out.println("Number of Windows: " + theGateHouse47.getNumWindows());
		System.out.println("Colour: " + theGateHouse47.getColour());
		System.out.println("");
		System.out.println("=================================================");
		System.out.println("");
		
		// Print out the Tower House
		System.out.println("Listing ID: " + theTowerHouse.getID());
		System.out.println("House Number: " + theTowerHouse.getHouseNumber());
		System.out.println("House Address: " + theTowerHouse.getAddress());
		System.out.println("Number of Stories: " + theTowerHouse.getNumStories());
		System.out.println("Number of Bedrooms: " + theTowerHouse.getNumBedRooms());
		System.out.println("Number of Windows: " + theTowerHouse.getNumWindows());
		System.out.println("Colour: " + theTowerHouse.getColour());
		System.out.println("");
		System.out.println("=================================================");
	}

}

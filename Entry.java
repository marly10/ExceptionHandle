/*
Ricky McKenzie
Lab4
*/

public class Entry {

	//instance variables
	private int x;
	private int y;
	private String name;

	//counts times object was created usinf class
	static int countId = 0;

	//entry has a constructor that initializes 
	public Entry(int x, int y, String name) {

		this.x = x;
		this.y = y;
		this.name = name;
		countId++;
	}
	//getter
	public int getNewcountId() {
		return countId;
	}

	//auto increasing file count based on times created
	public static int getCountId() {
		return countId;
	}

	//Add a toString to print the x y and name
	public String toString() {
		String toReturn = x + " " + y + " " + name;
		return toReturn;
	}


}
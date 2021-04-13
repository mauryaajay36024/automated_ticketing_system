package parking_slot.slots;

public class Slots {
	private int noOfFloors;
	private int floorCapacity;
	private int totalCapacity=noOfFloors*floorCapacity;
	String[][] slots=new String[totalCapacity][];
	
	public Slots() {
		this.noOfFloors=5;
		this.floorCapacity=20;
		this.totalCapacity=20*5;
		this.slots=new String[this.totalCapacity][];
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public int getFloorCapacity() {
		return floorCapacity;
	}

	public void setFloorCapacity(int floorCapacity) {
		this.floorCapacity = floorCapacity;
	}

	public String[][] getSlots() {
		return slots;
	}

	public void setSlots(String[][] slots) {
		this.slots = slots;
	}


}

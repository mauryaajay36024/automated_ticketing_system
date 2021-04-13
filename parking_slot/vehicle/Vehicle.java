package parking_slot.vehicle;

import java.util.Scanner;

public class Vehicle{
	private String vehicleNo;
	private String vehicleColour;
	public int vehicleInfo; 
	
	

	public Vehicle() {
		this.vehicleNo = "";
		this.vehicleColour = "";
		this.vehicleInfo = 2;  //As it will store only two info i.e No and colour
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getVehicleColour() {
		return vehicleColour;
	}

	public void setVehicleColour(String vehicleColour) {
		this.vehicleColour = vehicleColour;
	}
	public void addInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Vehicle No :");
		this.vehicleNo=sc.nextLine();
		System.out.print("Enter Vehicle Colour :");
		this.vehicleColour=sc.nextLine();
		
	}
	public void printInfo() {
		System.out.println("Vehicle No     :"+this.vehicleNo);
		System.out.println("Vehicle Colour :"+this.vehicleColour);
		
	}
}

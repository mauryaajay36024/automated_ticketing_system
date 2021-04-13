package parking_slot.ticket;
import java.util.Scanner;

import parking_slot.slots.*;
import parking_slot.vehicle.Vehicle;


public class Ticket extends Slots {
	Vehicle vehicle=new Vehicle();
	
	public void ticketGenerate() {
		for (int i = 0; i < this.getSlots().length; i++) {
			if(this.getSlots()[i]==null) {
				//to create an array to store vehicle info 
				//i.e vehicle registration no and its colour 

				this.getSlots()[i]=new String[vehicle.vehicleInfo];
				
				//To add vehicle details 
				vehicle.addInfo();
				//++++++++++++++++++++++++++++++++++++
				this.getSlots()[i][0]=vehicle.getVehicleNo();
				this.getSlots()[i][1]=vehicle.getVehicleColour();
				//+++++++++++++++++++++++++++++++++++++++
				
				//printing ticket
				System.out.println("______Ticket______");
				vehicle.printInfo();
				System.out.println("Vehicle available slot :"+(i+1));
				break;
			}
		}
	}
	public void slotDeallocate() {
		Scanner sc =new Scanner(System.in);
		//To check entered Registration is valid/available
		boolean check=false;
		System.out.print("Enter Registration no to make slot available :");
		String registrationNo=sc.nextLine();
		for (int i = 0; i < this.getSlots().length; i++) {
			if(this.getSlots()[i] !=null && this.getSlots()[i][0].equals(registrationNo)) {
				this.getSlots()[i]=null;
				System.out.println("Parking slot is "+(i+1)+ " is Deallocated");
				check=true;
				break;
			}
		}
		if (!check)
			System.err.println("Registration number not available, Try again");
		
		
	}

}

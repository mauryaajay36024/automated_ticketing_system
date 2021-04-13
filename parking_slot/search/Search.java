package parking_slot.search;
import java.util.Scanner;
import parking_slot.slots.Slots;

public class Search extends Slots{

	public void searchByRegistration() {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Registration No to Search the car's slot No:");
		String rc=sc.nextLine();
		int flag=0;
		for (int i = 0; i < this.getSlots().length; i++) {
			if(this.getSlots()[i] !=null && this.getSlots()[i][0].equals(rc)) {
				flag=1;
				System.out.println();
				System.out.println("Vehicle slot No is :"+(i+1));
				break;
				
			}
		}
		if(flag==0) {
			System.out.println();
			System.err.println("Vehicle No is incorrect or not found");
		}	
	}
	
	//Method to search car registration by there colour
	public void rnByColour() {
		Scanner sc =new Scanner(System.in);
		System.out.println();
		System.out.print("Enter Colour to find out Registration Numbers :");
		String colour=sc.nextLine();
		System.out.println();
		int flag =0;
		for (int i = 0; i < this.getSlots().length; i++) {
			if(this.getSlots()[i] !=null && this.getSlots()[i][1].equals(colour)) {
				flag =1;
				System.out.println("Car Registration Number :"+this.getSlots()[i][0]);
			}
			
		}
		if(flag == 0) {
			System.err.println("This colour car is not parked yet !!");
		}
		
	}
	
	//Method to find slot no by the car colour
	public void slotByColour() {
		Scanner sc =new Scanner(System.in);
		System.out.println();
		System.out.print("Enter Colour to find out Slot Numbers :");
		String colour=sc.nextLine();
		System.out.println();
		int flag=0;
		for (int i = 0; i < this.getSlots().length; i++) {
			if(this.getSlots()[i] !=null && this.getSlots()[i][1].equals(colour)) {
				flag=1;
				System.out.println("Car Slot Number :"+(i+1));
			}	
		}
		if(flag==0) {
			System.err.println("This colour car is not parked yet !!");
		}	
	}
}
	

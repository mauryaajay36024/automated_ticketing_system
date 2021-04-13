package parking_slot;
import parking_slot.menu.*;
import parking_slot.ticket.Ticket;
import parking_slot.search.*;


public class Main {

	public static void main(String[] args) {
		System.out.println("\t\t\t\t Automatic Parking System");
		Ticket ticket=new Ticket();
		Search search = new Search();
		Menu menu=new Menu();
		
		while(true) {
			switch(menu.mainMenu()) {
			case 1:
				//generate
				ticket.ticketGenerate();
				break;
				
			case 2:
				//deallocate
				ticket.slotDeallocate();
				break;
				
			case 3:
				//Search
				int choice=menu.searchMenu();
				switch(choice) {
				case 1:
					//search by colour
					int ch=menu.colourMenu();
					switch(ch) {
					case 1:
						//Registration numbers of all cars of a particular colour.
						search.rnByColour();
						break;
						
					case 2:
						//Slot numbers of all slots where a car of a particular colour is parked.	
						search.slotByColour();
						break;
						
					default:
						System.err.println("Wrong choice !!!!");
						break;
					}
					break;

				case 2:
					//search by registration
					search.searchByRegistration();
					break;
					
				default:
					System.err.println("Wrong choice !!!");
				}
				break;
				
			default :
				System.err.println("Wrong Choice");
				break;
			
			}
		}
		

	}

}

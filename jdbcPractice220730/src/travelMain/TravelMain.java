package travelMain;

import travel.TravelController;
import travel.TravelMenu;

public class TravelMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			new TravelMenu().travelMenu();
			new TravelMenu().cateSelectMenu();
			new TravelController().attraction();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

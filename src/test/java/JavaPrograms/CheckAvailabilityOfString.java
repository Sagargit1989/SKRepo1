package JavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class CheckAvailabilityOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<String>();
		names.add("Sagar");
		names.add("Sheetal");
		names.add("Liku");
		
		System.out.println(names.contains("Sagar"));
		
		/*
		 * List<String> cities=List.of("BBSR", "CTC", "CHN", "BLR");
		 * System.out.println(cities.contains("BBSR"));
		 * 
		 * for(String city:cities) { if(city.equals("CTC")) {
		 * System.out.println("CTC is available"); } }
		 */
		

	}

}

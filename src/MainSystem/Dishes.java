package MainSystem;
import java.util.*;
import java.lang.*;

public class Dishes {
	
	private ArrayList<Dish> dishes= new ArrayList<Dish>();

	public Dishes(ArrayList<String> input) {
		
		String str;
		for(int i = 0; i < input.size(); i++) {
			//input format = {start time}/{dish name} {dish name} {dish name}
			str = input.get(i);
			int delimiter = str.indexOf('/');
			String starttime_str = str.substring(0, delimiter);
			int starttime = Integer.parseInt(starttime_str);
			String dishes_str = str.substring(delimiter + 1);
			String[] dishes_array = dishes_str.split(" ");
			
			for (int j = 0; j < dishes_array.length; j++) {
				//Please implement your hash table in below
				switch(dishes_array[j]) {
				//sample
				case "beef":
					Beef beef = new Beef(starttime);
					dishes.add(beef);
					break;
				default:
					System.out.println("input error");
					break;
				}	
			}
		}
		
		//Please implement priority sort in the below
	}
	
	public ArrayList<Dish> get_dishes() {
		return dishes;
	}
}

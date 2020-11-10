package MainSystem;

import java.util.ArrayList;
import java.util.PriorityQueue;

import Cusine.Dish;
import Cusine.DishRegistry;

/*
 * The driver program for the restaurant to receive orders
 */
public class Reception {
	
	private static Reception reception_restaurant = null;
	
	// variables here
	private PriorityQueue<Dish> input_dish = null;
	
	
	private Reception() {
		input_dish = new PriorityQueue<>();
		input_dish.clear();
	}
	
	private void OrderToDish(String in_order)
	{
		int delimiter = in_order.indexOf('/');
		String starttime_str = in_order.substring(0, delimiter);
		int starttime = Integer.parseInt(starttime_str);
		String dishes_str = in_order.substring(delimiter + 1);
		String[] dishes_array = dishes_str.split(" ");
		
		for (int j = 0; j < dishes_array.length; j++) {
			this.input_dish.add(
					DishRegistry.getDishRegistry().
					StringToDish(dishes_array[j], starttime));
		}
	}
	
	public static Reception getReception()
	{
		if (reception_restaurant == null)
		{
			reception_restaurant = new Reception();
		}
		return reception_restaurant;
	}
	
	public void getListOfDishes(){
		/*
		for (Dish d : this.input_dish)
		{
			System.out.println(d.get_name() + 
					", start time= " + d.get_starttime() +
					", type = " + d.get_type());
		}
		*/
		// priority queue is implemented as a heap.
		while (input_dish.size() > 0) {
			Dish polled = input_dish.poll();
			System.out.println(polled.get_name() + 
					", start time= " + polled.get_starttime() +
					", type = " + polled.get_type());
		}
	}
	
	/*
	 * Receives orders, convert into list of dishes
	 * */
	public void input_order(String in_order)
	{
		OrderToDish(in_order);
	}
	
	public void restartReception()
	{
		reception_restaurant = new Reception();
	}
	
	
}

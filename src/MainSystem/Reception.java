package MainSystem;

import java.util.ArrayList;

/*
 * The driver program for the restaurant to receive orders
 */
public class Reception {
	
	private static Reception reception_restaurant = null;
	
	private ArrayList<String> input_order = new ArrayList<String>();
	
	private Reception() {
		input_order.clear();
	}
	
	public static Reception getReception()
	{
		if (reception_restaurant == null)
		{
			reception_restaurant = new Reception();
		}
		return reception_restaurant;
	}
	
	public void input_order(String in_order)
	{
		input_order.add(in_order);
	}
	
	public void restartReception()
	{
		reception_restaurant = new Reception();
	}
}

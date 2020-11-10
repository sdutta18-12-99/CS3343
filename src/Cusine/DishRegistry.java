package Cusine;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/*
 * Singleton class for the String to dish mapping
 */
public class DishRegistry {
	
	public static DishRegistry dish_registry = null;
	
	private Map<String, Class<? extends Dish>> registry;
	
	private DishRegistry()
	{
		registry = new HashMap<>();
		registry.put("beef", Beef.class);
		registry.put("cake", Cake.class);
		registry.put("crackers", Crackers.class);
		registry.put("fish", Fish.class);
	}
	
	public static DishRegistry getDishRegistry()
	{
		if (dish_registry == null)
		{
			dish_registry = new DishRegistry();
		}
		return dish_registry;
	}
	
	public Dish StringToDish(String dish_name, int start_time_in)
	{
		try {
			return registry.get(dish_name).
					getDeclaredConstructor(int.class).
					newInstance(start_time_in);
			
		} catch (IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
}

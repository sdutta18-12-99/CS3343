package Cusine;

public class Beef extends Dish {
	
	private static final int duration = 10;
	private static final int type = 1;
	private static final String name = "beef";
	//allowance is the time permitted for dishes to delay start the cooking
	//in this case, this dish is start at starttime + allowance
	//for appetizer, allowance = 0
	//desert should have higher allowance
	private static final int allowance = 15;
	
	
	public Beef(int starttime) {
		super(starttime, allowance, duration, type, name);
	}

}

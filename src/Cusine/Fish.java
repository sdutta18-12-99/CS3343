package Cusine;

public class Fish extends Dish{
	private static final int duration = 15;
	private static final int type = 1;
	private static final String name = "fish";
	private static final int allowance = 10;
	
	
	public Fish(int starttime) {
		super(starttime, allowance, duration, type, name);
	}

}

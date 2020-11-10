package Cusine;

public class Crackers extends Dish{
	private static final int duration = 3;
	private static final int type = 0;
	private static final String name = "crackers";
	private static final int allowance = 0;
		
	public Crackers(int starttime) {
		super(starttime, allowance, duration, type, name);
	}
}
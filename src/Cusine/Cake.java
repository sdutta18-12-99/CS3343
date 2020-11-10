package Cusine;

public class Cake extends Dish{
	private static final int duration = 10;
	private static final int type = 2;
	private static final String name = "cake";
	private static final int allowance = 30;
	
	public Cake(int starttime) {
		super(starttime, allowance, duration, type, name);
	}
}

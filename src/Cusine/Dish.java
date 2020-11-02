package Cusine;

public class Dish {
	
	//starttime is the time the dish need to start cooking
	protected int starttime;
	//duration is the time need to finish cooking
	protected int duration;
	protected String type;
	protected String name;
	
	public Dish(int starttime, int duration, String type, String name) {
		this.starttime = starttime;
		this.duration = duration;
		this.type = type;
		this.name = name;
	}
	
	public int get_starttime() {
		return starttime;
	}
	
	public int get_duration() {
		return duration;
	}
	
	public String get_type() {
		return type;
	}
	
	public String get_name() {
		return name;
	}
}

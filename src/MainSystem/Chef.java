package MainSystem;
import java.io.*;
import java.util.*;

public class Chef {
	
	public static ArrayList<String> input = new ArrayList<String>();
	
	public static void main(String args[]) throws IOException {  
      

      try {
		Scanner scanner = new Scanner(new File("./src/MainSystem/myfile.txt"));
		while (scanner.hasNextLine()) {
			input.add(scanner.nextLine());
		}
		
		Dishes dishes = new Dishes(input);
		//get_sequence(dishes);
		//Please implement interval partitioning in the below
		
		scanner.close();
      } 
      catch (FileNotFoundException e) {
		e.printStackTrace();
      }
	}
	
	public static void get_sequence(Dishes dishes){
		ArrayList<Dish> d = dishes.get_dishes();
		for (int i = 0; i < d.size(); i++) {
			System.out.println(d.get(i).get_name());
		}
	}
}

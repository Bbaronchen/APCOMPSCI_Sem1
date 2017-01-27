import java.util.Scanner;
public class ApLesson12_EX01_Runner 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter distance:");
		int distance = kb.nextInt();
		System.out.println("Enter hours:");
		int hours = kb.nextInt();
		System.out.println("Enter minutes:");
		int minutes = kb.nextInt();
		
		Mph mph = new Mph(distance, hours, minutes);
		System.out.println(mph.getDistance() + " miles in " + mph.getHours() + " hours and "
				+ mph.getMinutes() + " minutes = "
				+ mph.getMph() + " mph");
				
		System.out.println("Enter distance:");
		distance = kb.nextInt();
		System.out.println("Enter hours:");
		hours = kb.nextInt();
		System.out.println("Enter minutes:");
		minutes = kb.nextInt();
		mph.setDistance(distance);
		mph.setHours(hours);
		mph.setMinutes(minutes);
		System.out.println(mph.getDistance() + " miles in " + mph.getHours() + " hours and "
				+ mph.getMinutes() + " minutes = "
				+ mph.getMph() + " mph");
	}
}
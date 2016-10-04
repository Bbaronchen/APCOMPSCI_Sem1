import java.util.Scanner;

public class Lesson_4_3_04
{
	public static void main(String[]args)
	{
		Lesson_4_3_04 Volume = new Lesson_4_3_04();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter radius of circle.");
		double r = keyboard.nextDouble();
		
		double area = Volume.calcArea(r);
		
		System.out.printf("The area of a circle with a radius of r is %1.5f.", area );
	}
	
	public double calcArea(double one)
	{
		return 3.14* (Math.pow (one, 2));
	}
}
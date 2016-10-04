import java.util.Scanner;

public class Lesson_4_2_04
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{		
	    Lesson_4_2_04 Volume = new Lesson_4_2_04();
	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter radius of circle.");
		r = keyboard.nextDouble();
		
		calcArea();
		print();
		
	}
	
	public static void calcArea()
	{
		area = 3.14* (Math.pow (r, 2));
	}
	
	public static void print()
	{
		System.out.printf("The area of a circle with a radius of %1.5f is %1.5f.", r, area );
	}
}
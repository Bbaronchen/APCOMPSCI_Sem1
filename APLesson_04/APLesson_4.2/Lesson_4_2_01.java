import java.util.Scanner;

public class Lesson_4_2_01
{
	static double l;
	static double w;
	static double p;
	
	public static void main(String[]args)
	{		
	    Lesson_4_2_01 Volume = new Lesson_4_2_01();
	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter length in feet.");
		l = keyboard.nextDouble();
		System.out.println("Enter width in feet.");
		w = keyboard.nextDouble();
		
		calcPerim();
		print();
		
	}
	
	public static void calcPerim()
	{
		p = l*w;
	}
	
	public static void print()
	{
		System.out.printf("Your rectangle is %1.5f ft around.", p );
	}
}
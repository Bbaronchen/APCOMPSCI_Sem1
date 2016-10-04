import java.util.Scanner;

public class Lesson_4_2_03
{
	static double l;
	static double sa;
	
	public static void main(String[]args)
	{		
	    Lesson_4_2_03 Volume = new Lesson_4_2_03();
	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter length in feet.");
		l = keyboard.nextDouble();
		
		calcSurf();
		print();
		
	}
	
	public static void calcSurf()
	{
		sa = 6* (Math.pow (l, 2));
	}
	
	public static void print()
	{
		System.out.printf("The surface area of a cube with %5.5f sides is %5.5f", l ,sa );
	}
}
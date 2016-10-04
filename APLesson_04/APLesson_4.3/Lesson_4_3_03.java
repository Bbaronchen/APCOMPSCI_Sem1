import java.util.Scanner;

public class Lesson_4_3_03
{
	public static void main(String[]args)
	{
		Lesson_4_3_03 Volume = new Lesson_4_3_03();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the length of 1 side.");
		double l = keyboard.nextDouble();
		
		
		double sa = Volume.calcSurf(l);
		
		System.out.printf("The surface area of a cube with %5.5f sides is %5.5f", l ,sa );
	}
	
	public double calcSurf(double one)
	{
		return 6* (Math.pow (one, 2)) ;
	}
}
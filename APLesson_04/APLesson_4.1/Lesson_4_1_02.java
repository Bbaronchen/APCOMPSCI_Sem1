import java.util.Scanner;

public class Lesson_4_1_02
{
	public static void main(String[]args)
	{
		Lesson_4_1_02 Volume = new Lesson_4_1_02();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter height in inches.");
		double h = keyboard.nextDouble();
		System.out.println("Enter length in inches.");
		double l = keyboard.nextDouble();
		System.out.println("Enter width in inches.");
		double w = keyboard.nextDouble();
		
		double SubVol = Volume.calcVol(h, l , w);
		
		System.out.printf("The volume of the  is Subwoofer Box %1.5f cubic foot", SubVol );
	}
	
	public double calcVol(double one, double two, double three)
	{
		return one * 0.0833333 * two * 0.0833333 * three * 0.0833333;
	}
}
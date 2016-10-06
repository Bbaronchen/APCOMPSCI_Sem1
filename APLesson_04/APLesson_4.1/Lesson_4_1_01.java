import java.util.Scanner;
	public class Lesson_4_1_01
{
	public static void main(String[]args)
	{
		Lesson_4_1_01 CompIn = new Lesson_4_1_01();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter interest rate.");
		double R = keyboard.nextDouble();
		System.out.println("Enter principal (the original amount you intend to borrow).");
		double P = keyboard.nextDouble();
		System.out.println("Enter number of times the loan is compounded per year.");
		double N = keyboard.nextDouble();
		System.out.println("Enter life of the loan (in years).");
		double L = keyboard.nextDouble();
		
		double RtoPercent = R / 100;
		
		double CompoundInterest = CompIn.calcCI(RtoPercent, P,N,L);
		
		System.out.printf("Your total monthly payment will be $ %1.6f", CompoundInterest );
	}
	
	public double calcCI(double one, double two, double three, double four)
	{
		return (two * Math.pow( 1 + one / three, three * four))/(four*12);
	}
}
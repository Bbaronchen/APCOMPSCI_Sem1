import java.util.Scanner;

public class APLesson_06_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int number = kb.nextInt();
		
		for(int i=1; i <= number; i++)
		{
			System.out.println(i * number);
		}
		
	}
	
}
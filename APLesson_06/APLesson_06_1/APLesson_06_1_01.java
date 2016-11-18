import java.util.Scanner;

public class APLesson_06_1_01
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the starting number of the loop:");
		int min = kb.nextInt();
		
		System.out.println("Enter the ending number of the loop:");
		int max = kb.nextInt();
		
		for(int i=min; i <= max; i+= min)
		{
			System.out.print(i + " ");
		}
		
	}
	
}
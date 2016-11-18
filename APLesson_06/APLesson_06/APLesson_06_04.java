import java.util.Scanner;

public class APLesson_06_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		int number = kb.nextInt();
		
		System.out.println("Enter the size of the table: ");
		int size = kb.nextInt();
		
		for(int i=1; i <= size; i++)
		{
			format(i, number *i);
		}
			
	}
	public static void format(int i, int number)
	{
		
		System.out.println( i + "  |  " + i * number);
	}
}
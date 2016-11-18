import java.util.Scanner;

public class APLesson_06_1_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a word:");
		String word = kb.nextLine();
		
		int x = word.length() - 1;
		
		for(int i = 0; i <= x; i++)
		{
			System.out.println(word.substring(i));
		}
		
	}
	
}
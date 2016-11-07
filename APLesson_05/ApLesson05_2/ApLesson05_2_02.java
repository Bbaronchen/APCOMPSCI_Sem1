import java.util.Scanner;

public class ApLesson05_2_02
{
	public static void main(String[]args)
	{	
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your username: ");
		String username = kb.nextLine();
		System.out.println("Enter your password: ");
		String password = kb.nextLine();
		
		passCheck(username, password);
	}
	
	public static void passCheck(String username, String password)
	{
		if (username.equals("ASB") && password.equals("BSA"))
		{
			System.out.println(" You are granted access!");
		}
		
		if (username.equals("ASB") || password.equals("BSA"))
		{
			if (!(password.equals("BSA")))
			{
				System.out.println("Your password is incorrect!");
			}
			if (!(username.equals("ASB")))
			{
				System.out.println("Your username is incorrect!");
			}
		}
		
		else if (!(username.equals("ASB") && password.equals("BSA")))
		{
			System.out.println("Your username and password are incorrect!");
		}			
			
		
	}
	
}
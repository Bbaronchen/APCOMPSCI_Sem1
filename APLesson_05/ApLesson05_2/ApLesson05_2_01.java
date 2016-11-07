import java.util.Scanner;
public class ApLesson05_2_01
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Which door do you want to choose..."+
							"\n 1. First one"+
							"\n 2. Second one");
		
	int roomNumber = kb.nextInt();
	if(roomNumber == 1)
	{
		System.out.println("you need to answer what is 10 X 10?");
		int mathNumber = kb.nextInt();
		if(mathNumber == 100)
		{
			System.out.println("Correct! You're safe now.");
		}
		else 
			System.out.println("No! Go die!");
	}
	else
	{
		System.out.println("you need to tell me who said the phrase \"Whatever you are, be a good one.\"?");
		kb.nextLine();
		String wordAnswer = kb.nextLine();
		if(wordAnswer.equals("Abraham Lincoln"))
		{
			System.out.println("Correct! You're safe now.");
		}
		else
		{
			System.out.println("No! Go die!");
		}
	}	

		System.out.println("You are now going to choose a paper, Which one do you want to pick?..."+
							"\n 1. First one"+
							"\n 2. Second one");
		int paperNumber = kb.nextInt();
		if(paperNumber == 1)
		{
			System.out.println("What is this house owner's favourite fruit?");
			kb.nextLine();
			String wordAnswer = kb.nextLine();
			if(wordAnswer.equals("Apple"))
			{
				System.out.println("Correct! You are safe");
			}
			else
			
				System.out.println("No! Go die!");
		}	
		else 
		{
			System.out.println("You need to answer what is 200 / 5?");
			int mathNumber = kb.nextInt();
			if(mathNumber == 40)
			{
				System.out.println("Correct! You are safe.");
			}
			else
			{
				System.out.println("No! Go die!");
			}
		}

			System.out.println("This is the last quiz, pick a form for yourself, Which form do you want?..."+
								"\n 1.Form A"+
								"\n 2.Form B");
			int formNumber = kb.nextInt();
			if (formNumber == 1)
			 {
				System.out.println("What is my name?");
				kb.nextLine();
				String wordAnswer = kb.nextLine();
			 if(wordAnswer.equals("The Big Baron"))
			 {
				System.out.println("Correct! You are safe!");
			 }
			 else 
			 
				System.out.println("No! Go die!");
			 }
			 
			else 
			{
				System.out.println("What is my favourite sport?");
				kb.nextLine();
				String wordAnswer = kb.nextLine();
				if(wordAnswer.equals("basketball"))
				{
					System.out.println("Correct! You are safe!");
				}
				else 
				{
					System.out.println("No! Go die!");
				}
			}
				
			}
}	

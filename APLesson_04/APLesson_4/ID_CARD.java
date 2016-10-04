import java.util.Scanner;

public class ID_CARD
{
	public static void main(String[]args)
	{
		ID_CARD card = new ID_CARD();
		Scanner kb = new Scanner(System.in);
		
	    System.out.println("Enter your first name: ");
		String word1 = kb.nextLine();
	    System.out.println("enter your last name: ");
		String ay1 = kb.nextLine();
		
		kb.nextLine();
		System.out.println("please enter your tiyle: ");
		String word2 = kb.nextLine();
	    System.out.println("enter the school site: ");
		String ay2 = kb.nextLine();
		
		kb.nextLine();
		System.out.println("enter school year: ");
		String word3 = kb.nextLine();
	    System.out.println("what is your subject: ");
		String ay3 = kb.nextLine();
		
	    System.out.println("************************");
		card.format(word1, ay1);
		card.format(word2, ay2);
		card.format(word3, ay3);
		System.out.println("\n***********************");
	}
	
	public void format(String word, String ay)
	{
		System.out.printf("\n*%10s  %5.2s*", word, ay );
	}
}

import java.util.Scanner; // import Statement

public class NEW_01
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is your name?");
		
		String name = keyboard.next();
		
		System.out.println("Oh" + name + "It's a cool name.");
		
		System.out.println("How old are you?");
		
	    String age = keyboard.next();
		
		System.out.println("Ooooo" + age + "you are so young.");
		
		System.out.println("What do you do for fun?");
		
		String thing = keyboard.next();
		
		System.out.println("Basketball?" + thing + "I like it too.");
		
		System.out.println("What kind of music do you like?");
		
		String music = keyboard.next();
		
		System.out.println("Rock!?" + music + "It's nice.");
		
		System.out.println("How many siblings do you have?");
		
		String number = keyboard.next();
		
		System.out.println("6!?" + number + "That's alot.");
		
		System.out.println("What do you want to be when you grow up?");

		String job = keyboard.next();
		
		System.out.println("Nice!" + job + "I want to be a teacher too.");

	}
}
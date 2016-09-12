import java.util.Scanner; // import Statement

public class NEW_01
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is your name?");
		System.out.println("How old are you?");
		System.out.println("What do you do for fun?");
		System.out.println("What kind of music do you like?");
		System.out.println("How many siblings do you have?");
		System.out.println("What do you want to be when you grow up?");

		String name = keyboard.next();
		String age = keyboard.next();
		String thing = keyboard.next();
		String music = keyboard.next();
		String number = keyboard.next();
		String job = keyboard.next();
		
		System.out.println("Oh" + name + "It's a cool name.");
		System.out.println("Ooooo" + age + "you are so young.");
		System.out.println("Basketball?" + thing + "I like it too.");
		System.out.println("Rock!?" + music + "It's nice.");
		System.out.println("6!?" + number + "That's alot.");
		System.out.println("Nice!" + job + "I want to be a teacher too.");
	}
}
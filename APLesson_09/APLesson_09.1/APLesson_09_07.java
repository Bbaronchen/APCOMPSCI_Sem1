import java.util.Scanner;
public class APLesson_09_07
{
	public static void main(String[]args)
	{
		String[] words = new String[5];
	   
		fillArray(words);
		System.out.println("For the words [all the words in the array]");
		printArray(words);
		System.out.println("\nOnly [hasZs()] contain(s) the letter z: " + hasZs(words));
	}
	
	public static void fillArray (String[] words) 
	{
		Scanner kb = new Scanner(System.in);
		for (int i = 0; i < words.length; i++) 
		{
			System.out.println("Enter word " + (i+1) + ":");
			words[i] = kb.next();
		}
	}
	public static void printArray (String[] words) 
	{
		for (String word : words) 
		{
			System.out.print(word + " ");
		}
	}
	public static String hasZs (String[] words) 
	{
		String zs = "";
		for (String word : words) 
		{
			if (word.indexOf("z") >= 0) 
			{
				zs += word + " ";
			}
		}
		return zs;
	}
}
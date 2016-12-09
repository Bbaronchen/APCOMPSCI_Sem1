import java.util.Scanner;
public class APLesson_09_02
{
	
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];
	    for (int i = 0; i < words.length; i++) 
		{
			System.out.println("Enter word " + (i+1) + ":");
			words[i] = kb.next();
		}
		
		first(words);
	}
	
	public static void first(String[] words) 
	{
		for (String B : words) 
		{
			System.out.println(B.charAt(0));
		}
	}
}
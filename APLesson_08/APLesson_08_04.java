import java.util.Scanner;

public class APLesson_08_04
{
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
	    System.out.println("Enter a word:");
	    String word = kb.next();
		int stop = word.length();
		int start = 1;
		tree(word, start, stop);
	    
	}

	public static void tree (String word, int start, int stop)
	{
		if (start <= stop) {
			System.out.println(word.substring(0, start));
			start += 1;
			tree(word, start, stop);
		}
	}
}
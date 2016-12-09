import java.util.Scanner;
public class APLesson_09_03
{
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		int[] numbers = new int[10];
	    for (int i = 0; i < numbers.length; i++) 
		{
			numbers[i] = (int)(Math.random()*100)+1;
		}
		
		System.out.println("Numbers...");
		for (int i = 0; i < numbers.length; i++) 
		{
			System.out.print(numbers[i] + " ");
		}
		System.out.println("");
		
		System.out.println(average(numbers));
	}
	
public static int average(int[] n)
	{
		int average = 0;
		for( int num : n)
		{
			average += num;
		}
		return average/10;
	}
}
import java.util.Scanner;

public class test
{
	public static void main(String[]args)
	{
		test receipt = new test();
		Scanner kb = new Scanner(System.in);
		
	    System.out.println("please enter item1: ");
		String item1 = kb.nextLine();
	    System.out.println("please enter the price1: ");
		Double price1 = kb.nextDouble();
		
		kb.nextLine();
		System.out.println("please enter item2: ");
		String item2 = kb.nextLine();
	    System.out.println("please enter the price2: ");
		Double price2 = kb.nextDouble();
		
		kb.nextLine();
		System.out.println("please enter item3: ");
		String item3 = kb.nextLine();
	    System.out.println("please enter the price3: ");
		Double price3 = kb.nextDouble();
		
	    System.out.println("<<<<<<<<<<receipt>>>>>>>>>");
		receipt.format(item1, price1);
		receipt.format(item2, price2);
		receipt.format(item3, price3);
		
		double subtotal = (price1 + price2 + price3);
		double Tax = (subtotal*0.15);
		double Total = (subtotal+Tax);
		receipt.format("Subtotal: ", subtotal)	;
		receipt.format("Tax: ", Tax);
		receipt.format("Total: ", Total);
		
		System.out.println("\n__________________________________________ \n* Thank you for your support *");
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n*%10s  %5.2f", item, price );
	}
}

		
import java.util.Scanner;
public class ApLesson12_EX06_Inventory_Driver
 {
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Manufacturer:");
		String m = kb.nextLine();
		System.out.println("Name:");
		String n = kb.nextLine();
		System.out.println("Enter category and price information? (yes/no)");
		Inventory item1;
		if (kb.nextLine().equals("yes")) 
		{
			System.out.println("Category:");
			String c = kb.nextLine();
			System.out.println("Price:");
			double p = kb.nextDouble();
			item1 = new Inventory(m, n, c, p);
		} else 
		{
			item1 = new Inventory(m, n);
		}
		System.out.println(item1.toString());
	}
}

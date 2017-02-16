import java.util.Scanner;
public class toystorerunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the list of toys: ");
		String list = kb.nextLine();
		toystore store = new toystore(list);
		System.out.println(store);
		System.out.println(store.getMostFrequentToy());
		System.out.println(store.getMostFrequentType());
	}
}
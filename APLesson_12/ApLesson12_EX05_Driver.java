import java.util.Scanner;
public class ApLesson12_EX05_Driver 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("First name:");
		String fN = kb.nextLine();
		System.out.println("Last name:");
		String lN = kb.nextLine();
		System.out.println("Do you want an avatar? (yes/no)");
		User user1;
		if (kb.nextLine().equals("yes")) {
			System.out.println("Avatar:");
			user1 = new User(fN, lN, kb.nextLine());
		} else {
			user1 = new User(fN, lN);
		}
		System.out.println(user1.toString());
	}
}

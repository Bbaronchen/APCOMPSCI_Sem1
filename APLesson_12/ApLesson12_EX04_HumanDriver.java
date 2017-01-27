import java.util.Scanner;
public class ApLesson12_EX04_HumanDriver 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your hair:");
		String h = kb.nextLine();
		System.out.println("Enter your eyes:");
		String e = kb.nextLine();
		System.out.println("Enter your skin:");
		String sk = kb.nextLine();
		
		ApLesson12_EX04_Human hu = new ApLesson12_EX04_Human(h, e, sk);
		
		System.out.println("My info...");
		System.out.println("Hair:\t" + hu.getHair());
		System.out.println("Eyes:\t" + hu.getEyes());
		System.out.println("Skin:\t" + hu.getSkin());
		
		System.out.println("Enter friend's hair:");
		hu.setHair(kb.nextLine());
		System.out.println("Enter friend's eyes:");
		hu.setEyes(kb.nextLine());
		System.out.println("Enter friend's skin:");
		hu.setSkin(kb.nextLine());
		
		System.out.println("Friend's info...");
		System.out.println("Hair:\t" + hu.getHair());
		System.out.println("Eyes:\t" + hu.getEyes());
		System.out.println("Skin:\t" + hu.getSkin());
	}
}

import java.util.Scanner; 

public class ApLesson05_1_01
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter grade for class1: ");
		String grade1 = keyboard.nextLine();
		
		System.out.println("Enter grade for class2: ");
		String grade2 = keyboard.nextLine();
		
		System.out.println("Enter grade for class3: ");
		String grade3 = keyboard.nextLine();
		
		System.out.println("Enter grade for class4: ");
		String grade4 = keyboard.nextLine();
		
		System.out.println("Enter grade for class5: ");
		String grade5 = keyboard.nextLine();
		
		System.out.println("Enter grade for class6: ");
		String grade6 = keyboard.nextLine();
		
		System.out.println("Enter grade for class7: ");
		String grade7 = keyboard.nextLine();
		
		double gPoints = calcPoints(grade1) + calcPoints(grade2) + calcPoints(grade3) + calcPoints(grade4) + calcPoints(grade5) + calcPoints(grade6) + calcPoints(grade7);
		double GPA = gPoints/7;
		
		System.out.printf("Your GPA is %1.2f", GPA);
		
	}
	
	public static double calcPoints(String grade)
	{
		if(grade.equals("A"))
			return 4.0;
		if(grade.equals("B"))
			return 3.0;
		if(grade.equals("C"))
			return 2.0;
		if(grade.equals("D"))
			return 1.0;
		if(grade.equals("F"))
			return 0.0;
		return 0.0;
	}
}
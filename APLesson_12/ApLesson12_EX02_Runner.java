import java.util.Scanner;
public class ApLesson12_EX02_Runner
{
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter x1:");
		int x1 = kb.nextInt();
		System.out.println("Enter y1:");
		int y1 = kb.nextInt();
		System.out.println("Enter x2:");
		int x2 = kb.nextInt();
		System.out.println("Enter y2:");
		int y2 = kb.nextInt();
		
		Distance d = new Distance(x1, y1, x2, y2);
		System.out.printf("Distance = %.2f\n", d.getDistance());
				
		System.out.println("Enter x1:");
		x1 = kb.nextInt();
		System.out.println("Enter y1:");
		y1 = kb.nextInt();
		System.out.println("Enter x2:");
		x2 = kb.nextInt();
		System.out.println("Enter y2:");
		y2 = kb.nextInt();
		
		d.setXOne(x1);
		d.setYOne(y1);
		d.setXTwo(x2);
		d.setYTwo(y2);
		System.out.printf("Distance = %.2f\n", d.getDistance());
	}
}
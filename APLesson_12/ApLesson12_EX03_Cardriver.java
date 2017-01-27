import java.util.Scanner;
public class ApLesson12_EX03_Cardriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Input paint");
		String paint = kb.nextLine();
		System.out.println("Input interior");
		String interior = kb.nextLine();
		System.out.println("Input engine");
		String engine = kb.nextLine();
		System.out.println("Input tires");
		String tires = kb.nextLine();
		
		Car object = new Car(paint, interior, engine, tires);
		
		System.out.println("Your vehicle is ready......");
		System.out.println("Paint: +\t" + object.getPaint());
		System.out.println("Interior: +\t" + object.getInterior());
		System.out.println("Engine: +\t" + object.getEngine());
		System.out.println("Tires: +\t" + object.getTires());
	}
}
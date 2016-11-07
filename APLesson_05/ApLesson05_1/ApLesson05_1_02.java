import java.util.Scanner;
public class ApLesson05_1_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter height: ");
		double h = kb.nextDouble();
		
		System.out.println("Enter weight: ");
		double w = kb.nextDouble();
		
		String condition = calcBMI(h,w);
		
		double bmi = w/Math.pow(h,2);
		
		System.out.println ("Your BMIS is:  " + bmi);
		System.out.println("You are " + condition);
		
	}
	
		static String condition;
		static double bmi;
		
		
	public static String calcBMI(double h, double w)
	{
    	if (bmi < 18.5)
		{			
 			condition =  "Underweight"; 
 		} 
 		else if (18.5 <= bmi <=24.9) 
 		{ 
 			condition = "Normal"; 
 		} 	
 		 
 		else if (25 <= bmi <= 29.9) 
		{ 
			condition = "Overweight"; 
 		} 
 		else if (29.9 < bmi<= 34.9) 
 		{ 
			condition = "Obese"; 
 		} 
 		else if (35 <= bmi <= 39.9) 
		{ 
			condition = "Very Obese"; 
 		} 
 		 
 		if (bmi > 39.9) 
		{
 			condition =  "Morbidly Obese"; 
		}
 		return condition; 

	}
}
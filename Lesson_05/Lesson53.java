
import java.util.Scanner;

public class Lesson53

{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String a = "";
		System.out.println("BMI calculator!");
		System.out.println("Please enter your weight in pounds.");
		double weight = kb.nextDouble();
		System.out.println("Please enther your height in inches.");
		double height = kb.nextDouble();
		double b = 703 * weight / height / height; 
		if (b <= 18.5)
			a= " underweight.";
		else if (b <= 24.9)
			a = " normal.";
		else if (b <= 29.9)
			a = " overweight.";
		else if (b <= 34.9)
			a = " obese.";
		else if (b <= 39.9)
			a = " very obese.";
		else
			a = " morbidly obese.";
		
		System.out.println("Your BMI is " + b + ".");
		System.out.println("You are" + a);
	}
	
}
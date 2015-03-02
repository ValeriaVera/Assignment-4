import java.util.Scanner;
public class SumandAverage {
	public static void main(String [] args) {
		System.out.println("Hello Valeria!");
		System.out.println("I will add five numbers and find the average of those numbers for you.");
		System.out.println("Enter five numbers.");
		
		int n1, n2, n3, n4, n5;
		int sumofnumbers;
		double averageofnumbers;
		
		Scanner keyboard = new Scanner(System.in);
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		n3 = keyboard.nextInt();
		n4 = keyboard.nextInt();
		n5 = keyboard.nextInt();
		
		sumofnumbers = (n1 + n2+ n3 + n4 + n5);
		
		averageofnumbers = (sumofnumbers / 5);
		System.out.println("The sum of the five numbers is " + sumofnumbers);
		System.out.println("The average of the five numbers is " + averageofnumbers);
		
	}
}
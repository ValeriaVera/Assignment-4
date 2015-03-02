import java.util.Scanner;
public class Table {
public static void main(String [] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter two words: Beat and Army");
			String firstword = keyboard.next();
			String secword = keyboard.next();
			System.out.println("Your words are: " + firstword + ' ' + secword);
				
		System.out.println("Answer for 1/2");
			int n1, n2;
			n1 = keyboard.nextInt();
			n2 = keyboard.nextInt();
			System.out.println("The answer is: " + n1 / n2);
			
		System.out.println("Answer for 1%2");
			int n3, n4;
			n3 = keyboard.nextInt();
			n4 = keyboard.nextInt();
			System.out.println("The answer is: " + n3 % n4);
			
		System.out.println("Answer for 1.0/2");
			double n5, n6;
			n5 = keyboard.nextDouble();
			n6 = keyboard.nextDouble();
			System.out.println("The answer is: " + n5 / n6);	
		
		System.out.println("Answer for 5+7/2 ");
			int n7; 
			int n8, n9;
			double answerforn8n9;
			n7 = keyboard.nextInt();
			n8 = keyboard.nextInt();
			n9 = keyboard.nextInt();
			answerforn8n9 = (n8/n9);
			System.out.println("The answer is: " + (n7 + (answerforn8n9)));
			
		
	}
}
}

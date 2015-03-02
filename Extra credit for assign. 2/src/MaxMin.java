import java.util.Scanner;
public class MaxMin {
	public static void main(String [] args){
		
		   int min, max;
		   	System.out.println("Enter your numbers ");
		    Scanner s = new Scanner(System.in);
		    
		    int val = s.nextInt();{
		    min = max = val;

		    while (val != 1) {
		      System.out.print("Enter a Value: ");
		      val = s.nextInt();
		      if (val < min) {
		          min = val;
		      }
		      if (val > max) {
		         max = val;
		      }
		    };
		    System.out.println("Min: " + min);
		    System.out.println("Max: " + max);
		  }
		}
	}
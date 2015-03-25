import java.util.Scanner;
public class SwitchCase {
	public static void main(String[] args)
	{
		String Administrator,Faculty,Staff, Student, Guest, userRole;
		int i=0;
		Scanner keyboard=new Scanner(System.in);
		Administrator="Administrator";
		Faculty="Faculty";
		Staff="Staff";
		Student="Student";
		Guest="Guest";
		while (i==0)
		{
			System.out.println("Enter your role:\nAdministrator\nFaculty\nStaff\nStudent\nGuest	");
			userRole=keyboard.nextLine();
			if(userRole.compareTo(Administrator)==0)
				i=1;
			if(userRole.compareTo(Faculty)==0)
				i=2;
			if(userRole.compareTo(Staff)==0)
				i=3;
			if(userRole.compareTo(Student)==0)
				i=4;
			if(userRole.compareTo(Guest)==0)
				i=5;
			switch (i)
			{
				case 1:
					System.out.println("Welcome Administrator");
					break;
				
				case 2:
					System.out.println("Welcome Faculty");
					break;
				
				case 3:
					System.out.println("Welcome Staff");
					break;
				
				case 4:
					System.out.println("Welcome Student");
					break;
				
				case 5:
					System.out.println("Welcome Guest");
					break;
				
				default:
					System.out.println("Wrong Role. Enter the role again");
					break;
			}
		}
		keyboard.close();
	}
} 
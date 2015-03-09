import javax.swing.JOptionPane;
public class Users {
	public static void main(String[] args) {
		//Initialize variables
		String uname = "Valeria";
		String pass= "csc200";
		String inputPass = "";
		String inputName = "";

		int attempt = 0;

		String accountValeria = "Admin";
		String accountType;

		//LOOP - do this while attempt <=2
		do{

		//INPUT/OUTPUT - Dialog box PROMPT user for user name
		inputName = JOptionPane.showInputDialog("Enter username");	

		//CONDITION - IF the inputName is the same as uname
		if(uname.equals(inputName))

		{

			//LOOP - do this while attempt<=2
			do

			{

				//INPUT/OUTPUT - Dialog box PROMPT user for password
				inputPass = JOptionPane.showInputDialog("Please enter password");

				//CONDITION - IF inputPass is the same as pass
				if(inputPass.equals(pass))

				{

					//QUIT the loop
					break;

				}

				//CONDITION - ELSE
				else

					//OUTPUT - Dialog box PROMPT it is the wrong password
					JOptionPane.showMessageDialog(null, "Wrong password");

					//INCREMENT attempt by 1
					attempt++;

			}while(attempt<=2);

			if(uname.equals(inputName))

			break;
		}

		//CONDITION - ELSE
		else

			//OUTPUT - Dialog box PROMPT it is the wrong user name
			JOptionPane.showMessageDialog(null, "Invalid Username");

			//INCREMENT attempt by 1
			attempt++;

		}while(attempt<=2);

		//CONDITION - IF the inputName is the same as uname OR inputPass is the same as pass AND attempt = 2
		if(!inputPass.equals(pass) || !uname.equals(inputName) && attempt==2)

		{

			//OUTPUT - Dialog box PROMPT user that account is locked
			JOptionPane.showMessageDialog(null,"Your account has been locked - Contact Administrator");	

			//Exit program
			System.exit(attempt = 2);
		}

		//Create array of strings: choices
		String[] choices = { "Admin", "Student", "Staff"};

		//LOOP - do this while accountValeria != accountType
		do

		{
			//Cast accountType to String - Dialog box with drop down list - PROMPT user for selection
			accountType=(String)JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]);

	System.out.println(input);

		String AdminUser = "Admin";
		String StudentUser = "Student";
		String StaffUser = "Staff";
		String StudentPass = "Stupassword";
		String AdminPass = "Adpassword";
		String StaffPass = "Stapassword";
		String entereduname;
		String enteredpass;

		int count = 0;

switch (input) {

			case "Admin":

				while (count < 3) {

					count++;
					entereduname = JOptionPane.showInputDialog("Enter Username");

					if (!AdminUser.equals(entereduname) && count < 3) {

						JOptionPane.showMessageDialog(null,"Incorrect Username");

						System.out.println(count);

					} else if (count >= 3) {

						JOptionPane.showMessageDialog(null, "Contact Admin");

					} else

						JOptionPane.showMessageDialog(null, "It Works");

					while (count < 3) {

						count++;
						enteredpass = JOptionPane.showInputDialog("Enter Password");

						if (!AdminPass.equals(enteredpass) && count < 3) {

							JOptionPane.showMessageDialog(null,"Incorrect Password");

						} else if (count >= 3) {

							JOptionPane.showMessageDialog(null, "Contact Admin");
} else

							JOptionPane.showMessageDialog(null, "Welcome " + entereduname + "You can update and read file.");

						break;
					}
				}

			case "Student":

				while (count < 3) {

					count++;
					entereduname = JOptionPane.showInputDialog("Enter Username");
					if (!StudentUser.equals(entereduname) && count < 3) {

						JOptionPane.showMessageDialog(null,"Incorrect Username");
						System.out.println(count);

					} else if (count >= 3) {

						JOptionPane.showMessageDialog(null, "Contact Admin");
					} else

					while (count < 3) {

						count++;

						enteredpass = JOptionPane.showInputDialog("Enter Password");

						if (!StudentPass.equals(enteredpass) && count < 3) {

							JOptionPane.showMessageDialog(null,"Incorrect Password");

						} else if (count >= 3) {

							JOptionPane.showMessageDialog(null, "Contact Admin");

						} else

							JOptionPane.showMessageDialog(null,"Welcome " + entereduname + "You can only read file.");

						break;
					}
				}
			case "Staff":

				while (count < 3) {

					count++;

					entereduname = JOptionPane.showInputDialog("Enter Username");

					if (!StaffUser.equals(entereduname) && count < 3) {

						JOptionPane.showMessageDialog(null,"Incorrect Username");

						System.out.println(count);

					} else if (count >= 3) {

						JOptionPane.showMessageDialog(null, "Contact Admin");

					} else

					while (count < 3) {

						count++;

						enteredpass = JOptionPane.showInputDialog("Enter Password");

						if (!StaffPass.equals(enteredpass) && count < 3) {

							JOptionPane.showMessageDialog(null,"Incorrect Password");

						} else if (count >= 3) {

							JOptionPane.showMessageDialog(null, "Contact Admin");
						} else

							JOptionPane.showMessageDialog(null, "Welcome "+ entereduname + "You can update, read, add, delete file.");

						break;
					}
				}
}
		}
	}
}
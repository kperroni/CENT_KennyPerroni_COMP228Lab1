package exercise2;

import javax.swing.JOptionPane;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Welcome message
		JOptionPane.showMessageDialog(null, "Hey professor Wallace! This is my 2nd exercise, welcome!");

		// Parsing the String from the JOptionPane to an integer variable for
		// the account number
		int accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Please, enter the account number"));
		
		// Getting the name from the JOptionPane
		String customerName = JOptionPane.showInputDialog("Now, could you enter the owner of this new account please?");
		
		// Parsing the String from the JOptionPane to a float variable for the
		// balance
		float initialBalance = Float.parseFloat(JOptionPane.showInputDialog(
				"Perfect, now I just need an amount of money in order to complete the account registration"));

		// Creating a new Object of the BankAccount class
		BankAccount newAccount = new BankAccount(accountNumber, customerName, initialBalance);

		// Other messages
		JOptionPane.showMessageDialog(null, "Congratulations! You got yourself a new Bank Account!");

		// Parsing the String from the JOptionPane to a float variable for the
		// deposit amount
		float depositAmount = Float.parseFloat(JOptionPane.showInputDialog("Now, how much money are you depositing?"));
		
		// A flag variable
		boolean status = newAccount.deposit(depositAmount);
		String newBalance = "";

		// Evaluating the flag and showing results when it is true
		if (status) {
			JOptionPane.showMessageDialog(null, "Done, deposit operation complete");
			newBalance = String.format("Your current balance is: %.2f", newAccount.getBalance());
			JOptionPane.showMessageDialog(null, newBalance);
			int dialogResponse = JOptionPane.showConfirmDialog(null, "Do you want a receipt of the operation?");

			// Other messages
			if (dialogResponse == 0)
				JOptionPane.showMessageDialog(null, "Too bad, I do not know how to do that");

		}

		// Showing results when the flag is false
		else
			JOptionPane.showMessageDialog(null,
					"Operation error. You've typed a negative number! Do you want to lose money?!", "Error", 0);

		// Parsing the String from JOptionPane to a float variable for the
		// withdrawal amount
		float withdrawalAmount = Float.parseFloat(
				JOptionPane.showInputDialog("Taxes are now paid in cash, so how much are you withdrawing?"));

		// Flag variable
		status = newAccount.withdraw(withdrawalAmount);

		// Evaluating the flag variable and showing results when it is true
		if (status) {
			JOptionPane.showMessageDialog(null, "Nice! you got your money. Now go and pay your taxes");
			newBalance = String.format("Your balance is now: %s", newAccount.getBalance());
			JOptionPane.showMessageDialog(null, newBalance);

			JOptionPane.showMessageDialog(null, "No point of asking if you want a receipt right?");

		}

		// Showing results when the flag is false
		else
			JOptionPane.showMessageDialog(null, "The withdrawal amount is greater than your current balance!", "Error",
					0);

		// Showing the account information in a message dialog in a formatted
		// String

		JOptionPane.showMessageDialog(null, newAccount.getAccountInfo());

	}

}

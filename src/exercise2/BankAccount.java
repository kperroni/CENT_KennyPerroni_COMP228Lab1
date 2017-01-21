package exercise2;

public class BankAccount {

	// Default Constructor
	private int accountNumber;
	private String customerName = "NEW_CUSTOMER";
	private float balance = 0;

	// Constructor
	public BankAccount(int accountNumber, String name, float balance) {

		// Assigning instance variable to provided variable
		this.accountNumber = accountNumber;

		// Checking if the name variable provided is empty, if it is not, then
		// it is assigned to the instance variable
		// else it will take the default value
		if (!name.isEmpty())
			this.customerName = name;

		// Checking if the balanced typed by the user is a positive number
		// If it is, it is assigned to the instance variable, if it is not, then
		// it takes the default value
		if (balance > 0.0)
			this.balance = balance;

	}

	// Getters for each instance variable

	public int getAccountNumber() {

		return this.accountNumber;
	}

	public String getCustomerName() {

		return this.customerName;
	}

	public float getBalance() {

		return this.balance;
	}

	// Withdraw method, it will only return true if the amount is lesser or
	// equal to the current balance

	public boolean withdraw(float amount) {

		if (amount > this.balance)

			return false;

		else {
			this.balance -= amount;
			return true;
		}

	}

	// Deposit method, it will only return true if the amount is a positive
	// number

	public boolean deposit(float amount) {

		if (amount < 0)

			return false;

		else {

			this.balance += amount;
			return true;
		}
	}

	// This method returns the account information in a formatted String

	public String getAccountInfo() {

		String accountData = String.format(
				"Based on our records, the account information for the customer %s is: %n" + "Account number: %d%n"
						+ "Current Balance: %.2f%n",
				this.getCustomerName(), this.getAccountNumber(), this.getBalance());

		return accountData;
	}
}

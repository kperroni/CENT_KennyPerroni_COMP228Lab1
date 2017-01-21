package exercise1;

import java.util.Random;

public class Patient {

	// Default Constructor
	private String patientId;
	private String firstName = "NEW_PATIENT_FIRST_NAME";
	private String lastName = "NEW_PATIENT_LAST_NAME";
	private String address = "NEW_PATIENT_ADDRESS";
	private String city = "NEW_PATIENT_CITY";
	private String province = "NEW_PATIENT_PROVINCE";
	private String postalCode = "NEW_PATIENT_POSTAL_CODE";

	// Constructor!
	public Patient(String newPatientId, String firstName, String lastName, String address, String city, String province,
			String postalCode) {

		// Checks if the newPatientId variable provided is an empty string
		if (newPatientId.isEmpty()) {

			// If it is, then the app checks if the firstName variable provided
			// is empty
			// If it is, the getRandomId method is called to get a random number
			// The result is concatenated with the firstName instance variable
			// default value

			if (firstName.isEmpty()) {

				this.patientId = this.getRandomId() + "_" + this.firstName;
			} else {

				// If the firstName variable provided is not empty, the random
				// number is generated
				// And it is concatenated with it
				this.patientId = this.getRandomId() + "_" + firstName;
			}
			// If the newPatientId variable is not empty, then it is assigned to
			// the instance variable
		} else {

			this.patientId = newPatientId;

		}

		// This was implemented so the patientId would be "unique" each time a
		// patient is created

		// Conditionals that check if the variables provided are empty or not

		if (!firstName.isEmpty())
			this.firstName = firstName;

		if (!lastName.isEmpty())
			this.lastName = lastName;

		if (!address.isEmpty())
			this.address = address;

		if (!city.isEmpty())
			this.city = city;

		if (!province.isEmpty())
			this.province = province;

		if (!postalCode.isEmpty())
			this.postalCode = postalCode;

	}

	// Setters for the instance variables

	public void setPatientId(String newPatientId) {

		this.patientId = newPatientId;

	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;

	}

	public void setLastName(String lastName) {

		this.lastName = lastName;

	}

	public void setAddress(String address) {

		this.address = address;

	}

	public void setCity(String city) {

		this.city = city;

	}

	public void setProvince(String province) {

		this.province = province;

	}

	public void setPostalCode(String postalCode) {

		this.postalCode = postalCode;

	}

	// Getters for the instance variables

	public String getPatientId() {

		return this.patientId;

	}

	public String getFirstName() {

		return this.firstName;

	}

	public String getLastName() {

		return this.lastName;

	}

	public String getAddress() {

		return this.address;

	}

	public String getCity() {

		return this.city;

	}

	public String getProvince() {

		return this.province;

	}

	public String getPostalCode() {

		return this.postalCode;

	}

	// The getPatientInfo method utilizes the getter methods already created,
	// they are concatenated into one formatted String.

	public String getPatientInfo() {

		String patientData = String.format(
				"According to our records the patient's info is: %n-----------------------------------------------%n"
						+ "Patient ID: %s%n********************%n" + "First Name: %s%n********************%n"
						+ "Last Name: %s%n********************%n" + "Address: %s%n********************%n"
						+ "City: %s%n********************%n" + "Province: %s%n********************%n"
						+ "Postal Code: %s%n",
				this.getPatientId(), this.getFirstName(), this.getLastName(), this.getAddress(), this.getCity(),
				this.province, this.getPostalCode());

		return patientData;

	}

	// This is a private function, because its purpose is to generate a random
	// ID number between 0 and 99 when a patient is created
	// This function is not called if the ID is provided by the end user

	private int getRandomId() {

		Random myRandomId = new Random();
		return myRandomId.nextInt(100);

	}

}

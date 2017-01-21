package exercise1;

import javax.swing.JOptionPane;

public class PatientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Welcome message
		JOptionPane.showMessageDialog(null, "Welcome to my 1st exercise professor Wallace!");

		// Dialog boxes that are use to capture the data provided by the end
		// user. ID, FIRST NAME, LAST NAME, ADDRESS, CITY, PROVINCE AND POSTAL CODE
		String patientId = JOptionPane.showInputDialog("Please, enter the patient's ID");
		String firstName = JOptionPane.showInputDialog("Now I need to borrow the first name");
		String lastName = JOptionPane.showInputDialog("Next I need the last name");
		String address = JOptionPane.showInputDialog("What's the address of this patient?");
		String city = JOptionPane.showInputDialog("Which city does he/she live?");
		String province = JOptionPane.showInputDialog("Mmmm... I require the provice too");
		String postalCode = JOptionPane.showInputDialog("Ok, last one. What's the postal code of this patient?");

		// This is where the object newPatient is created
		Patient newPatient = new Patient(patientId, firstName, lastName, address, city, province, postalCode);

		// Other messages
		JOptionPane.showMessageDialog(null, "Ok, thank you! Your patient was created successfully!");
		JOptionPane.showMessageDialog(null, "Now...");

		// This part consists in showing the outputs to the end user using
		// formatted Strings
		// Each variable is shown in a message dialog
		String patientIdCont = String.format("The patient's ID is: %s", newPatient.getPatientId());
		JOptionPane.showMessageDialog(null, patientIdCont);

		String patientFirstNameCont = String.format("The patient's first name is: %s", newPatient.getFirstName());
		JOptionPane.showMessageDialog(null, patientFirstNameCont);

		String patientLastNameCont = String.format("The patient's last name is: %s", newPatient.getLastName());
		JOptionPane.showMessageDialog(null, patientLastNameCont);

		String patientAddressCont = String.format("The patient's address is: %s", newPatient.getAddress());
		JOptionPane.showMessageDialog(null, patientAddressCont);

		String patientCityCont = String.format("The patient's city is: %s", newPatient.getCity());
		JOptionPane.showMessageDialog(null, patientCityCont);

		String patientProvinceCont = String.format("The patient's province is: %s", newPatient.getProvince());
		JOptionPane.showMessageDialog(null, patientProvinceCont);

		String patientPostalCodeCont = String.format("The patient's postal code is: %s", newPatient.getPostalCode());
		JOptionPane.showMessageDialog(null, patientPostalCodeCont);

		// Other messages
		JOptionPane.showMessageDialog(null, "And finally...");

		// This shows the output of the whole patient's information in a
		// formatted string
		JOptionPane.showMessageDialog(null, newPatient.getPatientInfo());
	}

}

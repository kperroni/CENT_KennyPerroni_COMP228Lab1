package exercise3;

import javax.swing.JOptionPane;

public class GameObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Welcome message
		JOptionPane.showMessageDialog(null, "This is the last exercise professor Wallace! I bid welcome you!");

		// Parsing to float X coordinate from the JOptionPane input
		float Xcenter = Float
				.parseFloat(JOptionPane.showInputDialog("To create a game object a need first the X coordinate"));
		
		// Parsing to float Y coordinate from the JOptionPane input
		float Ycenter = Float.parseFloat(JOptionPane.showInputDialog("Secondly I will need the Y coordinate"));
		
		// Parsing to float the velocity from the JOptionPane input
		float velocity = Float.parseFloat(JOptionPane.showInputDialog("Great, type now the velocity"));
		
		// Parsing to boolean the state from the JOptionPane input
		boolean status = Boolean.parseBoolean(
				JOptionPane.showInputDialog("Type 'true' if the object is alive or 'false' if the object is dead"));
		
		// This is an additional attribute that will determine how many Hit
		// points the object will have
		// The value is parsed to an integer through the JOptionPane input
		int hp = Integer.parseInt(JOptionPane.showInputDialog("Type the hit points the game object will have"));
		

		// Creation of the Game Object using the GameObject class to instantiate
		// it
		GameObject newGameObject = new GameObject(Xcenter, Ycenter, velocity, status, hp);
		
		// Other messages
		JOptionPane.showMessageDialog(null, "Game object created successfully!");

		// Flag variable to control the loop below
		boolean band = true;
		int response;

		while (band) {

			// Evaluating if the status of the object is dead or alive. if it is
			// dead then the game is over
			if (newGameObject.getStatus() == "Dead" || newGameObject.getHp() == 0) {
				JOptionPane.showMessageDialog(null, "Game over! The object is dead", "IMPORTANT MESSAGE", 0);
				break;
			}

			else {

				// If it is alive then the user is asked to input the rotation
				// the game object will have
				int rotation = Integer.parseInt(JOptionPane.showInputDialog(
						"Indicate the rotation the game object will have \n" + "\n" + "Type 1 to go up 90 degrees \n"
								+ "Type 2 to go down 270 degress \n" + "Type 3 to go left 180 degrees\n"
								+ "Type 4 to go right 0 degrees\n\n\n" + "Type a different number skip the movement"));

				// The game object is moved using the rotation and the velocity
				// 1 stands for UP, 2 stands for DOWN, 3 stands for LEFT, 4
				// stands for RIGHT
				int newMove = newGameObject.moveTo(rotation);

				// if the user inputs a number different than 1,2,3 and 4 then
				// he's asked if he wanted to change the object's velocity

				if (newMove != 1 && newMove != 2 && newMove != 3 && newMove != 4) {

					response = JOptionPane.showConfirmDialog(null, "Do you want to change the object's velocity?");

					// If the clicks YES, he may change it, else the game
					// continues
					if (response == 0) {
						velocity = Float.parseFloat(JOptionPane.showInputDialog("You may type the new velocity"));
						newGameObject.changeVelocity(velocity);
						JOptionPane.showMessageDialog(null, "Velocity successfully updated!");
					}
				}

				else {

					// If the object is moved, the user is asked if he wanted to
					// attack the object
					response = JOptionPane.showConfirmDialog(null, "Do you want to attack the object?");
					
					// If he clicks YES, he is asked for the amount of damage
					// that he wants to inflict
					if (response == 0) {

						int damage = Integer
								.parseInt(JOptionPane.showInputDialog("How much damage do you want to inflict?"));

						// This method is called in order to reduce the object's
						// hp
						JOptionPane.showMessageDialog(null, newGameObject.damageObject(damage), "IMPORTANT MESSAGE", 2);
					}

				}

				// Shows the game object's information in a formatted string
				JOptionPane.showMessageDialog(null, newGameObject.getGameObject());
			}
		}

		// End program message
		JOptionPane.showMessageDialog(null, "Thanks for playing!");

	}

}

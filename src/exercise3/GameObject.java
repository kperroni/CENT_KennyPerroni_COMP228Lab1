package exercise3;

public class GameObject {

	// Default constructor
	private float Xcenter = 0;
	private float Ycenter = 0;
	private float velocity = 1;
	private boolean status = true;
	private int rotation;

	// This is an added instance variable in order to give the object Hit Points
	private int hp = 5; // Default value is 5

	// Constructor
	public GameObject(float Xcenter, float Ycenter, float velocity, boolean status, int hp) {

		// Assigning the X and Y coordinates to the instance variables
		this.Xcenter = Xcenter;
		this.Ycenter = Ycenter;

		// Velocity instance variable is assigned
		this.velocity = velocity;

		// Status instance variable is assigned
		this.status = status;

		// Checks if the hp variable provided by the user is greater than 0
		// if it is, then it is assigned to the hp instance variable
		if (hp > 0)
			this.hp = hp;

	}

	// Getter methods for each instance variable
	public float getXcenter() {

		return this.Xcenter;
	}

	public float getYcenter() {

		return this.Ycenter;
	}

	public float getVelocity() {

		return this.velocity;
	}

	public String getStatus() {

		if (this.status == true)

			return "Alive";

		else
			return "Dead";
	}

	public String getRotation() {

		// Each number for the rotation has a meaning
		// 1 is up 90 degrees
		// 2 is down 270 degrees
		// 3 is left 180 degrees
		// 4 is 0 degrees
		if (this.rotation == 1)
			return "Up 90 degrees";
		if (this.rotation == 2)
			return "Down 270 degrees";
		if (this.rotation == 3)
			return "Left 180 degrees";
		if (this.rotation == 4)
			return "Right 0 degrees";

		return "Stopped";
	}

	public int getHp() {

		return this.hp;
	}

	// This method shows the object's information in a formatted string
	public String getGameObject() {

		String gameObjectInfo = String.format(
				"The game object has the following features: %n" + "Center: X = %.2f AND Y = %.2f %n"
						+ "Velocity: %.2f %n" + "Status: %s %n" + "Rotation: %s %n" + "Hp: %d %n",
				this.getXcenter(), this.getYcenter(), this.getVelocity(), this.getStatus(), this.getRotation(),
				this.getHp());

		return gameObjectInfo;

	}

	// This method is called when the user wants to damage the object's hp
	// If the hp attribute reaches to 0 or less, then the object's status is set
	// to false, thus the object is dead
	public String damageObject(int damage) {

		if (damage <= 0)
			return "You inflicted no damage to the object!";

		this.hp -= damage;

		if (this.hp <= 0) {
			this.hp = 0;
			this.status = false;
		}

		return "BAAAAMMM";
	}

	// This methods changes the velocity of the object
	public void changeVelocity(float newVelocity) {

		this.velocity = newVelocity;

	}

	// This method moves the object given the velocity and rotation typed by the
	// user
	public int moveTo(int rotation) {

		int band = 1;
		this.rotation = rotation;
		switch (rotation) {

		// Move up
		case 1:
			this.Ycenter += this.velocity;
			break;

		// Move down
		case 2:
			this.Ycenter -= this.velocity;
			break;

		// Move left
		case 3:
			this.Xcenter -= this.velocity;
			break;

		// Move right
		case 4:
			this.Xcenter += this.velocity;
			break;

		default:
			band = 0;

		}

		return band;

	}

}

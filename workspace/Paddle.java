import java.awt.*;

public class Paddle {

	// Instance variables to represent the position, size, and velocity of the paddle
	private int x;
	private int y;
	private int width;
	private int height;
	private int velocity;

	// Constructor to initialize the paddle's position, width, and height
	//
	//  Class author: Carlos Silva
	//  Date created: December 6th 2024
	//  General description: This class represents a paddle in a game, with methods to control its movement and render it on the screen.
	//
	//  Pre-condition: The input values for `x`, `y`, `width`, and `height` must be positive integers.
	//  Post-condition: A Paddle object is created with the specified position, width, and height. Velocity defaults to 0.
	//
	public Paddle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	// Method to retrieve the x-coordinate of the paddle
	//
	//  Pre-condition: None
	//  Post-condition: Returns the current x-coordinate of the paddle.
	//
	public int getX() {
		return x;
	}

	// Method to retrieve the y-coordinate of the paddle
	//
	//  Pre-condition: None
	//  Post-condition: Returns the current y-coordinate of the paddle.
	//
	public int getY() {
		return y;
	}

	// Method to retrieve the width of the paddle
	//
	//  Pre-condition: None
	//  Post-condition: Returns the current width of the paddle.
	//
	public int getWidth() {
		return width;
	}

	// Method to retrieve the height of the paddle
	//
	//  Pre-condition: None
	//  Post-condition: Returns the current height of the paddle.
	//
	public int getHeight() {
		return height;
	}

	// Method to retrieve the velocity of the paddle
	//
	//  Pre-condition: None
	//  Post-condition: Returns the current velocity of the paddle.
	//
	public int getVelocity() {
		return velocity;
	}

	// Method to move the paddle horizontally based on its velocity
	//
	//  Pre-condition: The paddle's velocity (`velocity`) must be initialized.
	//  Post-condition: The x-coordinate of the paddle is updated by adding the velocity to its current value.
	//
	public void move() {
		x = x + velocity;
	}

	// Method to update the paddle's velocity
	//
	//  Pre-condition: The input `number` must be an integer representing the new velocity.
	//  Post-condition: The paddle's velocity (`velocity`) is updated to the specified value.
	//
	public void addVelocity(int number) {
		velocity = number;
	}

	// Method to set the x-coordinate of the paddle
	//
	//  Pre-condition: The input `number` must be a valid integer representing the new x-coordinate.
	//  Post-condition: The x-coordinate of the paddle is updated to the specified value.
	//
	public void setX(int number) {
		x = number;
	}

	// Method to set the velocity of the paddle
	//
	//  Pre-condition: The input `number` must be an integer representing the new velocity.
	//  Post-condition: The paddle's velocity (`velocity`) is updated to the specified value.
	//
	public void setVelocity(int number) {
		velocity = number;
	}

	// Method to draw the paddle on a graphical surface
	//
	//  Pre-condition: The `Graphics` object `g` must be non-null and linked to a valid drawing canvas.
	//  Post-condition: The paddle is drawn as a filled rectangle at its current position with its width and height.
	//
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, width, height);
	}
}
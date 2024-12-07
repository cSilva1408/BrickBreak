import java.awt.*;

public class Ball {
	// Instance variables to represent the position, size, and velocity of the ball
	private int xPos;
	private int yPos;
	private int size;
	private int xVelocity;
	private int yVelocity;

	// Constructor to initialize the ball's position and size
	//
	//  Class author: Carlos Silva
	//  Date created: December 6th 2024
	//  General description: This class represents a paddle in a game, with methods to control its movement and render it on the screen.
	//
	//  Pre-condition: The input values for `xPos`, `yPos`, and `size` must be non-negative integers. 
	//  `size` should represent the diameter of the ball.
	//  Post-condition: A Ball object is created with the specified position and size. Velocity defaults to 0.
	//
	public Ball(int xPos, int yPos, int size) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.size = size;
	}

	// Method to retrieve the x-coordinate of the ball
	//
	//  Pre-condition: None
	//  Post-condition: Returns the current x-coordinate of the ball.
	//
	public int getXpos() {
		return xPos;
	}

	// Method to retrieve the y-coordinate of the ball
	//
	//  Pre-condition: None
	//  Post-condition: Returns the current y-coordinate of the ball.
	//
	public int getYpos() {
		return yPos;
	}

	// Method to retrieve the size (diameter) of the ball
	//
	//  Pre-condition: None
	//  Post-condition: Returns the diameter of the ball.
	//
	public int getSize() {
		return size;
	}

	// Method to reverse the ball's vertical direction
	//
	//  Pre-condition: The ball must have a non-zero vertical velocity.
	//  Post-condition: The ball's vertical velocity (`yVelocity`) is reversed.
	//
	public void reverseY() {
		yVelocity = yVelocity * -1;
	}

	// Method to reverse the ball's horizontal direction
	//
	//  Pre-condition: The ball must have a non-zero horizontal velocity.
	//  Post-condition: The ball's horizontal velocity (`xVelocity`) is reversed.
	//
	public void reverseX() {
		xVelocity = xVelocity * -1;
	}

	// Method to set the ball's horizontal velocity
	//
	//  Pre-condition: The input `number` must be an integer representing the new x-velocity.
	//  Post-condition: The ball's horizontal velocity (`xVelocity`) is updated to the specified value.
	//
	public void setXVelocity(int number) {
		xVelocity = number;
	}

	// Method to set the ball's vertical velocity
	//
	//  Pre-condition: The input `number` must be an integer representing the new y-velocity.
	//  Post-condition: The ball's vertical velocity (`yVelocity`) is updated to the specified value.
	//
	public void setYVelocity(int number) {
		yVelocity = number;
	}

	// Method to draw the ball on a graphical surface
	//
	//  Pre-condition: The `Graphics` object `g` must be non-null and linked to a valid drawing canvas.
	//  Post-condition: The ball is drawn as a filled oval at its current position with its size and color.
	//
	public void draw(Graphics g) {
		g.setColor(Color.white);
        g.fillOval(xPos, yPos, size, size);
	}

	// Method to move the ball based on its velocity
	//
	//  Pre-condition: The ball's velocity (`xVelocity` and `yVelocity`) must be initialized.
	//  Post-condition: The ball's position (`xPos` and `yPos`) is updated by adding the velocity to its current coordinates.
	//
	public void move() {
		xPos += xVelocity;
		yPos += yVelocity;
	}

	// Method to set the ball's x-coordinate
	//
	//  Pre-condition: The input `number` must be a valid integer representing the new x-coordinate.
	//  Post-condition: The ball's x-coordinate (`xPos`) is updated to the specified value.
	//
	public void setX(int number) {
		xPos = number;
	}

	// Method to set the ball's y-coordinate
	//
	//  Pre-condition: The input `number` must be a valid integer representing the new y-coordinate.
	//  Post-condition: The ball's y-coordinate (`yPos`) is updated to the specified value.
	//
	public void setY(int number) {
		yPos = number;
	}
}

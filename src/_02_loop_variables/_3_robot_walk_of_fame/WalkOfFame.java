
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		rob.setX(10);
		// 2. Make the robot draw a star shape. Hint: angle=144.
		int count = 0;
		rob.setSpeed(50);
		// 3. Set the length of each line in the star to 30.
		/* while(count<5) {
			rob.penDown();
			rob.move(30);
			rob.turn(144);
			rob.penUp();
			count+=1;
		} */
		int q = 0;
		int o = 0;
		/** THE CHALLENGE: **/
		/* Make the robot draw a line of 10 stars (see recipe to see how it should look)
		 * Hint: The distance between stars is 50. */
		for(int i=0; i<1; i++) {
			rob.turn(90);
			while(o<10); {
			while(q<1) {
			rob.move(50);
			while(count<5) {
				rob.penDown();
				rob.move(30);
				rob.turn(144);
				rob.penUp();
				count+=1;
				}
			q+=1;
			} 
			o+=1;
			}
		}

		
		 

	}

}

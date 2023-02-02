
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)	
	
		//3. Set the pen width to 10
		rob.setPenWidth(10);		
		//4. Ask the user what color pen they would like the robot to draw with
		int colors = 0;
		while (colors < 100) {
		String color = JOptionPane.showInputDialog("what pen color");
		//5. Use an if/else statement to set the pen color that the user requested
		if(color.equals("red")) {
			rob.setPenColor(255, 0, 0);
		}
		else if(color.equals("blue")) {
			rob.setPenColor(0, 0, 255);
		}
		else if(color.equals("green")) {
			rob.setPenColor(0, 255, 0);
		}
		else if(color.equals("yellow")) {
			rob.setPenColor(255, 255, 0);
		}
        //6. If the user doesn't enter anything, choose a random color
		else {
			rob.setRandomPenColor();
		}
		int count = 0;
		while (count < 4) {
			rob.move(50);
			rob.turn(90);
			count+=1;
		}
		colors+=1;
	}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		




	}
}

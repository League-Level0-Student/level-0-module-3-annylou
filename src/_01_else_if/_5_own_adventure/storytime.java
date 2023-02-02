package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class storytime {
	
public static void main(String[] args) {
	
	String place = JOptionPane.showInputDialog("starducks or bongo and jerry's?");
	
	JOptionPane.showMessageDialog(null, "clement is going to his local " +place);
	
	if(place.equals("starducks")) {
		String drink = JOptionPane.showInputDialog("cherry juice or pineapple juice?");
		JOptionPane.showMessageDialog(null, "he got his usual, " +drink);
	}
	
	if(place.equals("bongo and jerry's")) {
		String food = JOptionPane.showInputDialog("cherry or pineapple?");
		JOptionPane.showMessageDialog(null, "he got his usual, " +food +" ice cream");
	}
	
	String walk = JOptionPane.showInputDialog("ashley or kevin?");
	
	if(walk.equals("ashley")) {
		String nervous = JOptionPane.showInputDialog("fall or stutter?");
		JOptionPane.showMessageDialog(null, "one his way back, he saw ashley, the prettiest girl in town");
		
		if(nervous.equals("fall")) {
			JOptionPane.showMessageDialog(null, "hi ashley how are you doin-- ooOAAAAHHHHHH! clement fell. with his face red as a cherry, he ran home.");
		}
		if(nervous.equals("stutter")) {
			JOptionPane.showMessageDialog(null, "h-hi a-ashley. clement is known to be super confident, so with his face red as a cherry, he ran home.");
		}
	}
	
	if(walk.equals("kevin")) {
		String bully = JOptionPane.showInputDialog("trip or rob?");
		JOptionPane.showMessageDialog(null, "one his way back, he saw kevin, the meanest guy in town");
		
		if(bully.equals("trip")) {
			JOptionPane.showMessageDialog(null, "kevin stuck out his foot to trip clement. ooOAAAAHHHHHH! with his face red as a cherry, he ran home.");
		}
		if(bully.equals("rob")) {
			JOptionPane.showMessageDialog(null, "'MONEY!!' kevin demanded. everyone was staring. his face turned red as a cherry, and he ran home.");
		}
	}
	
	

	}
}

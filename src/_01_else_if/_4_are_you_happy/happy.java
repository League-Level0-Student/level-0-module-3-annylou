package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class happy {
	
public static void main(String[] args) {
	

	String happy = JOptionPane.showInputDialog("are you happy?");
	
	if(happy.equals("yes")) {
		JOptionPane.showMessageDialog(null, "keep doing what you're doing");
		}
	
	else if(happy.equals("no")) {
		String want = JOptionPane.showInputDialog("do you want to be happy");
		
		if(want.equals("no")) {
			JOptionPane.showMessageDialog(null, "keep doing what you're doing");
		}
		else if(want.equals("yes")) {
			JOptionPane.showMessageDialog(null, "change something");
		}
		
		
		}
	
	
	
	
	}
}

package javaSwing1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class jframe1 {

	public static void main(String[] args) {
		 JFrame frame = new JFrame("Sample Frame");
		 
		 
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setSize(420,420);
		 
		 JPanel panel = new JPanel();// acts as container of the buttons etc
		 frame.add(panel);// this adds jpanel to the jframe
		 Components(panel);// mag hahandle ng mga elements na ilalagay sa panel
		 frame.setVisible(true);
		
		

	}
	
	 public static void Components (JPanel panel) {
		 
		 panel.setLayout(null);
		 
		 JLabel userLbl = new JLabel("Enter username:");
		 userLbl.setBounds(10, 20, 100, 25);
		 panel.add(userLbl);
		 
		 JTextField txtField = new JTextField(10);
		 txtField.setBounds(130, 20, 165, 25);
		 panel.add(txtField);
		 
		 JLabel passLbl = new JLabel("Enter password:");
		 passLbl.setBounds(10, 50, 100, 25);
		 panel.add(passLbl);
		 
		 JPasswordField passTxtField = new JPasswordField("Enter password:");
		 passTxtField.setBounds(130, 50, 165, 25);
		 panel.add(passTxtField);
		 
		 JButton logInBtn = new JButton("Log In");
		 logInBtn.setBounds(150, 90, 80, 25);
		 panel.add(logInBtn);
		 
	 }

}

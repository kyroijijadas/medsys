package javaSwing1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pureCode {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(300,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		frame.add(panel);
		
		
		JLabel namelbLabel = new JLabel("NAME: ");
		namelbLabel.setBounds(20, 25, 50, 50);
		panel.add(namelbLabel);
		
		JTextField nametxTextField = new JTextField();
		nametxTextField.setBounds(100, 25, 300, 50);
		panel.add(nametxTextField);
		
		frame.setVisible(true);
	
	}

}

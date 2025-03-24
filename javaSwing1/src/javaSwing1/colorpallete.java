package javaSwing1;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class colorpallete extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField hexTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					colorpallete frame = new colorpallete();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public colorpallete() {
		setTitle("HEX GENERATOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton colorBtn = new JButton("GENERATE");
		colorBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				colorGenerator();
			}
		});
		colorBtn.setBounds(163, 98, 109, 23);
		contentPane.add(colorBtn);
		
		hexTxt = new JTextField();
		hexTxt.setEditable(false);
		hexTxt.setBounds(30, 209, 137, 20);
		contentPane.add(hexTxt);
		hexTxt.setColumns(10);
        
        
	}
	
	private void colorGenerator() {
		    Random rand = new Random();
	        int r = rand.nextInt(256);
	        int g = rand.nextInt(256);
	        int b = rand.nextInt(256);
	        Color randomColor = new Color(r, g, b);
	        
	        String hexCode = String.format(" HEX CODE: "+"#%02X%02X%02X", r, g, b);

	        
	        contentPane.setBackground(randomColor);
	        hexTxt.setText(hexCode);
	}
}

package javaSwing1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class swingStart extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField firstNum;
	private JTextField secNum;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swingStart frame = new swingStart();
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
	public swingStart() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JRadioButton addBtn = new JRadioButton(" add");
		addBtn.setBounds(76, 52, 65, 23);
		contentPane.add(addBtn);

		JRadioButton subBtn = new JRadioButton("subs");
		subBtn.setBounds(143, 52, 55, 23);
		contentPane.add(subBtn);

		JRadioButton multBtn = new JRadioButton("times");
		multBtn.setBounds(200, 52, 65, 23);
		contentPane.add(multBtn);

		JRadioButton divBtn = new JRadioButton("divide");
		divBtn.setBounds(267, 52, 65, 23);
		contentPane.add(divBtn);

		ButtonGroup group = new ButtonGroup();
		group.add(addBtn);
		group.add(subBtn);
		group.add(multBtn);
		group.add(divBtn);

		double num1 = 0, num2 = 0;

		firstNum = new JTextField();
		firstNum.setBounds(166, 94, 86, 20);
		contentPane.add(firstNum);
		firstNum.setColumns(10);
		firstNum.setHorizontalAlignment(JTextField.CENTER);

		secNum = new JTextField();
		secNum.setColumns(10);
		secNum.setBounds(166, 125, 86, 20);
		contentPane.add(secNum);
		secNum.setHorizontalAlignment(JTextField.CENTER);
		

		JLabel Result = new JLabel("Result:");
		Result.setFont(new Font("Showcard Gothic", Font.PLAIN, 13));
		Result.setForeground(new Color(0, 0, 0));
		Result.setBounds(166, 218, 91, 14);
		contentPane.add(Result);

		JButton btnNewButton = new JButton("CALCULATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					double num1 = Double.parseDouble(firstNum.getText());
					double num2 = Double.parseDouble(secNum.getText());
					
					double result = 0;
					
					if(addBtn.isSelected()) {
						 result = num1 + num2;
					}else if (subBtn.isSelected()) {
						result = num1 - num2;
					}else if (multBtn.isSelected()) {
						result = num1 * num2;
					}else if (divBtn.isSelected()) {
						result = num1 / num2;
					}  
					
					
					Result.setText("Result: " + result);
					
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "INAVALID INPUT");
				}
				
				
			

			}
		});
		
		
		btnNewButton.setSelected(true);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setAutoscrolls(true);
		btnNewButton.setBounds(53, 174, 116, 23);
		contentPane.add(btnNewButton);
		
		
		JButton clearBtn = new JButton(" CLEAR");
		clearBtn.setFont(new Font("Tahoma", Font.BOLD, 11));
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum.setText(" ");
				secNum.setText(" ");
			}
		});
		clearBtn.setBounds(243, 174, 116, 23);
		contentPane.add(clearBtn);
		
		JLabel lblNewLabel = new JLabel(" <<< CALCULATOR >>>");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		lblNewLabel.setBounds(130, 11, 182, 34);
		contentPane.add(lblNewLabel);
		
		
	}
}

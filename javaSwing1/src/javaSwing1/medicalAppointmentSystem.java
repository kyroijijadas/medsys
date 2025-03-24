 package javaSwing1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Window;
import java.awt.Button;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;

public class medicalAppointmentSystem extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField nameField;
	private JTextField ageField;
	private JTextField contactField;
	private JRadioButton option1, option2, option3;
	private JComboBox<String> comboBox;
	private JButton submitBtn;
	private ButtonGroup group;
	private String[] bookedSlots = new String[8];
	private int counterSlots = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					medicalAppointmentSystem frame = new medicalAppointmentSystem();
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
	public medicalAppointmentSystem() {
	 
		setTitle("Medical Appointment System");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 378);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 25));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.LIGHT_GRAY);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 

		nameField = new JTextField();
		nameField.setBorder(new LineBorder(new Color(171, 173, 179)));
		nameField.setBackground(UIManager.getColor("Button.light"));
		nameField.setBounds(84, 107, 172, 20);
		contentPane.add(nameField);
		nameField.setColumns(10);

		ageField = new JTextField();
		ageField.setBackground(UIManager.getColor("Button.light"));
		ageField.setColumns(10);
		ageField.setBounds(84, 143, 172, 20);
		contentPane.add(ageField);

		contactField = new JTextField();
		contactField.setBackground(UIManager.getColor("Button.light"));
		contactField.setColumns(10);
		contactField.setBounds(84, 176, 172, 20);
		contentPane.add(contactField);

		JLabel nameLbl = new JLabel("NAME:");
		nameLbl.setFont(new Font("Tahoma", Font.BOLD, 11));
		nameLbl.setBounds(10, 110, 46, 14);
		contentPane.add(nameLbl);

		JLabel conatcLbl = new JLabel("CONTACT #:");
		conatcLbl.setFont(new Font("Tahoma", Font.BOLD, 11));
		conatcLbl.setBounds(10, 179, 66, 14);
		contentPane.add(conatcLbl);

		JLabel ageLbl = new JLabel("AGE:");
		ageLbl.setFont(new Font("Tahoma", Font.BOLD, 11));
		ageLbl.setBounds(10, 146, 46, 14);
		contentPane.add(ageLbl);

		JLabel lblNewLabel = new JLabel("PATIENT DETAILS");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		lblNewLabel.setBounds(96, 58, 89, 69);
		contentPane.add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setBounds(290, 256, 0, 0);
		contentPane.add(separator);

		option1 = new JRadioButton("DR. BILLY");
		option1.setBounds(319, 60, 109, 23);
		contentPane.add(option1);

		option2 = new JRadioButton("DR. LEANN");
		option2.setBounds(319, 83, 109, 23);
		contentPane.add(option2);

		option3 = new JRadioButton("DR. ALJON");
		option3.setBounds(319, 106, 109, 23);
		contentPane.add(option3);

		group = new ButtonGroup();
		group.add(option1);
		group.add(option2);
		group.add(option3);

		JLabel lblNewLabel_1 = new JLabel("AVAILABLE DOCTORS:");
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(319, 25, 109, 14);
		contentPane.add(lblNewLabel_1);

		String[] timeSlots = { " -- Select a time slot --", "08:00 AM - 09:00 AM", "09:00 AM - 10:00 AM",
				"10:00 AM - 11:00 AM", "11:00 AM - 12:00 PM", "01:00 PM - 02:00 PM", "02:00 PM - 03:00 PM",
				"03:00 PM - 04:00 PM", "04:00 PM - 05:00 PM" };

		comboBox = new JComboBox(timeSlots);
		comboBox.setBorder(new LineBorder(new Color(0, 0, 0)));
		comboBox.setToolTipText("");
		comboBox.setBounds(460, 62, 151, 35);
		contentPane.add(comboBox);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(UIManager.getColor("CheckBox.interiorBackground"));
		separator_1.setBounds(306, 50, 316, 174);
		contentPane.add(separator_1);

		submitBtn = new JButton("SUBMIT");
		submitBtn.setBackground(Color.WHITE);
		submitBtn.setForeground(Color.BLACK);
		submitBtn.setOpaque(true);
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validation();
			}
		});
		submitBtn.setFont(new Font("Tahoma", Font.BOLD, 9));
		submitBtn.setBorderPainted(false);
		submitBtn.setBackground(new Color(50, 205, 50));
		submitBtn.setBounds(125, 233, 89, 23);
		contentPane.add(submitBtn);

		JLabel heartIcon = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/smallheart.png")).getImage();
		heartIcon.setIcon(new ImageIcon(img1));
		heartIcon.setBounds(182, 77, 16, 29);
		contentPane.add(heartIcon);

		JLabel doctorIcon = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/doctor.png")).getImage();
		doctorIcon.setIcon(new ImageIcon(img2));
		doctorIcon.setBounds(426, 4, 16, 53);
		contentPane.add(doctorIcon);
		
		JLabel hospitalIcon = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/hospital.png")).getImage();
		hospitalIcon.setIcon(new ImageIcon(img3));
		hospitalIcon.setBounds(347, 126, 245, 203);
		contentPane.add(hospitalIcon);
		
		JLabel cross = new JLabel("");
		Image cros = new ImageIcon(this.getClass().getResource("/cross.png")).getImage();
		cross.setIcon(new ImageIcon(cros));
		cross.setBounds(195, 4, 38, 42);
		contentPane.add(cross);
		
		
		JLabel title = new JLabel("DOCTIME");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setHorizontalTextPosition(SwingConstants.CENTER);
		title.setBackground(Color.LIGHT_GRAY); // Light red
		title.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		title.setOpaque(true);
		title.setForeground(Color.WHITE);
		title.setBounds(69, 8, 145, 41);
		contentPane.add(title);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(79, 58, 154, 2);
		contentPane.add(separator_2);
		
		
	   

		submitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				submitBtn.setBackground(new Color(50, 205, 50));// Change to green when hovered
				submitBtn.setForeground(Color.WHITE);
				
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				submitBtn.setBackground(Color.WHITE);
				submitBtn.setForeground(Color.BLACK);
			}
		});

	}

	private void validation() {
	    String name = nameField.getText().trim();
	    String age = ageField.getText().trim();
	    String contact = contactField.getText().trim();
	    
	    // Ensure all fields are filled
	    if (name.isEmpty() || age.isEmpty() || contact.isEmpty()) {
	        JOptionPane.showMessageDialog(this, "DETAILS field cannot be empty!", "Validation Error",
	                JOptionPane.WARNING_MESSAGE);
	        return;
	    }
	    
	    // Check if any doctor is selected
	    String selectedDoctor = "";
	    if (option1.isSelected()) {
	        selectedDoctor = "DR. BILLY";
	    } else if (option2.isSelected()) {
	        selectedDoctor = "DR. LEANNE";
	    } else if (option3.isSelected()) {
	        selectedDoctor = "DR. ALJON";
	    } else {
	        JOptionPane.showConfirmDialog(this, "Please choose a Doctor!", "Validation Error",
	                JOptionPane.WARNING_MESSAGE);
	        return;
	    }

	    String timeSlots = (String) comboBox.getSelectedItem();

	  

	    // Check if age and contact contain only numbers
	    try {
	        Double.parseDouble(contact);
	        Integer.parseInt(age);
	    } catch (Exception e) {
	        JOptionPane.showConfirmDialog(this, "Please enter only numbers! for AGE & CONTACT", "Validation Error",
	                JOptionPane.WARNING_MESSAGE);
	        return;
	    }

	    // Ensure a valid time slot is selected
	    if (timeSlots.equals(" -- Select a time slot --")) {
	        JOptionPane.showMessageDialog(this, "Please select a time slot!", "Validation Error",
	                JOptionPane.WARNING_MESSAGE);
	        return;
	    }

	    // Validate that the name contains only letters and spaces
	    if (!name.matches("[a-zA-Z ]+")) {
	        JOptionPane.showMessageDialog(this, "Name must not contain numbers or special characters!", "Validation Error",
	                JOptionPane.ERROR_MESSAGE);
	        return;
	    }

	    // Check if the selected time slot is already booked
	    for (int i = 0; i < counterSlots; i++) {
	        if (bookedSlots[i] != null && bookedSlots[i].equals(timeSlots)) {
	            JOptionPane.showMessageDialog(this,"Please select another time slot, it's already occupied!", "WARNING!",
	                    JOptionPane.WARNING_MESSAGE);
	            return;
	        }
	    }

	    // Add the booked time slot if there is available space
	    if (counterSlots < bookedSlots.length) {
	        bookedSlots[counterSlots] = timeSlots;
	        counterSlots++;
	    } else {
	        JOptionPane.showMessageDialog(this, "No more slots available!", "Booking Full",
	                JOptionPane.WARNING_MESSAGE);
	        return;
	    }

	    // Display success message
	    JOptionPane.showMessageDialog(this, "Form Submitted Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

	    // Confirmation dialog to view user response
	    int choice = JOptionPane.showConfirmDialog(this, "Would you like to view your response?", "FORM",
	            JOptionPane.YES_NO_OPTION);

	    if (choice == JOptionPane.YES_OPTION) {
	        responseFrame(name, age, contact, selectedDoctor, timeSlots);
	    }

	    // Reset form fields
	    nameField.setText("");
	    ageField.setText("");
	    contactField.setText("");
	    comboBox.setSelectedIndex(0);
		group.clearSelection();
	}

	private void responseFrame(String name, String age, String contact, String doctors, String timeSlot) {
		JFrame frame = new JFrame("YOUR RESPONSE");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		frame.getContentPane().add(panel);

		JLabel nameLabel = new JLabel("Name: " + name);
		nameLabel.setBounds(100, 20, 250, 25);
		panel.add(nameLabel);

		JLabel ageLabel = new JLabel("Age: " + age);
		ageLabel.setBounds(100, 50, 250, 25);
		panel.add(ageLabel);

		JLabel contactLabel = new JLabel("Contact: " + contact);
		contactLabel.setBounds(100, 80, 250, 25);
		panel.add(contactLabel);

		JLabel doctorLabel = new JLabel("Doctor: " + doctors);
		doctorLabel.setBounds(100, 110, 300, 25);
		panel.add(doctorLabel);

		JLabel timeSlotLabel = new JLabel("Time Slot: " + timeSlot);
		timeSlotLabel.setBounds(100, 140, 300, 25);
		panel.add(timeSlotLabel);

		frame.setVisible(true);
	}
}
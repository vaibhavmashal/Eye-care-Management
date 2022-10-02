package com.cears.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.security.auth.login.LoginContext;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Rectangle;

import com.cears.jdo.InsertOperation;
import com.toedter.calendar.JDateChooser;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.JTextArea;
import java.awt.Cursor;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

public class RegisterPage extends JFrame {

	private JPanel contentPane;
	private JTextField firstNameT;
	private JTextField lastNameT;
	private JTextField MobileNoT;
	private JTextField email_id;
	private JPasswordField password_P;
	private JPasswordField cPassWord_p;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPage frame = new RegisterPage();
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
	public RegisterPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 1050, 600);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 1034, 79);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTER NOW FOR NETRA EYE CARE");
		lblNewLabel.setBackground(new Color(224, 255, 255));
		lblNewLabel.setBounds(232, 24, 594, 55);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 29));
		panel.add(lblNewLabel);
		
		
		JLabel marathi = new JLabel("Better Eyes for A Better Life");
		marathi.setForeground(Color.WHITE);
		marathi.setFont(new Font("Tahoma", Font.BOLD, 17));
		marathi.setBounds(403, 0, 251, 32);
		panel.add(marathi);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\Vaibhav\\Skincare imgs\\head1.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1034, 79);
		panel.add(lblNewLabel_1);
	
		
		JPanel register_p = new JPanel();
		register_p.setForeground(new Color(255, 0, 0));
		register_p.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		register_p.setBackground(Color.WHITE);
		register_p.setBounds(new Rectangle(0, 0, 0, 1));
		register_p.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		register_p.setBounds(174, 110, 715, 423);
		contentPane.add(register_p);
		register_p.setLayout(null);
		
		firstNameT = new JTextField();
		firstNameT.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		firstNameT.setBounds(65, 47, 202, 20);
		firstNameT.setToolTipText("");
		firstNameT.setColumns(10);
		firstNameT.setOpaque(false);
		firstNameT.setFont(new Font("Dialog", Font.PLAIN, 15));
		firstNameT.setCaretColor(Color.BLACK);
		//firstName.setBorder(null);
		register_p.add(firstNameT);
		
		JLabel firstName = new JLabel("First Name");
		firstName.setBounds(65, 11, 109, 26);
		firstName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		register_p.add(firstName);
		
		JLabel lastName = new JLabel("Last Name");
		lastName.setBounds(389, 11, 109, 26);
		lastName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		register_p.add(lastName);
		
		lastNameT = new JTextField();
		lastNameT.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		lastNameT.setBounds(389, 47, 202, 20);
		lastNameT.setToolTipText("");
		lastNameT.setOpaque(false);
		lastNameT.setFont(new Font("Dialog", Font.PLAIN, 15));
		lastNameT.setColumns(10);
		lastNameT.setCaretColor(Color.BLACK);
		register_p.add(lastNameT);
		
		JLabel mobileNo = new JLabel("Mobile No");
		mobileNo.setBounds(65, 78, 109, 26);
		mobileNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		register_p.add(mobileNo);
		
		MobileNoT = new JTextField();
		MobileNoT.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		MobileNoT.setBounds(65, 115, 202, 20);
		MobileNoT.setToolTipText("");
		MobileNoT.setOpaque(false);
		MobileNoT.setFont(new Font("Dialog", Font.PLAIN, 15));
		MobileNoT.setColumns(10);
		MobileNoT.setCaretColor(Color.BLACK);
		register_p.add(MobileNoT);
		
		JLabel email = new JLabel("E-Mail");
		email.setBounds(389, 78, 109, 26);
		email.setFont(new Font("Tahoma", Font.PLAIN, 17));
		register_p.add(email);
		
		email_id = new JTextField();
		email_id.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		email_id.setBounds(389, 115, 202, 20);
		email_id.setToolTipText("");
		email_id.setOpaque(false);
		email_id.setFont(new Font("Dialog", Font.PLAIN, 16));
		email_id.setColumns(10);
		email_id.setCaretColor(Color.BLACK);
		register_p.add(email_id);
		
		JLabel dob = new JLabel("DOB");
		dob.setBounds(65, 146, 109, 26);
		dob.setFont(new Font("Tahoma", Font.PLAIN, 17));
		register_p.add(dob);
		
		JDateChooser date = new JDateChooser();
		date.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		date.setBounds(65, 183, 202, 20);
		register_p.add(date);
		
		JLabel gender = new JLabel("Gender");
		gender.setBounds(389, 146, 109, 26);
		gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
		register_p.add(gender);
		
		JLabel password = new JLabel("Password");
		password.setBounds(65, 214, 109, 26);
		password.setFont(new Font("Tahoma", Font.PLAIN, 17));
		register_p.add(password);
		
		password_P = new JPasswordField();
		password_P.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		password_P.setBounds(65, 251, 202, 20);
		password_P.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		register_p.add(password_P);
		
		JLabel ConfirmPassword = new JLabel("Confirm Password");
		ConfirmPassword.setBounds(389, 214, 151, 26);
		ConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 17));
		register_p.add(ConfirmPassword);
		
		cPassWord_p = new JPasswordField();
		cPassWord_p.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		cPassWord_p.setBounds(389, 253, 202, 20);
		cPassWord_p.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
		register_p.add(cPassWord_p);
	
		
		JRadioButton maleRB = new JRadioButton("Male");
		maleRB.setBounds(482, 154, 62, 23);
		maleRB.setFont(new Font("Tahoma", Font.PLAIN, 15));
		maleRB.setBackground(Color.WHITE);
		buttonGroup.add(maleRB);
		register_p.add(maleRB);
		
		JRadioButton femaleRB = new JRadioButton("Female");
		femaleRB.setBounds(482, 180, 85, 23);
		femaleRB.setFont(new Font("Tahoma", Font.PLAIN, 15));
		femaleRB.setBackground(Color.WHITE);
		buttonGroup.add(femaleRB);
		register_p.add(femaleRB);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(482, 146, 109, 1);
		separator.setPreferredSize(new Dimension(0, 6));
		separator.setForeground(new Color(0, 0, 0));
		register_p.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(389, 34, 95, 1);
		separator_1.setPreferredSize(new Dimension(0, 6));
		separator_1.setForeground(Color.BLACK);
		register_p.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(389, 103, 57, 1);
		separator_2.setPreferredSize(new Dimension(0, 6));
		separator_2.setForeground(Color.BLACK);
		register_p.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(65, 239, 71, 1);
		separator_3.setPreferredSize(new Dimension(0, 6));
		separator_3.setForeground(Color.BLACK);
		register_p.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(65, 171, 37, 1);
		separator_4.setPreferredSize(new Dimension(0, 6));
		separator_4.setForeground(Color.BLACK);
		register_p.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(389, 239, 134, 1);
		separator_5.setPreferredSize(new Dimension(0, 6));
		separator_5.setForeground(Color.BLACK);
		register_p.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(389, 171, 57, 6);
		separator_6.setPreferredSize(new Dimension(0, 6));
		separator_6.setForeground(Color.BLACK);
		register_p.add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(65, 34, 85, 2);
		separator_7.setPreferredSize(new Dimension(0, 6));
		separator_7.setForeground(Color.BLACK);
		register_p.add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(64, 103, 79, 1);
		separator_8.setPreferredSize(new Dimension(0, 6));
		separator_8.setForeground(Color.BLACK);
		register_p.add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setBounds(482, 214, 109, 1);
		separator_9.setPreferredSize(new Dimension(0, 6));
		separator_9.setForeground(Color.BLACK);
		register_p.add(separator_9);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setBounds(281, 319, 1, 2);
		separator_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		register_p.add(separator_10);
		
		
		
		JLabel req11 = new JLabel("* Required");
		req11.setVisible(false);
		req11.setBounds(196, 93, 71, 26);
		req11.setForeground(new Color(255, 0, 0));
		req11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		req11.setHorizontalAlignment(SwingConstants.RIGHT);
		req11.setHorizontalTextPosition(SwingConstants.RIGHT);
		register_p.add(req11);
		
		JLabel req2 = new JLabel("* Required");
		req2.setBounds(520, 72, 71, 14);
		req2.setVisible(false);
		req2.setHorizontalTextPosition(SwingConstants.RIGHT);
		req2.setHorizontalAlignment(SwingConstants.RIGHT);
		req2.setForeground(Color.RED);
		req2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		register_p.add(req2);
		
		JLabel req3 = new JLabel("* Required");
		req3.setBounds(121, 143, 146, 14);
		req3.setVisible(false);
		req3.setHorizontalTextPosition(SwingConstants.RIGHT);
		req3.setHorizontalAlignment(SwingConstants.RIGHT);
		req3.setForeground(Color.RED);
		req3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		register_p.add(req3);
		
		JLabel req6 = new JLabel("* Required");
		req6.setBounds(196, 275, 71, 14);
		req6.setVisible(false);
		req6.setHorizontalTextPosition(SwingConstants.RIGHT);
		req6.setHorizontalAlignment(SwingConstants.RIGHT);
		req6.setForeground(Color.RED);
		req6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		register_p.add(req6);
		
		JLabel req7 = new JLabel("* Password Dosen't Match");
		req7.setBounds(404, 275, 187, 14);
		req7.setVisible(false);
		req7.setHorizontalTextPosition(SwingConstants.RIGHT);
		req7.setHorizontalAlignment(SwingConstants.RIGHT);
		req7.setForeground(Color.RED);
		req7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		register_p.add(req7);
		
		JLabel req4 = new JLabel("* Required");
		req4.setBounds(530, 96, 146, 20);
		req4.setVisible(false);
		req4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		req4.setForeground(Color.RED);
		register_p.add(req4);
		
		
		JLabel req5 = new JLabel("* Reqiured");
		req5.setBounds(551, 151, 100, 20);
		req5.setVisible(false);
		req5.setFont(new Font("Dialog", Font.PLAIN, 13));
		req5.setForeground(Color.RED);
		register_p.add(req5);
		
		JLabel req21 = new JLabel("*Required");
		req21.setVisible(false);
		req21.setForeground(Color.RED);
		req21.setFont(new Font("Tahoma", Font.PLAIN, 13));
		req21.setBounds(211, 73, 71, 14);
		register_p.add(req21);
		
		String dobString=null;
		
		JButton registerButton = new JButton("REGISTER");
		registerButton.setBounds(142, 311, 383, 45);
		registerButton.setForeground(Color.WHITE);
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean valFname,valLName,valEmail,valMobileNo,valconPass,valpass,valGender;
				Pattern ptr;
				Matcher match;
				valFname=firstNameT.getText().equals("");
				if(valFname){
					req21.setVisible(true);
				
				}else {
					req21.setVisible(false);
					
				}
				
				valLName=lastNameT.getText().equals("");
				if(valLName) {
					req2.setVisible(true);
				}else {
					req2.setVisible(false);
				}
				valEmail=email_id.getText().equals("");
				if(valEmail) {
					
					req4.setVisible(true);
				}else {
					
					ptr=Pattern.compile("[a-zA-Z0-9]{3,20}@[a-zA-Z]{3,10}.(com|in)");
					match=ptr.matcher(email_id.getText());
					valEmail=!(match.find()&&match.group().equals(email_id.getText()));
					if(valEmail) {
						req4.setText(" *Incorrect Email !");
						req4.setVisible(true);
					}
					else {
						req4.setVisible(false);
					}
				}
				
				valMobileNo=MobileNoT.getText().equals("");
				
				if(valMobileNo) {
					
					req3.setVisible(true);	
				}else {
					ptr=Pattern.compile("(0/+91)?[6-9][0-9]{9}");
					match=ptr.matcher(MobileNoT.getText());
					valMobileNo=!(match.find()&&match.group().equals(MobileNoT.getText()));
					if(valMobileNo) {
						req3.setText("Incorrect No !");
						req3.setVisible(true);
					}
					else {
						req3.setVisible(false);
					}
				}
				valGender=buttonGroup.isSelected(null);
				if(valGender) {
					req5.setVisible(true);
				}else{
					req5.setVisible(false);					
				}
				
				valpass=String.valueOf(password_P.getPassword()).equals("");
				if(valpass) {
					req6.setVisible(true);
				}else {
					req6.setVisible(false);
				}
				valconPass=String.valueOf(cPassWord_p.getPassword()).equals("");
				if(valconPass) {
					req7.setVisible(true);
				}else {
					req7.setVisible(false);
				}
				valconPass=!(String.valueOf(password_P.getPassword()).equals(String.valueOf(cPassWord_p.getPassword())));
				if(valconPass) {
					req7.setVisible(true);
				}
				else {
					req11.setVisible(false);
				}
				
				if(!(valLName||valFname||valconPass||valEmail||valGender||valMobileNo||valpass)) {
					ArrayList<String> aList=new ArrayList<String>();
					String dobString=date.getDate().toString();
					
					System.out.println(dob);
					aList.add(firstNameT.getText());
					aList.add(lastNameT.getText());
					aList.add(MobileNoT.getText());
					aList.add(email_id.getText());
					aList.add(dobString);
					if(maleRB.isSelected()) {
						aList.add("Male");
					}else {
						aList.add("Female");
					}
					aList.add(String.valueOf(password_P.getPassword()));
					aList.add(String.valueOf(cPassWord_p.getPassword()));
					InsertOperation io=new InsertOperation();
					int rows=io.inser_into_registeration_table(aList);
					if(rows==0) {
						JOptionPane.showMessageDialog(null, "Alreay have account please login with another account","Failed",JOptionPane.ERROR_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null,"Registration Done Successfully","Pass",JOptionPane.INFORMATION_MESSAGE);
						LogIn lp=new LogIn();
						lp.setLocationRelativeTo(null);
						lp.setVisible(true);
						dispose();
					}
					
				}
				
				
			}
		
			
		});
		registerButton.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		registerButton.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 22));
		registerButton.setBackground(new Color(51, 204, 153));
		registerButton.setAlignmentY(Component.TOP_ALIGNMENT);
		register_p.add(registerButton);
		
		JButton reset = new JButton("RESET");
		reset.setBounds(568, 372, 134, 26);
		reset.setForeground(Color.WHITE);
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNameT.setText("");
				lastNameT.setText("");
				email_id.setText("");
				MobileNoT.setText("");
				password_P.setText("");
				cPassWord_p.setText("");
				date.setCalendar(null);
				buttonGroup.setSelected(null, rootPaneCheckingEnabled);
				
				req11.setVisible(false);
				req2.setVisible(false);
				req3.setVisible(false);
				req4.setVisible(false);
				req5.setVisible(false);
				req6.setVisible(false);
				req7.setVisible(false);
				
				buttonGroup.setSelected(null, rootPaneCheckingEnabled);
			
				
			}
		});
		reset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		reset.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		reset.setBackground(new Color(255, 0, 0));
		reset.setFont(new Font("Dialog", Font.PLAIN, 14));
		register_p.add(reset);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setOrientation(SwingConstants.VERTICAL);
		separator_11.setBounds(346, 253, 14, -213);
		register_p.add(separator_11);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setOrientation(SwingConstants.VERTICAL);
		separator_12.setForeground(Color.BLACK);
		separator_12.setBackground(Color.BLACK);
		separator_12.setBounds(330, 13, 19, 280);
		register_p.add(separator_12);
		
		
	
		
		
		
	}
}

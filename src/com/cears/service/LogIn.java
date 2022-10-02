package com.cears.service;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.crypto.AEADBadTagException;
import javax.management.loading.PrivateClassLoader;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Label;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import com.cears.jdo.CheckUsernamePassword;
import com.cears.jdo.login;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogIn extends JFrame {

	private JPanel contentPane;
	
	private JPasswordField passworFiled;

	CheckUsernamePassword cup=new CheckUsernamePassword();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
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
	public LogIn() {
		cup.select_username_password();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 1050, 600);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1034, 89);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBackground(new Color(102, 204, 153));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel tagLine = new JLabel("NETRA EYE CARE HOSPITAL");
		tagLine.setForeground(Color.WHITE);
		tagLine.setFont(new Font("Tahoma", Font.BOLD, 30));
		tagLine.setBounds(329, 32, 450, 57);
		panel.add(tagLine);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		loginPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		loginPanel.setBounds(139, 118, 810, 407);
		loginPanel.setBackground(Color.WHITE);
		contentPane.add(loginPanel);
		loginPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(-87, 108, 54, 288);
		loginPanel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("E:\\Vaibhav\\white.png"));
		
		JLabel image = new JLabel("New label");
		image.setBounds(36, 11, 330, 385);
		image.setIcon(new ImageIcon("E:\\Vaibhav\\Skincare imgs\\loginPage-ImResizer.png"));
		loginPanel.add(image);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(400, 0, 26, 407);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		loginPanel.add(separator);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setForeground(Color.BLACK);
		separator_1_2.setBackground(Color.BLACK);
		separator_1_2.setBounds(0, 411, 810, 37);
		loginPanel.add(separator_1_2);
		tagLine.setAlignmentX(0.0f);
		
		
		
		JLabel slogan = new JLabel("Better Eyes for A Better Life");
		slogan.setForeground(Color.WHITE);
		slogan.setFont(new Font("Tahoma", Font.BOLD, 17));
		slogan.setBounds(396, 11, 250, 33);
		panel.add(slogan);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBackground(Color.BLACK);
		separator_1_1.setBounds(934, 118, 33, 407);
		contentPane.add(separator_1_1);
		
		JLabel userName = new JLabel("Username");
		userName.setBounds(436, 80, 109, 26);
		userName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		loginPanel.add(userName);
		JTextField uName = new JTextField();
		uName.setBackground(new Color(255, 255, 255));
		uName.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		uName.setSelectionColor(Color.BLACK);
		uName.setBounds(436, 120, 275, 20);
		uName.setToolTipText("");
		uName.setOpaque(false);
		uName.setFont(new Font("Dialog", Font.PLAIN, 15));
		uName.setColumns(10);
		uName.setCaretColor(Color.BLACK);
		loginPanel.add(uName);
		
		JLabel password = new JLabel("Password");
		password.setFont(new Font("Tahoma", Font.PLAIN, 17));
		password.setBounds(436, 175, 109, 26);
		loginPanel.add(password);
		
		passworFiled = new JPasswordField();
		passworFiled.setOpaque(false);
		passworFiled.setFont(new Font("Dialog", Font.PLAIN, 15));
		passworFiled.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		passworFiled.setBounds(436, 213, 275, 20);
		loginPanel.add(passworFiled);
		
		
		
		JLabel register = new JLabel("Register");
		register.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 153)));
		register.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		register.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RegisterPage page=new RegisterPage();
				page.setVisible(true);
				setVisible(false);
			}
		});
		register.setForeground(new Color(51, 0, 204));
		register.setFont(new Font("Tahoma", Font.BOLD, 13));
		register.setBounds(466, 370, 63, 20);
		loginPanel.add(register);
		
		JLabel msg = new JLabel("If you don't have account");
		msg.setForeground(new Color(0, 0, 0));
		msg.setFont(new Font("Tahoma", Font.BOLD, 13));
		msg.setBounds(535, 369, 176, 20);
		loginPanel.add(msg);
		
		JLabel login = new JLabel("LOGIN");
		login.setBounds(552, 11, 87, 27);
		loginPanel.add(login);
		login.setForeground(Color.BLUE);
		login.setFont(new Font("Dialog", Font.BOLD, 26));
		
		JLabel req1 = new JLabel("* Required");
		req1.setVisible(false);
		req1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		req1.setForeground(Color.RED);
		req1.setBounds(646, 144, 109, 14);
		loginPanel.add(req1);
		
		JLabel req2 = new JLabel("* Required");
		req2.setVisible(false);
		req2.setForeground(Color.RED);
		req2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		req2.setBounds(646, 233, 109, 20);
		loginPanel.add(req2);
		
		JLabel error = new JLabel("*Incorrect Username Password*");
		error.setVisible(false);
		error.setForeground(Color.RED);
		error.setFont(new Font("Tahoma", Font.PLAIN, 13));
		error.setBounds(490, 342, 196, 14);
		loginPanel.add(error);
		
		
		JButton loginB = new JButton("LOGIN");
		loginB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		loginB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean valuserName,valPassword;
				
				
				valuserName=uName.getText().equals("");
				if(valuserName) {
					req1.setVisible(true);
				}else {
					req1.setVisible(false);
				}
				
				
				valPassword=String.valueOf(passworFiled.getPassword()).equals("");
				if(valPassword) {
					req2.setVisible(true);
				}else {
					req2.setVisible(false);
				}
				
				if(!(valuserName||valPassword)) {
					if (cup.check_username_password(uName.getText(), String.valueOf(passworFiled.getPassword()))) {
						error.setVisible(false);
						JOptionPane.showMessageDialog(null, "log in successfully","Passed",JOptionPane.INFORMATION_MESSAGE);
						DashBordMain dBordMain=new DashBordMain(uName.getText());
						dBordMain.setLocationRelativeTo(null);
						dBordMain.setVisible(true);
						dispose();
						
					}else {
						error.setVisible(true);
						JOptionPane.showMessageDialog(null, "log in unsuccessfully","Failed",JOptionPane.ERROR_MESSAGE);
						error.setVisible(true);
						
					}
					
				
					
					
				}
				 
			}
			
		});
		loginB.setBorder(new LineBorder(new Color(0, 153, 0), 2, true));
		loginB.setForeground(Color.WHITE);
		loginB.setBackground(new Color(0, 204, 51));
		loginB.setFont(new Font("Dialog", Font.PLAIN, 18));
		loginB.setBounds(520, 293, 129, 23);
		loginPanel.add(loginB);
		
		JLabel lblinstruction = new JLabel("*Use username as a registerd  Email-id* ");
		lblinstruction.setForeground(new Color(102, 51, 0));
		lblinstruction.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblinstruction.setBounds(466, 49, 269, 20);
		loginPanel.add(lblinstruction);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel_2.setIcon(new ImageIcon("E:\\Vaibhav\\Skincare imgs\\log11.jpg"));
		lblNewLabel_2.setBounds(400, 0, 410, 407);
		loginPanel.add(lblNewLabel_2);
		
		
		
		
	
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("E:\\Vaibhav\\Skincare imgs\\head1.jpg"));
		lblNewLabel.setBounds(0, 0, 1034, 89);
		panel.add(lblNewLabel);
	

		
	}
}

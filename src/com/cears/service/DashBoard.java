package com.cears.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import com.cears.jdo.SelectOperations;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Cursor;

public class DashBoard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoard frame = new DashBoard("");
					frame.setLocationRelativeTo(null);
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
	public DashBoard(String username123) {
		SelectOperations so=new SelectOperations();
		ArrayList<String>al=so.selectForDashBoard(username123);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 1050, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new MatteBorder(2, 0, 0, 2, (Color) new Color(0, 0, 0)));
		panel.setBounds(0, 80, 315, 481);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		lblNewLabel.setIcon(new ImageIcon("E:\\Vaibhav\\Skincare imgs\\eye1.jpg"));
		lblNewLabel.setBounds(0, 183, 315, 256);
		panel.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setForeground(Color.BLACK);
		separator.setBounds(0, 287, 342, 17);
		panel.add(separator);
		
		
		
		JSeparator s2 = new JSeparator();
		s2.setForeground(Color.BLACK);
		s2.setBackground(Color.BLACK);
		s2.setBounds(10, 53, 295, 17);
		panel.add(s2);
		
		JSeparator s1 = new JSeparator();
		s1.setOrientation(SwingConstants.VERTICAL);
		s1.setForeground(Color.BLACK);
		s1.setBackground(Color.BLACK);
		s1.setBounds(34, 11, 14, 31);
		panel.add(s1);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1.setForeground(Color.BLACK);
		separator_2_1.setBackground(Color.BLACK);
		separator_2_1.setBounds(34, 68, 30, 31);
		panel.add(separator_2_1);
		
		JSeparator s2_1 = new JSeparator();
		s2_1.setForeground(Color.BLACK);
		s2_1.setBackground(Color.BLACK);
		s2_1.setBounds(10, 107, 295, 17);
		panel.add(s2_1);
		
		
		
		JPanel headPanel = new JPanel();
		headPanel.setBackground(new Color(255, 255, 255));
		headPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		headPanel.setBounds(0, 0, 1034, 81);
		contentPane.add(headPanel);
		headPanel.setLayout(null);
		
		
		
		JLabel slogan = new JLabel("NETRA EYE CARE HOSPITAL");
		slogan.setForeground(Color.WHITE);
		slogan.setFont(new Font("Tahoma", Font.BOLD, 26));
		slogan.setFocusTraversalPolicyProvider(true);
		slogan.setBounds(335, 43, 382, 32);
		headPanel.add(slogan);
		
	
		
		JSeparator separator_2_1_1 = new JSeparator();
		separator_2_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1_1.setForeground(Color.BLACK);
		separator_2_1_1.setBackground(Color.BLACK);
		separator_2_1_1.setBounds(34, 125, 14, 31);
		panel.add(separator_2_1_1);
		
		JSeparator s2_1_1 = new JSeparator();
		s2_1_1.setForeground(Color.BLACK);
		s2_1_1.setBackground(Color.BLACK);
		s2_1_1.setBounds(10, 161, 295, 43);
		panel.add(s2_1_1);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\Vaibhav\\Skincare imgs\\my2.png"));
		lblNewLabel_1.setBounds(55, 11, 35, 31);
		panel.add(lblNewLabel_1);
		
		JLabel saImage = new JLabel("New label");
		saImage.setIcon(new ImageIcon("E:\\Vaibhav\\Skincare imgs\\schedule1.png"));
		saImage.setBounds(44, 68, 46, 31);
		panel.add(saImage);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("E:\\Vaibhav\\Skincare imgs\\view2.jpg"));
		lblNewLabel_3.setBounds(58, 125, 35, 31);
		panel.add(lblNewLabel_3);
		
		JSeparator separator_2_1_1_1 = new JSeparator();
		separator_2_1_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1_1_1.setForeground(Color.BLACK);
		separator_2_1_1_1.setBackground(Color.BLACK);
		separator_2_1_1_1.setBounds(34, 443, 14, 27);
		panel.add(separator_2_1_1_1);
		
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("E:\\Vaibhav\\Skincare imgs\\l123.png"));
		lblNewLabel_2.setBounds(55, 444, 40, 35);
		panel.add(lblNewLabel_2);
		
		JLabel slogan1 = new JLabel("Better Eyes for A Better Life");
		slogan1.setForeground(Color.WHITE);
		slogan1.setFont(new Font("Tahoma", Font.BOLD, 17));
		slogan1.setBounds(386, 11, 263, 31);
		headPanel.add(slogan1);
		
		JLabel head = new JLabel("New label");
		head.setBounds(0, 0, 1034, 81);
		head.setIcon(new ImageIcon("E:\\Vaibhav\\Skincare imgs\\head1.jpg"));
		headPanel.add(head);
		
		JPanel myProfilePanel = new JPanel();
		myProfilePanel.setBackground(Color.WHITE);
		myProfilePanel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		myProfilePanel.setBounds(376, 92, 580, 414);
		contentPane.add(myProfilePanel);
		myProfilePanel.setLayout(null);
		
		JSeparator separator_1_2_1_1 = new JSeparator();
		separator_1_2_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_1_2_1_1.setForeground(Color.BLACK);
		separator_1_2_1_1.setBackground(Color.BLACK);
		separator_1_2_1_1.setBounds(578, 15, 2, 371);
		myProfilePanel.add(separator_1_2_1_1);
		
		JLabel profileimage = new JLabel("New label");
		profileimage.setIcon(new ImageIcon("E:\\Vaibhav\\Skincare imgs\\myprofilemain.png"));
		profileimage.setBounds(197, 15, 186, 158);
		myProfilePanel.add(profileimage);
		
		JSeparator separator_1_3 = new JSeparator();
		separator_1_3.setForeground(Color.BLACK);
		separator_1_3.setBackground(Color.BLACK);
		separator_1_3.setBounds(0, 184, 580, 12);
		myProfilePanel.add(separator_1_3);
		
		JLabel emailLogo = new JLabel("New label");
		emailLogo.setIcon(new ImageIcon("E:\\Vaibhav\\Skincare imgs\\mail1.jpg"));
		emailLogo.setBounds(182, 284, 35, 28);
		myProfilePanel.add(emailLogo);
		
		
		
		JLabel phoneLogo = new JLabel("New label");
		phoneLogo.setIcon(new ImageIcon("E:\\Vaibhav\\Skincare imgs\\phone1.png"));
		phoneLogo.setBounds(182, 319, 35, 39);
		myProfilePanel.add(phoneLogo);
		
		
		
		JLabel callogo = new JLabel("New label");
		callogo.setIcon(new ImageIcon("E:\\Vaibhav\\Skincare imgs\\cal1.png"));
		callogo.setBounds(182, 360, 35, 26);
		myProfilePanel.add(callogo);
		
		JLabel lblName = new JLabel(al.get(0));
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBounds(246, 212, 186, 26);
		myProfilePanel.add(lblName);
		
		JLabel lblGender = new JLabel(al.get(3));
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGender.setBounds(249, 249, 156, 26);
		myProfilePanel.add(lblGender);
		
		JLabel email = new JLabel(username123);
		email.setFont(new Font("Tahoma", Font.PLAIN, 16));
		email.setBounds(246, 286, 221, 26);
		myProfilePanel.add(email);
		
		JLabel phoneNo = new JLabel(al.get(1));
		phoneNo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		phoneNo.setBounds(246, 323, 221, 26);
		myProfilePanel.add(phoneNo);
		
		JLabel date = new JLabel(al.get(2));
		date.setFont(new Font("Tahoma", Font.PLAIN, 16));
		date.setBounds(246, 360, 221, 26);
		myProfilePanel.add(date);
		
	
		
		
		
		JLabel lblMyimage = new JLabel("New label");
		lblMyimage.setIcon(new ImageIcon("E:\\Vaibhav\\Skincare imgs\\my2.png"));
		lblMyimage.setBounds(182, 207, 35, 28);
		myProfilePanel.add(lblMyimage);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("E:\\Vaibhav\\Skincare imgs\\gender1.png"));
		lblNewLabel_4.setBounds(182, 245, 35, 28);
		myProfilePanel.add(lblNewLabel_4);
		
		JSeparator separator_1_2_3 = new JSeparator();
		separator_1_2_3.setOrientation(SwingConstants.VERTICAL);
		separator_1_2_3.setForeground(Color.BLACK);
		separator_1_2_3.setBackground(Color.BLACK);
		separator_1_2_3.setBounds(950, 135, 41, 371);
		contentPane.add(separator_1_2_3);
		
		JLabel myProfile = new JLabel("My Profile");
		myProfile.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		myProfile.setForeground(new Color(0, 153, 102));
		myProfile.setFont(new Font("Tahoma", Font.BOLD, 17));
		myProfile.setBounds(100, 11, 106, 31);
		panel.add(myProfile);
		
		JLabel schedualAppointment = new JLabel("Schedual Appointment");
		schedualAppointment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScheduleAppointment sc=new ScheduleAppointment(username123);
				sc.setLocationRelativeTo(null);
				sc.setVisible(true);
				dispose();
			}
		});
		schedualAppointment.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		schedualAppointment.setForeground(new Color(0, 153, 102));
		schedualAppointment.setFont(new Font("Tahoma", Font.BOLD, 15));
		schedualAppointment.setBounds(100, 68, 185, 31);
		panel.add(schedualAppointment);
		
		JLabel viewAppointment = new JLabel("View Appointment");
		viewAppointment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				ViewAppointment viewAppointment=new ViewAppointment(username123);
				viewAppointment.setLocationRelativeTo(null);
				viewAppointment.setVisible(true);
				dispose();
			}
		});
		viewAppointment.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewAppointment.setForeground(new Color(0, 153, 102));
		viewAppointment.setFont(new Font("Tahoma", Font.BOLD, 15));
		viewAppointment.setBounds(100, 125, 154, 31);
		panel.add(viewAppointment);
		

		JLabel logOut = new JLabel("Logout");
		logOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LogIn log=new LogIn();
				log.setLocationRelativeTo(null);
				log.setVisible(true);
				dispose();
			}
		});
		logOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logOut.setForeground(new Color(255, 0, 0));
		logOut.setFont(new Font("Tahoma", Font.BOLD, 17));
		logOut.setBounds(100, 443, 106, 31);
		panel.add(logOut);
		
	
	}
}

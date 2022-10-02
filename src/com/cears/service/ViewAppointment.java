package com.cears.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;

import com.cears.jdo.CheckUsernamePassword;
import com.cears.jdo.SelectOperations;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class ViewAppointment extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAppointment frame = new ViewAppointment("");
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
	public ViewAppointment(String username123) {
		CheckUsernamePassword cup=new CheckUsernamePassword();
		
		SelectOperations so =new SelectOperations(); 
		ArrayList<String>al=so.selectforViewAppointment(username123);
		System.out.println(al);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 1050, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(2, 0, 0, 2, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 80, 315, 481);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("E:\\Vaibhav\\Skincare imgs\\eye1.jpg"));
		lblNewLabel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		lblNewLabel.setBounds(0, 183, 315, 256);
		panel.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
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
		lblNewLabel_3.setBounds(55, 125, 35, 31);
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
		
	
		
		
		JLabel slogan = new JLabel("NETRA EYE CARE HOSPITAL");
		slogan.setForeground(Color.WHITE);
		slogan.setFont(new Font("Tahoma", Font.BOLD, 26));
		slogan.setFocusTraversalPolicyProvider(true);
		slogan.setBounds(363, 33, 382, 32);
		contentPane.add(slogan);
		
		JLabel slogan1 = new JLabel("Better Eyes for A Better Life");
		slogan1.setForeground(Color.WHITE);
		slogan1.setFont(new Font("Tahoma", Font.BOLD, 17));
		slogan1.setBounds(421, 0, 263, 31);
		contentPane.add(slogan1);
		
		JLabel head = new JLabel("New label");
		head.setIcon(new ImageIcon("E:\\Vaibhav\\Skincare imgs\\head1.jpg"));
		head.setBounds(0, 0, 1034, 81);
		contentPane.add(head);
		
		JPanel panelViewAppointment = new JPanel();
		panelViewAppointment.setLayout(null);
		panelViewAppointment.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelViewAppointment.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelViewAppointment.setBackground(Color.WHITE);
		panelViewAppointment.setBounds(376, 110, 520, 411);
		contentPane.add(panelViewAppointment);
		
		JSeparator separator_2_3 = new JSeparator();
		separator_2_3.setForeground(Color.BLACK);
		separator_2_3.setBackground(Color.BLACK);
		separator_2_3.setBounds(53, 37, 432, 19);
		panelViewAppointment.add(separator_2_3);
		
		JLabel lblApponitmentDetails = new JLabel("APPOINTMENT DETAILS");
		lblApponitmentDetails.setForeground(new Color(0, 0, 204));
		lblApponitmentDetails.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblApponitmentDetails.setBounds(171, 0, 242, 26);
		panelViewAppointment.add(lblApponitmentDetails);
		
		JLabel lblapointmentid = new JLabel("Apointment ID");
		lblapointmentid.setForeground(new Color(0, 153, 102));
		lblapointmentid.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblapointmentid.setBounds(64, 64, 132, 26);
		panelViewAppointment.add(lblapointmentid);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setForeground(new Color(0, 153, 102));
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDate.setBounds(64, 158, 132, 26);
		panelViewAppointment.add(lblDate);
		
		JLabel lblAdharNo = new JLabel("Adhar No.");
		lblAdharNo.setForeground(new Color(0, 153, 102));
		lblAdharNo.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAdharNo.setBounds(314, 64, 132, 26);
		panelViewAppointment.add(lblAdharNo);
		
		JLabel lblSurgery = new JLabel("Surgery.");
		lblSurgery.setForeground(new Color(0, 153, 102));
		lblSurgery.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSurgery.setBounds(314, 158, 132, 26);
		panelViewAppointment.add(lblSurgery);
		
		JLabel lblApponitmentGet = new JLabel(al.get(0));
		lblApponitmentGet.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblApponitmentGet.setBounds(74, 101, 94, 26);
		panelViewAppointment.add(lblApponitmentGet);
		
		JLabel lblAadharGet = new JLabel(al.get(1));
		lblAadharGet.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAadharGet.setBounds(309, 101, 137, 26);
		panelViewAppointment.add(lblAadharGet);
		
		JLabel lblGetDate = new JLabel(al.get(2));
		lblGetDate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblGetDate.setBounds(64, 195, 180, 26);
		panelViewAppointment.add(lblGetDate);
		
		JLabel lblGetSurgery = new JLabel(al.get(3));
		lblGetSurgery.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblGetSurgery.setBounds(314, 195, 145, 26);
		panelViewAppointment.add(lblGetSurgery);
		
		JLabel lblimage = new JLabel("New label");
		lblimage.setIcon(new ImageIcon("E:\\Vaibhav\\Skincare imgs\\eyes1.jpg"));
		lblimage.setBounds(143, 253, 216, 132);
		panelViewAppointment.add(lblimage);
		
		JSeparator separator_2_3_1 = new JSeparator();
		separator_2_3_1.setForeground(Color.BLACK);
		separator_2_3_1.setBackground(Color.BLACK);
		separator_2_3_1.setBounds(53, 232, 432, 26);
		panelViewAppointment.add(separator_2_3_1);
		
		JSeparator separator_2_3_2 = new JSeparator();
		separator_2_3_2.setForeground(Color.BLACK);
		separator_2_3_2.setBackground(Color.BLACK);
		separator_2_3_2.setBounds(53, 138, 432, 19);
		panelViewAppointment.add(separator_2_3_2);
		
		JSeparator separator_2_3_3 = new JSeparator();
		separator_2_3_3.setOrientation(SwingConstants.VERTICAL);
		separator_2_3_3.setForeground(Color.BLACK);
		separator_2_3_3.setBackground(Color.BLACK);
		separator_2_3_3.setBounds(53, 37, 38, 195);
		panelViewAppointment.add(separator_2_3_3);
		
		JSeparator separator_2_3_3_1 = new JSeparator();
		separator_2_3_3_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_3_3_1.setForeground(Color.BLACK);
		separator_2_3_3_1.setBackground(Color.BLACK);
		separator_2_3_3_1.setBounds(483, 37, 27, 195);
		panelViewAppointment.add(separator_2_3_3_1);
		
		JSeparator separator_2_3_2_1 = new JSeparator();
		separator_2_3_2_1.setForeground(Color.BLACK);
		separator_2_3_2_1.setBackground(Color.BLACK);
		separator_2_3_2_1.setBounds(165, 21, 216, 11);
		panelViewAppointment.add(separator_2_3_2_1);
		
		JLabel myProfile = new JLabel("My Profile");
		myProfile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DashBoard dashBoard=new DashBoard(username123);
			    dashBoard.setLocationRelativeTo(null);;
				dashBoard.setVisible(true);;
			   dispose();
			}
		});
		myProfile.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		myProfile.setForeground(new Color(0, 153, 102));
		myProfile.setFont(new Font("Tahoma", Font.BOLD, 17));
		myProfile.setBounds(100, 11, 106, 31);
		panel.add(myProfile);
		
		JLabel schedualAppointment = new JLabel("Schedual Appointment");
		schedualAppointment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScheduleAppointment sa=new ScheduleAppointment(username123);
				sa.setLocationRelativeTo(null);;
				sa.setVisible(true);
				dispose();
				
			}
		});
		schedualAppointment.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		schedualAppointment.setForeground(new Color(0, 153, 102));
		schedualAppointment.setFont(new Font("Tahoma", Font.BOLD, 15));
		schedualAppointment.setBounds(100, 68, 185, 31);
		panel.add(schedualAppointment);
		
		JLabel logOut = new JLabel("Logout");
		logOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LogIn log=new LogIn();
				log.setLocationRelativeTo(null);
				log.setVisible(true);
				dispose();
			}
		});
		logOut.setForeground(Color.RED);
		logOut.setFont(new Font("Tahoma", Font.BOLD, 17));
		logOut.setBounds(100, 443, 106, 31);
		panel.add(logOut);
		
		JLabel viewAppointment = new JLabel("View Appointment");
		viewAppointment.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewAppointment.setForeground(new Color(0, 153, 102));
		viewAppointment.setFont(new Font("Tahoma", Font.BOLD, 15));
		viewAppointment.setBounds(100, 125, 154, 31);
		panel.add(viewAppointment);
	}
}

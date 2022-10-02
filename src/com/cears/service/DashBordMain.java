package com.cears.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import java.awt.Color;
import java.awt.Cursor;

public class DashBordMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBordMain frame = new DashBordMain("");
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
	public DashBordMain(String username123) {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 1050, 600);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
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
		lblNewLabel.setBounds(0, 181, 315, 256);
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
		s2_1_1.setBounds(0, 180, 295, 43);
		panel.add(s2_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\Vaibhav\\Skincare imgs\\my2.png"));
		lblNewLabel_1.setBounds(55, 11, 35, 31);
		panel.add(lblNewLabel_1);
		
		JLabel saImage = new JLabel("New label");
		saImage.setIcon(new ImageIcon("E:\\Vaibhav\\Skincare imgs\\cal1.png"));
		saImage.setBounds(55, 68, 40, 31);
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
		
		JLabel viewAppointment = new JLabel("View Appointment");
		viewAppointment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ViewAppointment viewAppointment=new ViewAppointment(username123);
				viewAppointment.setLocationRelativeTo(null);
				viewAppointment.setVisible(true);
				LogIn log=new LogIn();
				log.setLocationRelativeTo(null);
				log.setVisible(true);
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
				dispose();
			}
		});
		logOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logOut.setForeground(Color.RED);
		logOut.setFont(new Font("Tahoma", Font.BOLD, 17));
		logOut.setBounds(100, 443, 106, 31);
		panel.add(logOut);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("E:\\Vaibhav\\Skincare imgs\\eyeback3.png"));
		lblNewLabel_4.setBounds(318, 80, 716, 481);
		contentPane.add(lblNewLabel_4);
		
		
	}

}

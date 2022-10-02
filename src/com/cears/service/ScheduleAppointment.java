package com.cears.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;

import com.cears.jdo.CheckUsernamePassword;
import com.cears.jdo.InsertOperation;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScheduleAppointment extends JFrame {

	private JPanel contentPane;
	private JTextField txtAddharNo;
	ButtonGroup btnGroup=new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScheduleAppointment frame = new ScheduleAppointment("");
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
	public ScheduleAppointment(String username123) {
		CheckUsernamePassword cup=new CheckUsernamePassword();
		
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
		lblNewLabel.setBounds(0, 182, 315, 256);
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
		
		JPanel AppointMent = new JPanel();
		AppointMent.setFont(new Font("Tahoma", Font.PLAIN, 15));
		AppointMent.setBackground(Color.WHITE);
		AppointMent.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		AppointMent.setBounds(396, 130, 552, 396);
		contentPane.add(AppointMent);
		AppointMent.setLayout(null);
		
		JLabel aadharNo = new JLabel("Aadhar No.");
		aadharNo.setForeground(new Color(0, 153, 102));
		aadharNo.setFont(new Font("Tahoma", Font.BOLD, 17));
		aadharNo.setBounds(49, 64, 109, 26);
		AppointMent.add(aadharNo);
		
		txtAddharNo = new JTextField();
		txtAddharNo.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtAddharNo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtAddharNo.setBounds(198, 64, 272, 26);
		AppointMent.add(txtAddharNo);
		txtAddharNo.setColumns(10);
		
		JLabel dateofApoonitment = new JLabel("Date .");
		dateofApoonitment.setForeground(new Color(0, 153, 102));
		dateofApoonitment.setFont(new Font("Tahoma", Font.BOLD, 17));
		dateofApoonitment.setBounds(49, 133, 109, 26);
		AppointMent.add(dateofApoonitment);
		
		JDateChooser scheduleDate = new JDateChooser();
		scheduleDate.setBounds(198, 139, 184, 20);
		AppointMent.add(scheduleDate);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setBackground(new Color(0, 0, 0));
		separator_1.setBounds(22, 180, 192, 12);
		AppointMent.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBackground(Color.BLACK);
		separator_1_1.setBounds(22, 323, 493, 26);
		AppointMent.add(separator_1_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(new Color(0, 0, 0));
		separator_2.setBackground(new Color(0, 0, 0));
		separator_2.setBounds(22, 180, 23, 145);
		AppointMent.add(separator_2);
		
		JSeparator separator_2_2 = new JSeparator();
		separator_2_2.setOrientation(SwingConstants.VERTICAL);
		separator_2_2.setForeground(Color.BLACK);
		separator_2_2.setBackground(Color.BLACK);
		separator_2_2.setBounds(514, 180, 23, 145);
		AppointMent.add(separator_2_2);
		
	
		
		JSeparator separator_2_3 = new JSeparator();
		separator_2_3.setForeground(Color.BLACK);
		separator_2_3.setBackground(Color.BLACK);
		separator_2_3.setBounds(160, 27, 222, 20);
		AppointMent.add(separator_2_3);
		
		JLabel schedule = new JLabel("SCHEDUAL APPOINTMENT");
		schedule.setBounds(159, 0, 242, 26);
		AppointMent.add(schedule);
		schedule.setForeground(new Color(0, 0, 204));
		schedule.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JSeparator sep1 = new JSeparator();
		sep1.setForeground(Color.BLACK);
		sep1.setBackground(Color.BLUE);
		sep1.setBounds(49, 88, 103, 20);
		AppointMent.add(sep1);
		
		JSeparator sep1_1 = new JSeparator();
		sep1_1.setForeground(Color.BLACK);
		sep1_1.setBackground(Color.BLUE);
		sep1_1.setBounds(49, 157, 57, 12);
		AppointMent.add(sep1_1);
		
		JLabel treatment = new JLabel("TREATMENT");
		treatment.setForeground(Color.BLUE);
		treatment.setFont(new Font("Tahoma", Font.BOLD, 17));
		treatment.setBounds(228, 170, 114, 26);
		AppointMent.add(treatment);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setForeground(Color.BLACK);
		separator_1_2.setBackground(Color.BLACK);
		separator_1_2.setBounds(352, 180, 163, 12);
		AppointMent.add(separator_1_2);
		
		JRadioButton rd1 = new JRadioButton("Lasik Surgery");
		rd1.setFont(new Font("Tahoma", Font.BOLD, 14));
		rd1.setBackground(Color.WHITE);
		rd1.setBounds(49, 202, 123, 23);
		btnGroup.add(rd1);
		AppointMent.add(rd1);
		
		JRadioButton rd3 = new JRadioButton("PRK");
		rd3.setFont(new Font("Tahoma", Font.BOLD, 15));
		rd3.setBackground(Color.WHITE);
		rd3.setBounds(282, 202, 109, 23);
		btnGroup.add(rd3);
		AppointMent.add(rd3);
		
		JRadioButton rd2 = new JRadioButton("Cataract Surgery");
		rd2.setFont(new Font("Tahoma", Font.BOLD, 14));
		rd2.setBackground(Color.WHITE);
		rd2.setBounds(282, 239, 151, 23);
		btnGroup.add(rd2);
		AppointMent.add(rd2);
		
		JRadioButton rd4 = new JRadioButton("Glucoma Surgery");
		rd4.setFont(new Font("Tahoma", Font.BOLD, 14));
		rd4.setBackground(Color.WHITE);
		rd4.setBounds(51, 239, 151, 23);
		btnGroup.add(rd4);
		AppointMent.add(rd4);
		
		JRadioButton rd5 = new JRadioButton("Daibatic Retionpathy surgery");
		rd5.setFont(new Font("Tahoma", Font.BOLD, 14));
		rd5.setBackground(Color.WHITE);
		rd5.setBounds(140, 283, 242, 23);
		btnGroup.add(rd5);
		AppointMent.add(rd5);
		
		JLabel req1 = new JLabel("*Required");
		req1.setVisible(false);
		req1.setForeground(Color.RED);
		req1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		req1.setBounds(408, 94, 129, 14);
		AppointMent.add(req1);
		
		JButton btnSchedule = new JButton("Schedual");
		btnSchedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean valAadharNo;
			valAadharNo=txtAddharNo.getText().equals("");
			if(valAadharNo) {
				req1.setVisible(true);
			}else {
				req1.setVisible(false);
			}
			
			if(!(valAadharNo)) {
				ArrayList<String> aList=new ArrayList<String>();
			String sDate=scheduleDate.getDate().toString();
			aList.add(username123);
			aList.add(txtAddharNo.getText());
			aList.add(sDate);
			if(rd1.isSelected()) {
				aList.add("Lasik Surgary");
			}else if(rd2.isSelected()){
				aList.add("Catract Surgary");
			}else if(rd3.isSelected()) {
				aList.add("PRK");
			}else if(rd4.isSelected()) {
				aList.add("Glucoma Surgary");
			}else {
				aList.add("Daibatic Retionpathy surgary");
			}
			InsertOperation io=new InsertOperation();
			int rows=io.insert_into_schedulInfo(aList);
			if(rows==0) {
				JOptionPane.showMessageDialog(null, " failed Try Again","Failed",JOptionPane.ERROR_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null,"Schedualed","Pass",JOptionPane.INFORMATION_MESSAGE);
				
			
			}
				
			}
				
			}
		});
		btnSchedule.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnSchedule.setBackground(new Color(0, 153, 102));
		btnSchedule.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSchedule.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSchedule.setBounds(198, 350, 151, 23);
		AppointMent.add(btnSchedule);
		
		
		
		JLabel myProfile = new JLabel("My Profile");
		myProfile.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		myProfile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DashBoard myprofileBoard=new DashBoard(username123);
				myprofileBoard.setLocationRelativeTo(null);
				myprofileBoard.setVisible(true);
				dispose();
			}
		});
		myProfile.setForeground(new Color(0, 153, 102));
		myProfile.setFont(new Font("Tahoma", Font.BOLD, 17));
		myProfile.setBounds(100, 11, 106, 31);
		panel.add(myProfile);
		
		JLabel schedualAppointment = new JLabel("Schedual Appointment");
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
		logOut.setForeground(Color.RED);
		logOut.setFont(new Font("Tahoma", Font.BOLD, 17));
		logOut.setBounds(100, 443, 106, 31);
		panel.add(logOut);
		
		viewAppointment.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewAppointment.setForeground(new Color(0, 153, 102));
		viewAppointment.setFont(new Font("Tahoma", Font.BOLD, 15));
		viewAppointment.setBounds(100, 125, 154, 31);
		panel.add(viewAppointment);
		
		
		
	}
}

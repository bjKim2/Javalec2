package com.javalec.base;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JLabel;

public class Main extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	private JTextField strNum1;
	private JTextField strNum2;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		strNum1 = new JTextField();
		strNum1.setBounds(145, 60, 130, 26);
		contentPane.add(strNum1);
		strNum1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(24, 6, 61, 16);
		contentPane.add(lblNewLabel);
		
		strNum2 = new JTextField();
		strNum2.setBounds(145, 115, 130, 26);
		contentPane.add(strNum2);
		strNum2.setColumns(10);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showMessage();
			}
		});
		btnNewButton.setBounds(141, 168, 117, 29);
		contentPane.add(btnNewButton);
	}
	public void showMessage() {
		//String str= messageName.getText();
		String str = Integer.toString(Integer.parseInt(strNum1.getText()) + Integer.parseInt(strNum2.getText()));
		JOptionPane.showMessageDialog(null, str);
	}
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}

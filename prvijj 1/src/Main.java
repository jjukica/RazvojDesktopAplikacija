import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JToolBar;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Main {

	private JFrame frmJure;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmJure.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJure = new JFrame();
		frmJure.setTitle("Prozor");
		frmJure.setBounds(100, 100, 1500, 1000);
		frmJure.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJure.getContentPane().setLayout(null);
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mental illness check box");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		chckbxNewCheckBox.setBounds(205, 11, 223, 52);
		frmJure.getContentPane().add(chckbxNewCheckBox);
		
		
		JButton btnButton = new JButton("The button");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxNewCheckBox.isSelected()) {
					return;
				}
				
				if(btnButton.getText() != "jure") {	
				btnButton.setText("jure");
				}
				else 
				{
					btnButton.setText("jukica");
				}
			}
		});
		btnButton.setForeground(Color.LIGHT_GRAY);
		btnButton.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		btnButton.setBackground(Color.BLACK);
		btnButton.setFont(new Font("Txt_IV25", Font.PLAIN, 15));
		btnButton.setActionCommand("The button");
		btnButton.setBounds(10, 11, 168, 52);
		frmJure.getContentPane().add(btnButton);
	}
}

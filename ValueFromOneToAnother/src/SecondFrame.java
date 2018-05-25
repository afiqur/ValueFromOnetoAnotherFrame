
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SecondFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JTextField textField11;
	JTextField textField22;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondFrame frame = new SecondFrame();
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
	public SecondFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField11 = new JTextField();
		textField11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField11.setColumns(10);
		textField11.setBounds(100, 53, 189, 41);
		contentPane.add(textField11);

		textField22 = new JTextField();
		textField22.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField22.setColumns(10);
		textField22.setBounds(100, 112, 189, 41);
		contentPane.add(textField22);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameOne frame = new FrameOne();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBack.setBounds(150, 183, 89, 23);
		contentPane.add(btnBack);
	}

}

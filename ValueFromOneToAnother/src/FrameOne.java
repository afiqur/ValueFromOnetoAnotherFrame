
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameOne extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JTextField textField1;
	JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameOne frame = new FrameOne();
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
	public FrameOne() {
		innitialize();
	}

	public void GetText() {
		SecondFrame f2 = new SecondFrame();

		f2.textField11.setText(this.textField1.getText());
		f2.textField22.setText(this.textField2.getText());

		f2.setVisible(true);
	}

	public void innitialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField1 = new JTextField();
		textField1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField1.setBounds(78, 48, 189, 41);
		contentPane.add(textField1);
		textField1.setColumns(10);

		textField2 = new JTextField();
		textField2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField2.setColumns(10);
		textField2.setBounds(78, 107, 189, 41);
		contentPane.add(textField2);

		JButton btnGet = new JButton("Get");
		btnGet.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				GetText();
			}
		});
		btnGet.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnGet.setBounds(124, 174, 89, 23);
		contentPane.add(btnGet);
	}
}

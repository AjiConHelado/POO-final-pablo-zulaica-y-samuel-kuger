package formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class frmadmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public frmadmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton_1 = new JButton("nanacia");
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("descuento");
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("presio");
		contentPane.add(btnNewButton);
	}

}

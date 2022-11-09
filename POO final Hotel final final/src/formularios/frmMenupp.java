package formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class frmMenupp extends JFrame {

	private JPanel contentPane;

	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public void CloseJframe(){
	    super.dispose();}
	
	public frmMenupp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnempleado = new JButton("Recepcionista");
		btnempleado.setBounds(62, 157, 141, 23);
		btnempleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					MenuRecep frame = new MenuRecep();
					frame.setVisible(true);
					 CloseJframe();
				} catch (Exception h) {
					h.printStackTrace();
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnempleado);
		
		JButton btnadmin = new JButton("Administrador");
		btnadmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frmadmin admframe = new frmadmin();
					admframe.setVisible(true);
					 CloseJframe();
				} catch (Exception h) {
					h.printStackTrace();
				}
			}
		});
		btnadmin.setBounds(238, 157, 141, 23);
		contentPane.add(btnadmin);
		
		JLabel lblNewLabel = new JLabel("SELECCIONE SU TIPO DE USUARIO");
		lblNewLabel.setBounds(132, 78, 292, 31);
		contentPane.add(lblNewLabel);
	}
}

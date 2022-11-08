package formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrecioHabi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrecioHabi frame = new PrecioHabi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void CloseJframe(){
	    super.dispose();}
	/**
	 * Create the frame.
	 */
	public PrecioHabi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("El precio de que habitacion desea cambiar?");
		lblTitulo.setBounds(109, 26, 251, 14);
		contentPane.add(lblTitulo);
		
		JButton btnSimple = new JButton("Simple");
		btnSimple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PrecioSimp admframe = new PrecioSimp();
					admframe.setVisible(true);
					 CloseJframe();
				} catch (Exception h) {
					h.printStackTrace();
				}
			}
		});
		btnSimple.setBounds(159, 85, 107, 23);
		contentPane.add(btnSimple);
		
		JButton btnDoble = new JButton("Doble");
		btnDoble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PrecioDob admframe = new PrecioDob();
					admframe.setVisible(true);
					 CloseJframe();
				} catch (Exception h) {
					h.printStackTrace();
				}
			}
		});
		btnDoble.setBounds(159, 119, 107, 23);
		contentPane.add(btnDoble);
		
		JButton btnMatrimonial = new JButton("Matrimonial");
		btnMatrimonial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PrecioMat admframe = new PrecioMat();
					admframe.setVisible(true);
					 CloseJframe();
				} catch (Exception h) {
					h.printStackTrace();
				}
			}
		});
		btnMatrimonial.setBounds(159, 153, 107, 23);
		contentPane.add(btnMatrimonial);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=JOptionPane.showConfirmDialog(null, "Seguro que quiere salir?");
	            if(i==0)
	                System.exit(0);
			}
		});
		btnSalir.setBounds(307, 211, 89, 23);
		contentPane.add(btnSalir);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
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
		btnVolver.setBounds(45, 211, 89, 23);
		contentPane.add(btnVolver);
	}
}

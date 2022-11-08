package formularios;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrecioActual extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrecioActual frame = new PrecioActual();
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
	public PrecioActual() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("El precio actual de las habitaciones es:");
		lblTitulo.setBounds(97, 11, 240, 14);
		contentPane.add(lblTitulo);
		
		JLabel lblSimple = new JLabel("Habitacion Simple:");
		lblSimple.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSimple.setBounds(39, 55, 126, 14);
		contentPane.add(lblSimple);
		
		JLabel lblDoble = new JLabel("Habitacion Doble:");
		lblDoble.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDoble.setBounds(39, 102, 126, 14);
		contentPane.add(lblDoble);
		
		JLabel lblMatrimonial = new JLabel("Habitacion Matrimonial:");
		lblMatrimonial.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMatrimonial.setBounds(39, 150, 157, 14);
		contentPane.add(lblMatrimonial);
		
		JLabel lblNewLabel = new JLabel("Simple con descuento:");
		lblNewLabel.setBounds(39, 77, 157, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Doble con descuento:");
		lblNewLabel_1.setBounds(39, 127, 157, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Matrimonial con descuento:");
		lblNewLabel_2.setBounds(39, 175, 157, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblSimp = new JLabel("");
		lblSimp.setBounds(199, 55, 111, 14);
		contentPane.add(lblSimp);
		
		JLabel lblSimpdesc = new JLabel("");
		lblSimpdesc.setBounds(199, 77, 111, 14);
		contentPane.add(lblSimpdesc);
		
		JLabel lblDob = new JLabel("");
		lblDob.setBounds(199, 102, 111, 14);
		contentPane.add(lblDob);
		
		JLabel lblDobDesc = new JLabel("");
		lblDobDesc.setBounds(199, 127, 111, 14);
		contentPane.add(lblDobDesc);
		
		JLabel lblMat = new JLabel("");
		lblMat.setBounds(199, 150, 111, 14);
		contentPane.add(lblMat);
		
		JLabel lblMatdesc = new JLabel("");
		lblMatdesc.setBounds(199, 175, 111, 14);
		contentPane.add(lblMatdesc);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					MenuRecep admframe = new MenuRecep();
					admframe.setVisible(true);
					 CloseJframe();
				} catch (Exception h) {
					h.printStackTrace();
			}
			}
		});
		btnVolver.setBounds(39, 210, 89, 23);
		contentPane.add(btnVolver);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=JOptionPane.showConfirmDialog(null, "Seguro que quiere salir?");
                if(i==0)
                    System.exit(0);
			}
		});
		btnSalir.setBounds(292, 208, 89, 23);
		contentPane.add(btnSalir);
	}

}

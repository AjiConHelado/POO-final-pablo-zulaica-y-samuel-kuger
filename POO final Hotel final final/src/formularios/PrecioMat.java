package formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Hotel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrecioMat extends JFrame {

	private JPanel contentPane;
	private JTextField textPrecio;
classes.Hotel hotel = new classes.Hotel();
classes.Matrimonial matri= new classes.Matrimonial();
JLabel lblPrecio;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrecioMat frame = new PrecioMat();
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
	public PrecioMat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Cambiar precio Habitacion Matrimonial:");
		lblTitulo.setBounds(120, 23, 223, 14);
		contentPane.add(lblTitulo);
		
		JLabel lblActual = new JLabel("El precio actual es:");
		lblActual.setBounds(51, 94, 114, 14);
		contentPane.add(lblActual);
		
		JLabel lblNuevo = new JLabel("Nuevo precio:");
		lblNuevo.setBounds(51, 137, 114, 14);
		contentPane.add(lblNuevo);
		
		textPrecio = new JTextField();
		textPrecio.setBounds(175, 134, 114, 20);
		contentPane.add(textPrecio);
		textPrecio.setColumns(10);
		
		lblPrecio = new JLabel(""+matri.MostrarPrecio());
		lblPrecio.setBounds(199, 94, 144, 14);
		contentPane.add(lblPrecio);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=JOptionPane.showConfirmDialog(null, "Seguro que quiere salir?");
	            if(i==0)
	                System.exit(0);
			}
		});
		btnSalir.setBounds(307, 210, 89, 23);
		contentPane.add(btnSalir);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PrecioHabi admframe = new PrecioHabi();
					admframe.setVisible(true);
					 CloseJframe();
				} catch (Exception h) {
					h.printStackTrace();
			}
			}
		});
		btnVolver.setBounds(39, 210, 89, 23);
		contentPane.add(btnVolver);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hotel.CambiarPrecio("matri", Integer.parseInt(textPrecio.getText()));
				lblPrecio.setText(""+matri.MostrarPrecio());
			}
		});
		btnGuardar.setBounds(175, 210, 89, 23);
		contentPane.add(btnGuardar);
	}
}



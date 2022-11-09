package formularios;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import classes.Doble;
import classes.Hotel;

public class PrecioDob extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
classes.Doble doble = new classes.Doble();
classes.Hotel hotel = new classes.Hotel();
JLabel lblPrecio;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrecioDob frame = new PrecioDob();
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
	public PrecioDob() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Cambiar precio Habitacion Doble:");
		lblTitulo.setBounds(134, 22, 223, 14);
		contentPane.add(lblTitulo);
		
		JLabel lblActual = new JLabel("El precio actual es:");
		lblActual.setBounds(51, 94, 114, 14);
		contentPane.add(lblActual);
		
		JLabel lblNuevo = new JLabel("Nuevo precio:");
		lblNuevo.setBounds(51, 137, 114, 14);
		contentPane.add(lblNuevo);
		
		lblPrecio = new JLabel(""+doble.MostrarPrecio());
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
		
		textField = new JTextField();
		textField.setBounds(175, 134, 105, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hotel.CambiarPrecio("doble", Integer.parseInt(textField.getText()));
				lblPrecio.setText(""+doble.MostrarPrecio());
			}
		});
		btnGuardar.setBounds(175, 210, 89, 23);
		contentPane.add(btnGuardar);
	}

	}



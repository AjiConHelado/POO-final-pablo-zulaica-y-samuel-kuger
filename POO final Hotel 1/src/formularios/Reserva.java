package formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;

public class Reserva extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textCedula;
	private JTextField textCantidad;
	private JTextField textHabitacion;
	private JTextField textFecha;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Reserva() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblReserva = new JLabel("Realice la reserva");
		lblReserva.setBounds(171, 11, 121, 14);
		contentPane.add(lblReserva);
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=JOptionPane.showConfirmDialog(null, "Seguro que quiere salir?");
                if(i==0)
                    System.exit(0);
			}
		});
		btnNewButton.setBounds(237, 215, 137, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(32, 45, 60, 14);
		contentPane.add(lblNombre);
		
		JLabel lblCedula = new JLabel("Cedula:");
		lblCedula.setBounds(32, 70, 46, 14);
		contentPane.add(lblCedula);
		
		JLabel lblDias = new JLabel("Numero dias:");
		lblDias.setBounds(32, 95, 97, 14);
		contentPane.add(lblDias);
		
		JLabel lblHabitacion = new JLabel("Habitacion:");
		lblHabitacion.setBounds(32, 120, 77, 14);
		contentPane.add(lblHabitacion);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(32, 170, 54, 14);
		contentPane.add(lblPrecio);
		
		JLabel lblFecha = new JLabel("Fecha reserva");
		lblFecha.setBounds(32, 145, 107, 14);
		contentPane.add(lblFecha);
		
		JButton btnNewButton_1 = new JButton("Generar reserva");
		btnNewButton_1.setBounds(64, 215, 137, 23);
		contentPane.add(btnNewButton_1);
		
		textNombre = new JTextField();
		textNombre.setBounds(181, 42, 137, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textCedula = new JTextField();
		textCedula.setBounds(181, 67, 137, 20);
		contentPane.add(textCedula);
		textCedula.setColumns(10);
		
		textCantidad = new JTextField();
		textCantidad.setBounds(181, 92, 137, 20);
		contentPane.add(textCantidad);
		textCantidad.setColumns(10);
		
		textHabitacion = new JTextField();
		textHabitacion.setBounds(181, 117, 137, 20);
		contentPane.add(textHabitacion);
		textHabitacion.setColumns(10);
		
		textFecha = new JTextField();
		textFecha.setBounds(181, 142, 137, 20);
		contentPane.add(textFecha);
		textFecha.setColumns(10);
		
		JLabel lblPrecioo = new JLabel("");
		lblPrecioo.setBounds(181, 170, 137, 14);
		contentPane.add(lblPrecioo);
		
		JButton btnNewButton_2 = new JButton("recibo");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPrecioo.setText("abdul");
			}
		});
		btnNewButton_2.setBounds(328, 181, 89, 23);
		contentPane.add(btnNewButton_2);
		
	
	}
}
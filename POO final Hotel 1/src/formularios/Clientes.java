package formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Clientes extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textCedula;
	private JTextField textCorreo;
	private JTextField textDirec;
	private JTextField textCumple;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Clientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(72, 208, 89, 23);
		contentPane.add(btnGuardar);
		
		textNombre = new JTextField();
		textNombre.setBounds(230, 58, 120, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Ingrese el nombre:");
		lblNombre.setBounds(42, 61, 154, 14);
		contentPane.add(lblNombre);
		
		JLabel lblIngreseLaCedula = new JLabel("Ingrese la cedula:");
		lblIngreseLaCedula.setBounds(42, 86, 154, 14);
		contentPane.add(lblIngreseLaCedula);
		
		textCedula = new JTextField();
		textCedula.setColumns(10);
		textCedula.setBounds(230, 83, 120, 20);
		contentPane.add(textCedula);
		
		JLabel lblDireccion = new JLabel("Ingrese la Direccion:");
		lblDireccion.setBounds(42, 111, 154, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblEmail = new JLabel("Ingrese el correo:");
		lblEmail.setBounds(42, 136, 154, 14);
		contentPane.add(lblEmail);
		
		JLabel lblNacimiento = new JLabel("Ingrese la fecha de nacimiento:");
		lblNacimiento.setBounds(42, 161, 221, 14);
		contentPane.add(lblNacimiento);
		
		textCorreo = new JTextField();
		textCorreo.setColumns(10);
		textCorreo.setBounds(230, 133, 120, 20);
		contentPane.add(textCorreo);
		
		textDirec = new JTextField();
		textDirec.setColumns(10);
		textDirec.setBounds(230, 108, 120, 20);
		contentPane.add(textDirec);
		
		textCumple = new JTextField();
		textCumple.setColumns(10);
		textCumple.setBounds(230, 158, 120, 20);
		contentPane.add(textCumple);
		
		JLabel lblNewLabel = new JLabel("Ingrese los datos del cliente");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(122, 21, 187, 14);
		contentPane.add(lblNewLabel);
	}
}
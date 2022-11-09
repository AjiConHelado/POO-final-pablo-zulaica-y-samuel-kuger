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

import classes.Hotel;

public class EliminReserv extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	classes.Hotel hotel = new classes.Hotel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EliminReserv frame = new EliminReserv();
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
	public EliminReserv() {
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
		
		JLabel lblFecha = new JLabel("Fecha reserva");
		lblFecha.setBounds(42, 111, 107, 14);
		contentPane.add(lblFecha);
		
		JButton btnNewButton_1 = new JButton("Eliminar reserva");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hotel.llamadoeliminar(textField.getText(), Integer.parseInt(textField_2.getText()));
			}
		});
		btnNewButton_1.setBounds(147, 150, 137, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNombre = new JLabel("Ingrese el nombre:");
		lblNombre.setBounds(42, 61, 154, 14);
		contentPane.add(lblNombre);
		
		JLabel lblIngreseLaCedula = new JLabel("Ingrese la cedula:");
		lblIngreseLaCedula.setBounds(42, 86, 154, 14);
		contentPane.add(lblIngreseLaCedula);
		
		JLabel lblEliminar = new JLabel("Eliminar reservas");
		lblEliminar.setBounds(172, 11, 119, 14);
		contentPane.add(lblEliminar);
		
		textField = new JTextField();
		textField.setBounds(172, 58, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(172, 83, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(172, 108, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
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

		
	}

}

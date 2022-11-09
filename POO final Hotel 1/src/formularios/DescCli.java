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

public class DescCli extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
classes.Hotel hotel = new classes.Hotel();
String descuento;
JLabel lblDescuentoo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DescCli frame = new DescCli();
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
	public DescCli() {
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
		btnSalir.setBounds(306, 208, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblFecha = new JLabel("Su descuento es:");
		lblFecha.setBounds(42, 111, 107, 14);
		contentPane.add(lblFecha);
		
		JButton btnConsultar = new JButton("Consultar descuento");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 descuento=hotel.DescClienteHab(textField.getText(), Integer.parseInt(textField_1.getText()));
				 lblDescuentoo.setText(descuento);
			}
		});
		btnConsultar.setBounds(137, 176, 163, 23);
		contentPane.add(btnConsultar);
		
		JLabel lblNombre = new JLabel("Ingrese el nombre:");
		lblNombre.setBounds(42, 61, 154, 14);
		contentPane.add(lblNombre);
		
		JLabel lblIngreseLaCedula = new JLabel("Ingrese la cedula:");
		lblIngreseLaCedula.setBounds(42, 86, 154, 14);
		contentPane.add(lblIngreseLaCedula);
		
		JLabel lblTitulo = new JLabel("Consultar Descuento");
		lblTitulo.setBounds(172, 11, 119, 14);
		contentPane.add(lblTitulo);
		
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
		btnVolver.setBounds(42, 208, 89, 23);
		contentPane.add(btnVolver);
		
		lblDescuentoo = new JLabel("");
		lblDescuentoo.setBounds(172, 111, 109, 14);
		contentPane.add(lblDescuentoo);
		
		textField = new JTextField();
		textField.setBounds(172, 58, 119, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(172, 83, 119, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		

		
	}

}
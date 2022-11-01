package formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuRecep extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void CloseJframe(){
	    super.dispose();}
	

	/**
	 * Create the frame.
	 */
	public MenuRecep() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Que desea hacer?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(166, 11, 120, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnVer = new JButton("Ver habitaciones");
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVer.setBounds(36, 103, 173, 23);
		contentPane.add(btnVer);
		
		JButton btnPrecioHabitaciones = new JButton("Consultar precio habitaciones");
		btnPrecioHabitaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPrecioHabitaciones.setBounds(36, 137, 173, 23);
		contentPane.add(btnPrecioHabitaciones);
		
		JButton btnPrecioTotal = new JButton("Consultar precio total ");
		btnPrecioTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPrecioTotal.setBounds(36, 171, 173, 23);
		contentPane.add(btnPrecioTotal);
		
		JButton btnMostrarF = new JButton("Mostrar foto Habitacion");
		btnMostrarF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMostrarF.setBounds(36, 205, 173, 23);
		contentPane.add(btnMostrarF);
		
		JButton btnConsulta = new JButton("Consultar descuento cliente");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConsulta.setBounds(227, 103, 173, 23);
		contentPane.add(btnConsulta);
		
		JButton btnReserva = new JButton("Reserva habitacion");
		btnReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reserva frame = new Reserva();
				frame.setVisible(true);
				CloseJframe();
			}
		});
		btnReserva.setBounds(227, 137, 173, 23);
		contentPane.add(btnReserva);
		
		JButton btnEliminar = new JButton("Eliminar reserva");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.setBounds(227, 171, 173, 23);
		contentPane.add(btnEliminar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=JOptionPane.showConfirmDialog(null, "Seguro que quiere salir?");
                if(i==0)
                    System.exit(0);
			}
		});
		btnSalir.setBounds(227, 205, 173, 23);
		contentPane.add(btnSalir);
		
		JButton btnRegristro = new JButton("Registrar cliente");
		btnRegristro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clientes frame = new Clientes();
				frame.setVisible(true);
				CloseJframe();
			}
		});
		btnRegristro.setBounds(130, 69, 173, 23);
		contentPane.add(btnRegristro);
	}

}
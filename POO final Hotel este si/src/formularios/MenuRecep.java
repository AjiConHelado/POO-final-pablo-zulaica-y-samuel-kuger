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
				try {
					HabDisp admframe = new HabDisp();
					admframe.setVisible(true);
					 CloseJframe();
				} catch (Exception h) {
					h.printStackTrace();
			}
			}
		});
		btnVer.setBounds(36, 103, 173, 23);
		contentPane.add(btnVer);
		
		JButton btnPrecioHabitaciones = new JButton("Precio habitaciones");
		btnPrecioHabitaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PrecioActual admframe = new PrecioActual();
					admframe.setVisible(true);
					 CloseJframe();
				} catch (Exception h) {
					h.printStackTrace();
			}
			}
		});
		btnPrecioHabitaciones.setBounds(36, 137, 173, 23);
		contentPane.add(btnPrecioHabitaciones);
		
		JButton btnPrecioTotal = new JButton("Consultar precio total ");
		btnPrecioTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PrecioTotal admframe = new PrecioTotal();
					admframe.setVisible(true);
					 CloseJframe();
				} catch (Exception h) {
					h.printStackTrace();
			}
			}
		});
		btnPrecioTotal.setBounds(36, 171, 173, 23);
		contentPane.add(btnPrecioTotal);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frmMenupp admframe = new frmMenupp();
					admframe.setVisible(true);
					 CloseJframe();
				} catch (Exception h) {
					h.printStackTrace();
			}
			}
		});
		btnVolver.setBounds(36, 205, 173, 23);
		contentPane.add(btnVolver);
		
		JButton btnConsulta = new JButton("Consultar descuento");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DescCli admframe = new DescCli();
					admframe.setVisible(true);
					 CloseJframe();
				} catch (Exception h) {
					h.printStackTrace();
			}
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
				try {
					EliminReserv admframe = new EliminReserv();
					admframe.setVisible(true);
					 CloseJframe();
				} catch (Exception h) {
					h.printStackTrace();
				}
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
		
		JButton btnConsultar = new JButton("Registrar cliente");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clientes frame = new Clientes();
				frame.setVisible(true);
				CloseJframe();
			}
		});
		
		btnConsultar.setBounds(227, 69, 173, 23);
		contentPane.add(btnConsultar);
		
		JButton btnMostrar = new JButton("Mostrar Fotos");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { 
					MenuFotos admframe = new MenuFotos();
					admframe.setVisible(true);
					CloseJframe();
				} catch (Exception h) {
					h.printStackTrace();					
				}
			}
		});
		btnMostrar.setBounds(36, 69, 173, 23);
		contentPane.add(btnMostrar);
	}

}
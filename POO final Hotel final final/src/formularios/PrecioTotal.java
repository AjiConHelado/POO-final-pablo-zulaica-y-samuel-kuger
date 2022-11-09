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

public class PrecioTotal extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textId;
	private JTextField textDura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrecioTotal frame = new PrecioTotal();
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
	public PrecioTotal() {
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
		btnSalir.setBounds(304, 210, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblFecha = new JLabel("Duracion reserva:");
		lblFecha.setBounds(42, 111, 107, 14);
		contentPane.add(lblFecha);
		
		JButton btnCalcular = new JButton("Calcular precio");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalcular.setBounds(146, 175, 137, 23);
		contentPane.add(btnCalcular);
		
		JLabel lblNombre = new JLabel("Ingrese el nombre:");
		lblNombre.setBounds(42, 61, 154, 14);
		contentPane.add(lblNombre);
		
		JLabel lblIngreseLaCedula = new JLabel("Ingrese la cedula:");
		lblIngreseLaCedula.setBounds(42, 86, 154, 14);
		contentPane.add(lblIngreseLaCedula);
		
		JLabel lblEliminar = new JLabel("Consultar precio");
		lblEliminar.setBounds(172, 11, 119, 14);
		contentPane.add(lblEliminar);
		
	
		
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
		
		JLabel lblCalculo = new JLabel("El precio total es:");
		lblCalculo.setBounds(42, 136, 107, 14);
		contentPane.add(lblCalculo);
		
		JLabel lblPrecio = new JLabel("");
		lblPrecio.setBounds(159, 136, 119, 14);
		contentPane.add(lblPrecio);
		
		textName = new JTextField();
		textName.setBounds(159, 58, 119, 20);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textId = new JTextField();
		textId.setBounds(159, 83, 119, 20);
		contentPane.add(textId);
		textId.setColumns(10);
		
		textDura = new JTextField();
		textDura.setBounds(159, 108, 119, 20);
		contentPane.add(textDura);
		textDura.setColumns(10);

		
	}

}
package formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CambiarDesc extends JFrame {

	private JPanel contentPane;
	private JTextField textNuevoD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CambiarDesc frame = new CambiarDesc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CambiarDesc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDesc = new JLabel("Cambio de descuento");
		lblDesc.setBounds(161, 11, 110, 14);
		contentPane.add(lblDesc);
		
		JLabel lblActual = new JLabel("El descuento actual es:");
		lblActual.setBounds(32, 92, 130, 14);
		contentPane.add(lblActual);
		
		JLabel lblPorcentaje = new JLabel("");
		lblPorcentaje.setBounds(172, 92, 87, 14);
		contentPane.add(lblPorcentaje);
		
		JLabel lblNuevo = new JLabel("El nuevo descuento sera:");
		lblNuevo.setBounds(32, 131, 130, 14);
		contentPane.add(lblNuevo);
		
		textNuevoD = new JTextField();
		textNuevoD.setBounds(172, 128, 86, 20);
		contentPane.add(textNuevoD);
		textNuevoD.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(73, 206, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(267, 206, 89, 23);
		contentPane.add(btnSalir);
	}
}

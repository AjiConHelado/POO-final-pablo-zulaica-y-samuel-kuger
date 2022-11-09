package formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.cHabitual;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CambiarDesc extends JFrame {

	private JPanel contentPane;
	private JTextField textNuevoD;
classes.Hotel hotel =new classes.Hotel();


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
	public void CloseJframe(){
	    super.dispose();}
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
		lblDesc.setBounds(147, 11, 146, 14);
		contentPane.add(lblDesc);
		
		JLabel lblActual = new JLabel("El descuento actual es:");
		lblActual.setBounds(32, 92, 179, 14);
		contentPane.add(lblActual);
		
		JLabel lblPorcentaje = new JLabel(""+(1-cHabitual.descuento));
		lblPorcentaje.setBounds(220, 92, 87, 14);
		
		contentPane.add(lblPorcentaje);
		
		JLabel lblNuevo = new JLabel("El nuevo descuento sera:");
		lblNuevo.setBounds(32, 131, 179, 14);
		contentPane.add(lblNuevo);
		
		textNuevoD = new JTextField();
		textNuevoD.setBounds(221, 128, 86, 20);
		contentPane.add(textNuevoD);
		textNuevoD.setColumns(10);
		
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
					frmadmin admframe = new frmadmin();
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
				
				hotel.CambiarDesc(Float.parseFloat(textNuevoD.getText()));
				
				lblPorcentaje.setText(""+(1-cHabitual.descuento));
			}
		});
		btnGuardar.setBounds(175, 210, 89, 23);
		contentPane.add(btnGuardar);
	}
}

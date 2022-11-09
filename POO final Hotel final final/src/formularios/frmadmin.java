package formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmadmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmadmin frame = new frmadmin();
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
	public frmadmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWc = new JLabel("Bienvenido al menu de administradores");
		lblWc.setBounds(119, 11, 230, 14);
		contentPane.add(lblWc);
		
		JLabel lblQuedesea = new JLabel("Que desea hacer?");
		lblQuedesea.setBounds(164, 36, 112, 14);
		contentPane.add(lblQuedesea);
		
		JButton btnCambiardesc = new JButton("Cambiar Descuento");
		btnCambiardesc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					CambiarDesc frame = new CambiarDesc();
					frame.setVisible(true);
					 CloseJframe();
				} catch (Exception h) {
					h.printStackTrace();
				}
			}
		});
		btnCambiardesc.setBounds(119, 80, 170, 23);
		contentPane.add(btnCambiardesc);
		
		JButton btnPrecio = new JButton("Cambiar precios");
		btnPrecio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PrecioHabi frame = new PrecioHabi();
					frame.setVisible(true);
					 CloseJframe();
				} catch (Exception h) {
					h.printStackTrace();
				}
			}
		});
		btnPrecio.setBounds(119, 118, 170, 23);
		contentPane.add(btnPrecio);
		
		JButton btnGanancia = new JButton("Revisar Ganancias");
		btnGanancia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Ganancias frame = new Ganancias();
					frame.setVisible(true);
					 CloseJframe();
				} catch (Exception h) {
					h.printStackTrace();
				}
			}
		});
		btnGanancia.setBounds(119, 157, 170, 23);
		contentPane.add(btnGanancia);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				int i=JOptionPane.showConfirmDialog(null, "Seguro que quiere salir?");
            if(i==0)
                System.exit(0);
			}
		});
		btnNewButton_2.setBounds(310, 214, 89, 23);
		contentPane.add(btnNewButton_2);
		
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
		btnVolver.setBounds(39, 210, 89, 23);
		contentPane.add(btnVolver);
	}

}

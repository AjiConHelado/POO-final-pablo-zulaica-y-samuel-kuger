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

public class MenuFotos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuFotos frame = new MenuFotos();
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
	public MenuFotos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Seleccione una habitacion");
		lblTitulo.setBounds(135, 11, 158, 14);
		contentPane.add(lblTitulo);
		
		JButton btnSimple = new JButton("Simple");
		btnSimple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FotoSimp admframe = new FotoSimp();
					admframe.setVisible(true);
					 CloseJframe();
				} catch (Exception h) {
					h.printStackTrace();
			}
			}
		});
		btnSimple.setBounds(145, 86, 138, 23);
		contentPane.add(btnSimple);
		
		JButton btnDoble = new JButton("Doble");
		btnDoble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FotoDob admframe = new FotoDob();
					admframe.setVisible(true);
					 CloseJframe();
				} catch (Exception h) {
					h.printStackTrace();
			}
			}
		});
		btnDoble.setBounds(145, 120, 138, 23);
		contentPane.add(btnDoble);
		
		JButton btnMatrimonial = new JButton("Matrimonial");
		btnMatrimonial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FotoMat admframe = new FotoMat();
					admframe.setVisible(true);
					 CloseJframe();
				} catch (Exception h) {
					h.printStackTrace();
			}
			}
		});
		btnMatrimonial.setBounds(145, 154, 138, 23);
		contentPane.add(btnMatrimonial);
		
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
	}

}

package formularios;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class HabDisp extends JFrame {
classes.Hotel hotel=new classes.Hotel();
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HabDisp frame = new HabDisp();
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
	public HabDisp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Habitaciones disponibles");
		lblTitulo.setBounds(144, 11, 163, 14);
		contentPane.add(lblTitulo);
		
		JLabel lblSimps = new JLabel("Simples disponibles:");
		lblSimps.setBounds(42, 60, 148, 14);
		contentPane.add(lblSimps);
		
		JLabel lblDobs = new JLabel("Dobles disponibles:");
		lblDobs.setBounds(42, 95, 148, 14);
		contentPane.add(lblDobs);
		
		JLabel lblMats = new JLabel("Matrimoniales disponibles:");
		lblMats.setBounds(42, 131, 163, 14);
		contentPane.add(lblMats);
		
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
		
		JLabel lblDispsS = new JLabel(""+hotel.HabDispo());
		lblDispsS.setBounds(200, 60, 83, 14);
		contentPane.add(lblDispsS);
		
		JLabel lblDispD = new JLabel(""+hotel.HabDispodobles());
		lblDispD.setBounds(200, 95, 83, 14);
		contentPane.add(lblDispD);
		
		JLabel lblDispM = new JLabel(""+hotel.HabDispomatri());
		lblDispM.setBounds(200, 131, 83, 14);
		contentPane.add(lblDispM);
	}

}

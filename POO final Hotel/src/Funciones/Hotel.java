import java.awt.EventQueue;

import formularios.frmMenupp;

public class Hotel {
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMenupp cliframe = new frmMenupp();
					cliframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void HabDispo()
	{
		
	}
	 
	public void DescClienteHab()
	{
		
	}
	
	//admin
	public void CambiarPrecio()
	{
		
	}
	
	public void CambiarDesc()
	{
		
	}
	
	public void CalcularGanancia()
	{
		
	}
}
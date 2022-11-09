import java.awt.EventQueue;

import formularios.frmMenupp;

public class Hotel {
	
	cHabitual jairo;
	Simple hsimple;
	Doble hdoble;
	Matrimonial hmatri;
	Doble[] L_doble;
	Simple[] L_simple;
	Matrimonial[] L_matri;
	Reservacion[]L_reserva;
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
	
	public String[] HabDispo()
	{
		int i =0;
		String[] habitacionesdisp= new String[20];
		
		for(Simple simple: L_simple)
		{
			if(simple.ocupada==false)
			{
				habitacionesdisp[i]=simple.NumHabitacion;
				i=i+1;
			}
		}
		for(Doble doble: L_doble)
		{
			if(doble.ocupada==false)
			{
				habitacionesdisp[i]=doble.NumHabitacion;
				i=i+1;
			}
		}
		 
		for(Matrimonial matri: L_matri)
		{
			if(matri.ocupada==false)
			{
				habitacionesdisp[i]=matri.NumHabitacion;
				i=i+1;
			}
		}
		
		 return  habitacionesdisp;
	}
	 
	public void DescClienteHab(int cambio)
	{
		 
		jairo.descuento = cambio;
	}
	
	//admin
	public void CambiarPrecio(String tipo,int cambio)
	{
		switch(tipo) {
		case "simple":
		{
			hsimple.precio=cambio;
		}
		case "doble":
		{
			hdoble.precio=cambio;
		}
		case "matrimonial":
		{
			hmatri.precio=cambio;
		}
		
	}
	}
	
	
	public void CambiarDesc()
	{
		//watafoq nada tiene descripcion
	}
	
	public void CalcularGanancia()
	{
		float ganancia = 0;
		for(Reservacion reserva:L_reserva)
		{
			ganancia=ganancia+reserva.precioreserva;
		}
			
	}
}
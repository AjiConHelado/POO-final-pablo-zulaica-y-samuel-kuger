package classes;
import java.awt.EventQueue;

import formularios.Reserva;
import formularios.frmMenupp;

public class Hotel {
	
int num=-1;

	//Simple hsimple;
	//Doble hdoble;
	//Matrimonial hmatri;
	static String[][] datacliente= new String[5][4]; 
	static String[][] datahabitaciones= new String[15][4]; 
	static String[][] datareserva= new String[10][4]; 
	 static Doble[] L_doble = new Doble[5];
	 static Simple[] L_simple = new Simple[5];
	static Matrimonial[] L_matri= new Matrimonial[5];
	static Reservacion[]L_reserva= new Reservacion[10];
	static cHabitual[] Lcliente= new cHabitual[5];
	
	public static void main(String[] args) {
		
		Simple simple1 = new Simple();	
		Simple simple2 = new Simple();
		Simple simple3 = new Simple();
		Simple simple4 = new Simple();
		Simple simple5 = new Simple();
		
		Doble doble1 = new Doble();
		Doble doble2 = new Doble();
		Doble doble3 = new Doble();
		Doble doble4 = new Doble();
		Doble doble5 = new Doble();
		
		Matrimonial matri1 = new Matrimonial();
		Matrimonial matri2 = new Matrimonial();
		Matrimonial matri3 = new Matrimonial();
		Matrimonial matri4 = new Matrimonial();
		Matrimonial matri5 = new Matrimonial();
		
		cHabitual cliente1 = new cHabitual();
		cHabitual cliente2 = new cHabitual();
		cHabitual cliente3 = new cHabitual();
		cHabitual cliente4 = new cHabitual();
		cHabitual cliente5 = new cHabitual();
		
		Reservacion rese1= new Reservacion();
		Reservacion rese2= new Reservacion();
		Reservacion rese3= new Reservacion();
		Reservacion rese4= new Reservacion();
		Reservacion rese5= new Reservacion();
		Reservacion rese6= new Reservacion();
		Reservacion rese7= new Reservacion();
		Reservacion rese8= new Reservacion();
		Reservacion rese9= new Reservacion();
		Reservacion rese10= new Reservacion();
		
		Lcliente[0]=cliente1;
		Lcliente[0].nombre="1";
		Lcliente[0].cedula=1;
		Lcliente[1]=cliente2;
		Lcliente[2]=cliente3;
		Lcliente[3]=cliente4;
		Lcliente[4]=cliente5;
		
		L_simple[0]= simple1;
		L_simple[1]= simple2;
		L_simple[2]= simple3;
		L_simple[3]= simple4;
		L_simple[4]= simple5;
		
		L_doble[0]=doble1;
		L_doble[1]=doble2;
		L_doble[2]=doble3;
		L_doble[3]=doble4;
		L_doble[4]=doble5;
		
		L_matri[0]=matri1;
		L_matri[1]=matri2;
		L_matri[2]=matri3;
		L_matri[3]=matri4;
		L_matri[4]=matri5;
		
		L_reserva[0]=rese1;
		L_reserva[1]=rese2;
		L_reserva[2]=rese3;
		L_reserva[3]=rese4;
		L_reserva[4]=rese5;
		L_reserva[5]=rese6;
		L_reserva[6]=rese7;
		L_reserva[7]=rese8;
		L_reserva[8]=rese9;
		L_reserva[9]=rese10;
		
		
		for(int j=0;j<L_simple.length;j++)
		{
			L_simple[j].NumHabitacion="s"+(j+1);
		}
		
		for(int j=0;j<L_doble.length;j++)
		{
			L_doble[j].NumHabitacion="d"+(j+1);
		}
		
		for(int j=0;j<L_matri.length;j++)
		{
			L_matri[j].NumHabitacion="m"+(j+1);
		}
		
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
	
	public String HabDispo()
	{
		String habitaciones="";
		int i =0;
		
		//if(L_simple!=null)
		
		for(int j=0;j<L_simple.length;j++)
		{
			if(L_simple[j].ocupada==false)
			{
				habitaciones=habitaciones+L_simple[j].NumHabitacion+",";
				i=i+1;
			}
		}
		actualizardata();
		 return  habitaciones;
		 
	}
	public String HabDispodobles()
	{
		String habitaciones="";
		int i =0;
		
		//if(L_simple!=null)
		
		for(int j=0;j<L_simple.length;j++)
		{
			if(L_doble[j].ocupada==false)
			{
				habitaciones=habitaciones+L_doble[j].NumHabitacion+",";
				i=i+1;
			}
		}
		actualizardata();
		 return  habitaciones;
		 
	}
	public String HabDispomatri()
	{
		String habitaciones="";
		int i =0;
		
		//if(L_simple!=null)
		
		for(int j=0;j<L_simple.length;j++)
		{
			if(L_simple[j].ocupada==false)
			{
				habitaciones=habitaciones+L_simple[j].NumHabitacion+",";
				i=i+1;
			}
		}
		actualizardata();
		
		 return  habitaciones;
		 
	}
	 
	public String DescClienteHab(String nombre, int cedula)
	{
		String respuesta="0";
		for(int i =0;i<Lcliente.length;i++)
		{
			if(Lcliente[i].ishabitual==true &&(Lcliente[i].cedula==cedula||Lcliente[i].nombre==nombre))// si una persona no usa el nombre correcto tambien le da respuesta si encuentra la cedula, no es optimo pero me parece mejor a que verifique con ambasj ahi si uno se equivoca en alguna de las 2 no le hace nada
			{
				respuesta=""+cHabitual.descuento;
				actualizardata();
				return respuesta;
			}
					
		}
		 System.out.println(respuesta);
		 actualizardata();
		return respuesta;
	}
	
	//admin
	public void CambiarPrecio(String tipo,int cambio)
	{
		switch(tipo) {
		case "simple":
		{
			Simple.precio=cambio;
		}
		case "doble":
		{
			Doble.precio=cambio;
		}
		case "matrimonial":
		{
			Matrimonial.precio=cambio;
		}
		actualizardata();
	}
	}
	
	
	public void CambiarDesc(float cambio)
	{
		float descuento;
		descuento =1-cambio;
		cHabitual.descuento=descuento;
	}
	
	public String CalcularGanancia()
	{
		float ganancia = 0;
		for(int i=0;i<L_reserva.length;i++)
		{
			ganancia=ganancia+L_reserva[i].precioreserva;
		}
		String jairo=""+ganancia;
		actualizardata();
			return jairo;
	}

public void llamadocliente(String nombre, int cedula,String mail, int nacimiento,String direccion)
{
    for(int i =0;i<Lcliente.length;i++)
    {
    	if(Lcliente[i].nombre=="")
    	{
    		Lcliente[i].registrocliente(nombre, cedula, mail, nacimiento, direccion);
    		
    		break;
    	}
    }
    actualizardata();
}
public String llamadoReserva(int numdias,int fecha,String nombre,int cedula,String tipo)
{
	String cobro="";
	
	
	
	
	for(int k =0;k<L_reserva.length;k++)
	{
		
		if(L_reserva[k].Cliente=="") 
		{
			//rese=L_reserva[k];
			for(int i=0;i<Lcliente.length;i++)
			{
				
				if(Lcliente[i].nombre==nombre || Lcliente[i].cedula==cedula)
				{
					
					switch(tipo)
					{
					case "simple":
						for(int j=0;j<L_simple.length;j++)
						{
							System.out.println("adentro");
							if(L_simple[j].ocupada==false)
							{
								cobro=L_reserva[k].Reservar(L_simple[j], numdias, fecha, Lcliente[i]);
								
								break;
							}
						
						}
						break;
						
					case"doble":
						for(int j=0;j<L_doble.length;j++)
						{
							if(L_doble[j].ocupada==false)
							{
								cobro=L_reserva[k].Reservar(L_doble[j], numdias, fecha, Lcliente[i]);
								break;
							}
						}
						break;
					case"matri"	:
						for(int j=0;j<L_matri.length;j++)
						{
							if(L_matri[j].ocupada==false)
							{
								cobro=L_reserva[k].Reservar(L_matri[j], numdias, fecha, Lcliente[i]);
								break;
							}
						}
					 break;
					}
					break;
				}
				System.out.println(nombre);
				System.out.println(Lcliente[i].nombre);
			}
			
			break;
		}
	}
	

	
	actualizardata();
	return(cobro);
}

public void llamadoeliminar(String nombre, int fechainicio)
{
	for(int i =0;i<L_reserva.length;i++)
	{
		if(L_reserva[i].Cliente==nombre || L_reserva[i].FechaInicio==fechainicio) 
		{
			L_reserva[i].Eliminar();
		}
	}
	actualizardata();
}

public void actualizardata()
{
	int k=0;
	for(int i=0;i< Lcliente.length;i++)
	{
		datacliente[i][0]=""+Lcliente[i].cedula;
		datacliente[i][1]=""+Lcliente[i].nombre;
		datacliente[i][2]=""+Lcliente[i].email;
		datacliente[i][3]=""+Lcliente[i].fechaNacimiento;
	}
	for(int i=0;i<L_simple.length;i++)
	{
		datahabitaciones[k][0]=L_simple[i].NumHabitacion;
		datahabitaciones[k][1]="simple";
		datahabitaciones[k][2]=""+Simple.precio;
		datahabitaciones[k][4]=""+cHabitual.descuento;//pur que esta dedscuento en las habitaciones???
		k=k+1;
		
	}
	for(int i=0;i<L_doble.length;i++)
	{
		datahabitaciones[k][0]=L_doble[i].NumHabitacion;
		datahabitaciones[k][1]="simple";
		datahabitaciones[k][2]=""+Simple.precio;
		datahabitaciones[k][4]=""+cHabitual.descuento;//pur que esta dedscuento en las habitaciones???
		k=k+1;
		
	}
	for(int i=0;i<L_matri.length;i++)
	{
		datahabitaciones[k][0]=L_matri[i].NumHabitacion;
		datahabitaciones[k][1]="simple";
		datahabitaciones[k][2]=""+Simple.precio;
		datahabitaciones[k][4]=""+cHabitual.descuento;//pur que esta dedscuento en las habitaciones???
		k=k+1;
		
	}
	for(int i=0;i<L_reserva.length;i++)
	{
		datahabitaciones[i][0]=L_reserva[i].Cliente;
		datahabitaciones[i][1]=L_reserva[i].numHabitacion;
		datahabitaciones[i][2]=""+L_reserva[i].FechaInicio;
		datahabitaciones[i][4]=""+L_reserva[i].CantidadDias;//pur que esta dedscuento en las habitaciones???
		k=k+1;
		
	}
	
	
}
}






public class Reservacion  {

		int FechaInicio;
		int CantidadDias;
		String Cliente;
		String numHabitacion;
		float precioreserva;
		
		public void Reservar(Simple simple,int numDias, int fecha, cHabitual persona )
		{
		 FechaInicio =fecha;
		 Cliente=persona.nombre;
		 CantidadDias=numDias;
		 precioreserva= (CantidadDias* simple.precio)*persona.descuento;
		 simple.ocupada=true;
		 numHabitacion = simple.NumHabitacion;
		 System.out.println("su cobro es de :"+precioreserva);
		 
		}
		
		public void Reservar(Matrimonial matri, int numDias, int fecha, cHabitual persona )
		{
			 FechaInicio =fecha;
			 Cliente =persona.nombre;
			 CantidadDias=numDias;
			 precioreserva=  (CantidadDias* matri.precio)*persona.descuento;
			 matri.ocupada=true;
			 numHabitacion = matri.NumHabitacion;
			 System.out.println("su cobro es de :"+precioreserva);
		}
		public void Reservar(Doble doble,int numDias, int fecha, cHabitual persona )
		{
			 FechaInicio =fecha;
			 Cliente= persona.nombre;
			 CantidadDias=numDias;
			 precioreserva= (CantidadDias* doble.precio)*persona.descuento;
			 doble.ocupada=true;
			 numHabitacion = doble.NumHabitacion;
			 System.out.println("su cobro es de :"+precioreserva);
			
		}
		
		
		
		
		
		
		public void Eliminar()
		{
			 FechaInicio=0;
			 Cliente=null;
			 CantidadDias=0;
			 precioreserva=0;
			
			 numHabitacion=null;
		}
	
		public void Imprimir()
		{
			 System.out.println("habitacion a nombre de :"+Cliente);
			 System.out.println("reserva hecha el :"+FechaInicio);
			 System.out.println("numero de habitacion :"+numHabitacion);
			 System.out.println("reservado por :"+CantidadDias+" dias");
			 System.out.println("su cobro es de :"+precioreserva);
		}
}

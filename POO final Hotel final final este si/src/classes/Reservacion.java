package classes;

public class Reservacion  {

		int FechaInicio=0;
		int CantidadDias=0;
		String Cliente="";
		String numHabitacion="";
		float precioreserva=0;
		
		
		public String Reservar(Simple simple,int numDias, int fecha, cHabitual persona )
		{
		 FechaInicio =fecha;
		 Cliente=persona.nombre;
		 CantidadDias=numDias;
		 if(persona.ishabitual==true)
		 {
		 precioreserva=  (CantidadDias* Simple.precio)*cHabitual.descuento;
		 }
		 else
		 {
			 precioreserva=  (CantidadDias* Simple.precio);
			 persona.ishabitual=true;
		 }
		 simple.ocupada=true;
		 numHabitacion = simple.NumHabitacion;
		 return("su cobro es de :"+precioreserva);
		 
		}
		
		public String Reservar(Matrimonial matri, int numDias, int fecha, cHabitual persona )
		{
			 FechaInicio =fecha;
			 Cliente =persona.nombre;
			 CantidadDias=numDias;
			 if(persona.ishabitual==true)
			 {
			 precioreserva=  (CantidadDias* Matrimonial.precio)*cHabitual.descuento;
			 }
			 else
			 {
				 precioreserva=  (CantidadDias* Matrimonial.precio); 
				 persona.ishabitual=true;
			 }
			 matri.ocupada=true;
			 numHabitacion = matri.NumHabitacion;
			 return ("su cobro es de :"+precioreserva);
			 
		}
		public String Reservar(Doble doble,int numDias, int fecha, cHabitual persona )
		{
			 FechaInicio =fecha;
			 Cliente= persona.nombre;
			 CantidadDias=numDias;
			 if(persona.ishabitual==true)
			 {
			 precioreserva=  (CantidadDias* Doble.precio)*cHabitual.descuento;
			 }
			 else
			 {
				 precioreserva=  (CantidadDias* Doble.precio); 
				 persona.ishabitual=true;
			 }
			 doble.ocupada=true;
			 numHabitacion = doble.NumHabitacion;
			 return ("su cobro es de :"+precioreserva);
			
		}
		
		
		
		
		
		
		public void Eliminar()
		{
			 FechaInicio=0;
			 Cliente="";
			 CantidadDias=0;
			 precioreserva=0;
			
			 numHabitacion="";
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

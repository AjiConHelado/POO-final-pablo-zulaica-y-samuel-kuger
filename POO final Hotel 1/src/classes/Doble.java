package classes;
public class Doble extends Habitacion{

	

	String foto;
     static int precio=200;
	
	public void FotoDoble()
	{
		//print foto o que???
	}
	
	@Override
	public int MostrarPrecio()
	{
		System.out.println(precio);
		return precio;
	}
	
	public Doble ClonarDoble(Doble doble)
	{
		 Doble casa2 = new Doble();
		 casa2.foto = doble.foto;
		 
		 casa2.NumHabitacion = doble.NumHabitacion+1;
		return casa2;
	}
	
}

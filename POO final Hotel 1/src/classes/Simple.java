package classes;
public class Simple extends Habitacion{

	String foto;
	static int precio=100;
	
	public void FotoSimple()
	{
		
	}
	
	@Override
	public int MostrarPrecio()
	{
		System.out.println(precio);
		return precio;
	}
	
	public Simple ClonarSimple(Simple simple)
	{
		 Simple casa2 = new Simple();
		 casa2.foto = simple.foto;
		
		 casa2.NumHabitacion = simple.NumHabitacion+1;
		 casa2.ocupada=false;
		return casa2;
	}
	
}
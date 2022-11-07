
public class Matrimonial extends Habitacion{

	String foto;
	int precio;
	
	public void FotoMatri()
	{
		
	}
		
	@Override
	public int MostrarPrecio()
	{
		System.out.println(precio);
		return precio;
	}
	public Matrimonial ClonarMatri(Matrimonial matri)
	{
		 Matrimonial casa2 = new Matrimonial();
		 casa2.foto = matri.foto;
		 casa2.precio = matri.precio;
		 casa2.NumHabitacion = matri.NumHabitacion+1;
		 casa2.ocupada=false;
		return casa2;
	}
	
}
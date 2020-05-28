package actividad1;

import java.util.ArrayList;

public class SitioEmblematico {

	public final static int PRECIO_ESTANDAR = 15;
	
	public final static int PRECIO_GRATIS = 0;

	
	public ArrayList<Boolean> valoraciones;
	
	public int precio;
	
	public String nombre;
	
	public SitioEmblematico(ArrayList<Boolean> valoraciones, int precio, String nombre) {
		this.valoraciones = valoraciones;
		this.precio = precio;
		this.nombre = nombre;
	}

}

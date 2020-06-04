package actividad1;

import java.util.ArrayList;

public class SitioEmblematico {

	public final static int PRECIO_ESTANDAR = 15;
	
	public final static int PRECIO_GRATIS = 0;

	
	public ArrayList<Boolean> valoraciones;
	
	public float precio;
	
	public String nombre;
	
	public SitioEmblematico(ArrayList<Boolean> valoraciones, float precio, String nombre) {
		this.valoraciones = valoraciones;
		this.precio = precio;
		this.nombre = nombre;
	}
	
	public void mostrarse() {
		System.out.println("===========Mostrando Lugar de interes===========");
		System.out.println("nombre " + nombre);
		System.out.println("precio " + precio);
	}


}

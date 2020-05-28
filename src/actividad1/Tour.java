package actividad1;

import java.util.ArrayList;

public abstract class Tour {

	public int plazasMaximas;
	
	public int plazasOcupadas;
		
	public String nombre;
	
	public ArrayList<Boolean> valoraciones;
	
	public ArrayList<SitioEmblematico> sitiosEmblematicos;
	
	// si true - es de manana si false es de tarde
	public boolean turno; 
	
	
}

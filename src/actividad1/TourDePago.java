package actividad1;

import java.util.ArrayList;

public class TourDePago extends Tour {

	public int plazasMaximas = 10;

	public int precio = 10;

	public TourDePago(int plazasOcupadas, String nombre, ArrayList<Boolean> valoraciones, ListaSitioEmblematicos sitiosEmblematicos, boolean turno) {
		super();
		this.plazasOcupadas = plazasOcupadas;
		this.nombre = nombre;
		this.valoraciones = valoraciones;
		this.sitiosEmblematicos = sitiosEmblematicos;
		this.turno = turno;
	}

	
}

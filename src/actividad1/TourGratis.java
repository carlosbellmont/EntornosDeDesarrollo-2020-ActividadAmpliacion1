package actividad1;

import java.util.ArrayList;

public class TourGratis extends Tour {

	public int plazasMaximas = 20;

	public int plazasOcupadas;
	
	public TourGratis(int plazasOcupadas, String nombre, ArrayList<Boolean> valoraciones, ArrayList<SitioEmblematico> sitiosEmblematicos, boolean turno) {
		super();
		this.plazasOcupadas = plazasOcupadas;
		this.nombre = nombre;
		this.valoraciones = valoraciones;
		this.sitiosEmblematicos = sitiosEmblematicos;
		this.turno = turno;
	}

}

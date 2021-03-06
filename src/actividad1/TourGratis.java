package actividad1;

import java.util.ArrayList;

public class TourGratis extends Tour {

	public int plazasMaximas = 20;

	public int plazasOcupadas;
	
	public float donaciones = 0;
	
	public TourGratis(int plazasOcupadas, String nombre, ArrayList<Boolean> valoraciones, ListaSitioEmblematicos sitiosEmblematicos, boolean turno) {
		super();
		this.plazasOcupadas = plazasOcupadas;
		this.nombre = nombre;
		this.valoraciones = valoraciones;
		this.sitiosEmblematicos = sitiosEmblematicos;
		this.turno = turno;
	}
	
	public void addDonacion(float donacion) {
		this.donaciones += donacion;
	}

	@Override
	public float calcularBeneficio() {
		return this.donaciones;
	}

	@Override
	public float calcularCosteParaElUsuario() {
		return sitiosEmblematicos.getCoste();
	}
}

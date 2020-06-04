package actividad1;

import java.util.ArrayList;

public abstract class Tour {

	public int plazasMaximas;
	
	public int plazasOcupadas;
		
	public String nombre;
	
	public ArrayList<Boolean> valoraciones;
	
	public ListaSitioEmblematicos sitiosEmblematicos;
	
	// si true - es de manana si false es de tarde
	public boolean turno; 
	
	public void mostrarsePorPantalla() {
		
		System.out.println("===========Mostrando Tour===========");
		System.out.println("plazasMaximas " + plazasMaximas);
		System.out.println("plazasOcupadas " + plazasOcupadas);
		System.out.println("nombre " + nombre);
		System.out.println("beneficio es " + calcularBeneficio());
		System.out.println("coste para el usuario es " + calcularCosteParaElUsuario());

		sitiosEmblematicos.mostrarse();
	}
	
	public abstract float calcularBeneficio();
	
	public abstract float calcularCosteParaElUsuario();

	
}

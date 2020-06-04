package actividad1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("Bienvenido al Gestor de Tours");
		Scanner teclado = new Scanner(System.in);
		String opcion;
		do{
			System.out.println("Elige una opción:\n1 - Crear un Tour\n2 - Mostrar detalles de un tour\n3 - Listar tours antiguos\n4 - Calcular beneficio total\n5 - Salir");
			opcion=teclado.nextLine();
			switch(opcion) {
			case "1": 
				// Case Crear un Tour
					crearTour();
				break;
			case "2": 
					crearVariosTour();
				break;
			case "3":
					mostrarDetallesDeUnTour(crearTour());
				// Case Mostrar detalles de un to1ur
				break;
			case "4": 
				// Case Listar tours antiguos
				break;
			case "5": 
				// Case Calcular beneficio total
				break;
			case "6":
				// Case 5 Salir
				break;
			default: System.out.println("Opción no válida. Introduce un número entre el 1 y el 5.");
			break;
			}
		}while(opcion.compareTo("6")!=0);
		teclado.close();
	}

	public static Tour crearTour() {

		ArrayList<Boolean> valoraciones1 = new ArrayList<Boolean>();
		valoraciones1.add(true);
		valoraciones1.add(false);

		SitioEmblematico sitioDePago1 = new SitioEmblematico(valoraciones1, SitioEmblematico.PRECIO_ESTANDAR, "Museo del Prado");
		SitioEmblematico sitioGratis1 = new SitioEmblematico(valoraciones1, SitioEmblematico.PRECIO_GRATIS, "Plaza mayor");
		ArrayList<SitioEmblematico> sitiosEmblematicos1 = new ArrayList<SitioEmblematico>();
		sitiosEmblematicos1.add(sitioDePago1);
		sitiosEmblematicos1.add(sitioGratis1);
		ListaSitioEmblematicos lista1 = new ListaSitioEmblematicos(sitiosEmblematicos1);

		TourGratis t1= new TourGratis(6, "Tour 1", valoraciones1, lista1, false);
		return t1;
	}
	
	public static Tour crearVariosTour() {

		ArrayList<Boolean> valoraciones1 = new ArrayList<Boolean>();
		valoraciones1.add(true);
		valoraciones1.add(false);

		SitioEmblematico sitioDePago1 = new SitioEmblematico(valoraciones1, SitioEmblematico.PRECIO_ESTANDAR, "Museo del Prado");
		SitioEmblematico sitioGratis1 = new SitioEmblematico(valoraciones1, SitioEmblematico.PRECIO_GRATIS, "Plaza mayor");
		ArrayList<SitioEmblematico> sitiosEmblematicos1 = new ArrayList<SitioEmblematico>();
		sitiosEmblematicos1.add(sitioDePago1);
		sitiosEmblematicos1.add(sitioGratis1);
		ListaSitioEmblematicos lista1 = new ListaSitioEmblematicos(sitiosEmblematicos1);

		TourGratis t1= new TourGratis(6, "Tour 1", valoraciones1, lista1, false);
		return t1;
	}
	

	public static void mostrarDetallesDeUnTour(Tour tour) {
		tour.mostrarsePorPantalla();
	}

	public static void listarTodosTours() {

	}
	
	public static void calcularBeneficio() {

	}
}

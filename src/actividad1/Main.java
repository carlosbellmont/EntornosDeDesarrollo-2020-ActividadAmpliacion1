package actividad1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static ListaTourRealizados listaTourRealizados = new ListaTourRealizados();

	public static void main(String[] args) {
		System.out.print("Bienvenido al Gestor de Tours");
		Scanner teclado = new Scanner(System.in);
		String opcion;
		do{
			System.out.println("Elige una opción:\n1 - Crear un Tour\n2 - Crear Varios Tour\n3 - Mostrar detalles de un tour\n4 - Listar tours antiguos\n5 - Calcular beneficio total\n6 - Anadir tour de pago\n7 - Salir");
			opcion=teclado.nextLine();
			switch(opcion) {
			case "1": 
				listaTourRealizados.add(crearTourGratuitoDePrueba());
				break;
			case "2": 
				listaTourRealizados.add(crearVariosTourGratuitosDePrueba());
				break;
			case "3":
				mostrarDetallesDeUnTour(listaTourRealizados.get(0));
				break;
			case "4": 
				listaTourRealizados.mostrarse();
				break;
			case "5": 
				System.out.println("El beneficio total es de " + listaTourRealizados.calcularBeneficio());
				break;
			case "6":
				listaTourRealizados.add(crearTourDePagoDePrueba());
				break;
			case "7":
				System.out.println("Saliendo...");
				break;
			default: System.out.println("Opción no válida. Introduce un número entre el 1 y el 5.");
			break;
			}
		}while(!opcion.contains("7"));
		teclado.close();
		System.exit(0);
	}

	private static Tour crearTourDePagoDePrueba() {
		ArrayList<Boolean> valoraciones1 = new ArrayList<Boolean>();
		valoraciones1.add(true);
		valoraciones1.add(false);
		
		SitioEmblematico sitioDePago1 = new SitioEmblematico(valoraciones1, SitioEmblematico.PRECIO_ESTANDAR, "Museo del Prado");
		SitioEmblematico sitioGratis1 = new SitioEmblematico(valoraciones1, SitioEmblematico.PRECIO_GRATIS, "Plaza mayor");
		ArrayList<SitioEmblematico> sitiosEmblematicos1 = new ArrayList<SitioEmblematico>();
		sitiosEmblematicos1.add(sitioDePago1);
		sitiosEmblematicos1.add(sitioGratis1);
		ListaSitioEmblematicos lista1 = new ListaSitioEmblematicos(sitiosEmblematicos1);
		
		TourDePago t1= new TourDePago(9, "Tour 1", valoraciones1, lista1, false);
		return t1;
	}

	public static Tour crearTourGratuitoDePrueba() {

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
		t1.addDonacion(5);

		return t1;
	}

	public static ArrayList<Tour> crearVariosTourGratuitosDePrueba() {

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
		t1.addDonacion(99);
		
		
		ArrayList<Boolean> valoraciones2 = new ArrayList<Boolean>();
		valoraciones2.add(true);
		valoraciones2.add(false);

		SitioEmblematico sitioDePago2 = new SitioEmblematico(valoraciones2, SitioEmblematico.PRECIO_ESTANDAR, "Museo del Prado");
		SitioEmblematico sitioGratis2 = new SitioEmblematico(valoraciones2, SitioEmblematico.PRECIO_GRATIS, "Plaza mayor");
		ArrayList<SitioEmblematico> sitiosEmblematicos2 = new ArrayList<SitioEmblematico>();
		sitiosEmblematicos2.add(sitioDePago2);
		sitiosEmblematicos2.add(sitioGratis2);
		ListaSitioEmblematicos lista2 = new ListaSitioEmblematicos(sitiosEmblematicos1);

		TourGratis t2= new TourGratis(6, "Tour 1", valoraciones2, lista2, false);
		t1.addDonacion(101);

		ArrayList<Tour> out = new ArrayList<Tour>();
		out.add(t1);
		out.add(t2);
		
		return out;
	}


	public static void mostrarDetallesDeUnTour(Tour tour) {
		if (tour == null) {
			System.out.println("No puedo mostra el contenido de NULL");
			return; 
		}
		tour.mostrarsePorPantalla();
	}


}

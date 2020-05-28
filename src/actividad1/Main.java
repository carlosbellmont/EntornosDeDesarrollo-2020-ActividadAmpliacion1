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
				ArrayList<Boolean> valoraciones = new ArrayList<Boolean>();
				valoraciones.add(true);
				valoraciones.add(false);

				SitioEmblematico sitioDePago = new SitioEmblematico(valoraciones, SitioEmblematico.PRECIO_ESTANDAR, "Museo del Prado");
				SitioEmblematico sitioGratis = new SitioEmblematico(valoraciones, SitioEmblematico.PRECIO_GRATIS, "Plaza mayor");
				ArrayList<SitioEmblematico> sitiosEmblematicos = new ArrayList<SitioEmblematico>();
				sitiosEmblematicos.add(sitioDePago);
				sitiosEmblematicos.add(sitioGratis);

				TourGratis t1 = new TourGratis(6, "Tour 1", valoraciones, sitiosEmblematicos, false);
				t1.plazasOcupadas = 9999;
				
				break;
			case "2": 
				break;
			case "3":
				// Case Mostrar detalles de un tour
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

	public static void crearTour() {

	}

	public static void mostrarDetallesDeUnTour() {

	}

	public static void listarTodosTours() {

	}
	
	public static void calcularBeneficio() {

	}
}

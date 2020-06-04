package actividad1;

import java.util.ArrayList;

public class ListaTourRealizados {
	
	ArrayList<Tour> lista = new ArrayList<Tour>();
	
	public ListaTourRealizados(ArrayList<Tour> lista) {
		this.lista = lista;
	}

	public ListaTourRealizados() {
	}
	
	public ListaTourRealizados(Tour tour) {
		this.lista.add(tour);
	}
	
	public void add(Tour tour) {
		this.lista.add(tour);
	}
	
	public void add(ArrayList<Tour> lista) {
		this.lista.addAll(lista);
	}
	
	public Tour get(int i) {
		if (lista == null || lista.size() < i) {
			return null;
		}
		return this.lista.get(i);
	}
	
	public void mostrarse() {
		if (lista == null) {
			System.out.println("No puedo mostra el contenido de una lista NULL");
			return;
		}
		for (int i = 0; i< lista.size(); i++) {
			lista.get(i).mostrarsePorPantalla();
		}
	}

	public Float calcularBeneficio() {
		if (lista == null) {
			System.out.println("No puedo calcular el beneficio de una lista NULL");
			return null;
		}
		float beneficio = 0;
		for (int i = 0; i< lista.size(); i++) {
			beneficio += lista.get(i).calcularBeneficio();
		}
		return beneficio;
	}
}

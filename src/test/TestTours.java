package test;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import actividad1.ListaSitioEmblematicos;
import actividad1.ListaTourRealizados;
import actividad1.SitioEmblematico;
import actividad1.Tour;
import actividad1.TourDePago;
import actividad1.TourGratis;

public class TestTours {

	
	ListaTourRealizados listaTourRealizados = new ListaTourRealizados();

	@BeforeEach
	public void init() {
		listaTourRealizados = new ListaTourRealizados();
		listaTourRealizados.add(crearTourDePagoDePrueba());
		listaTourRealizados.add(crearTourGratuitoDePrueba());
	}
	
	
	
	@Test
	public void testCalcularBeneficio1() {
		assertEquals(listaTourRealizados.calcularBeneficio(), new Float(95));
	}
	
	@Test
	public void testCalcularBeneficio2() {
		listaTourRealizados.add(crearTourGratuitoDePrueba());
		assertEquals(listaTourRealizados.calcularBeneficio(), new Float(100));
	}
	
	@Test
	public void testCalcularCoste() {
		listaTourRealizados.add(crearTourGratuitoDePrueba());
		assertEquals(listaTourRealizados.calcularBeneficio(), new Float(100));
	}
	

	public Tour crearTourGratuitoDePrueba() {

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


	private Tour crearTourDePagoDePrueba() {
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

}

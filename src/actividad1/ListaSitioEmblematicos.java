package actividad1;

import java.util.ArrayList;

public class ListaSitioEmblematicos {

	ArrayList<SitioEmblematico> lista;
	
	public ListaSitioEmblematicos(ArrayList<SitioEmblematico> lista) {
		this.lista = lista;
	}

	public void mostrarse() {
		for (int i = 0; i< lista.size(); i++) {
			lista.get(i).mostrarse();
		}
	}
}

package modelo;

import java.util.ArrayList;
import modelo.Colores;

public class Lista {
	ArrayList<Colores> lista = new ArrayList<Colores>();

	public void alistar(Colores color) {
		lista.add(color);
	}

	public void desalistar() {
		// eliminar el elemento en la posicion que le digamos
		lista.remove(0);

		// eliminar toda la lista
		lista.clear();
	}
}

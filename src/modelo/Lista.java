package modelo;

import java.util.ArrayList;
import modelo.Colores;

public class Lista {
	ArrayList<Colores> lista = new ArrayList<Colores>();

	public void alistar(Colores color) {
		lista.add(color);
	}
//jsem emiliuo
	public void desalistar() {
		// eliminar el elemento en la posicion que le digamos 
		lista.remove(this.lista.size());
	}
}

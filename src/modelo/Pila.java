package modelo;

import java.util.Stack;
import modelo.Colores;

public class Pila {

	Stack<Colores> pila = new Stack<Colores>();

	// push
	public void apilar(Colores color) {
		pila.push(color);
	}

	// pop
	public Colores desapilar() {

		return pila.pop();

	}
}

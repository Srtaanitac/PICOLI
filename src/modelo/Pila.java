package modelo;

import java.util.Stack;
import modelo.Colores;


public class Pila {

	// Primero tenemos que instanciar la pila y decir de que va a ir rellena
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

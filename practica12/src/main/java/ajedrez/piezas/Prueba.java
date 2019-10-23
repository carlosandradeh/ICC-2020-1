package ajedrez.piezas;
import java.util.List;

public class Prueba {
	/*
	 *Clase main para probar que Peon.java funcione correctamente
	*/ 
	public static void main(String[] args) {
		Posicion pruebaPosicion = new Posicion(4,5);
		Peon pruebaPeon = new Peon(Color.BLANCO, pruebaPosicion);
		List<Posicion> jugadas = pruebaPeon.obtenerJugadasLegales();

		//Para mostrar cada posición dentro de las lista jugadas
		for (Posicion i : jugadas ) {
			System.out.println(i); //Imprime cada POsicion en la lista jugadas 
		}
	}

}
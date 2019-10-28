package ajedrez.piezas; //No estoy seguro si esto va aquí :(
import java.util.List;
import java.util.LinkedList;

public class Peon extends Pieza {

	public Peon(Color color, Posicion posicion ) {
		super(color, posicion);
	}

	@Override
	public List<Posicion> obtenerJugadasLegales() {
		LinkedList<Posicion>jugadas = new LinkedList<>();
		int fila = obtenerPosicion().obtenerFila();
		int columna = obtenerPosicion().obtenerColumna();

		if (this.obtenerColor() == Color.BLANCO) {

			if (this.obtenerPosicion().obtenerFila() == 6) {
				jugadas.add(new Posicion(fila, columna-2));
			}

			if (columna-1 >= 0 && fila-1 >= 0) {
				jugadas.add(new Posicion(fila-1, columna-1));
			}
			if (fila-1 >= 0) {
				jugadas.add(new Posicion(fila, columna-1));
			}
			if (columna+1 <= 7 && fila-1 >= 0 ) {
				jugadas.add(new Posicion(fila+1, columna-1));
			}
			
		}

		if (this.obtenerColor() == Color.NEGRO) {
			if (this.obtenerPosicion().obtenerFila() == 1) {
				jugadas.add(new Posicion(fila, columna+2));
			}

			if (columna-1 >= 0 && fila+1 <= 7) {
				jugadas.add(new Posicion(fila-1, columna+1));
			}

			if (fila+1 <= 7) {
				jugadas.add(new Posicion(fila, columna+1));
			}

			if (columna+1 <= 7 && fila+1 <= 7) {
				jugadas.add(new Posicion(fila+1, columna+1));
			}
		}

		return jugadas;

		

	}
}

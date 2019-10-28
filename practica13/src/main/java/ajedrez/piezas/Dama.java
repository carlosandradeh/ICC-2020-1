package ajedrez.piezas;
import ajedrez.Tablero;
import java.util.List;
import java.util.LinkedList;

public class Dama extends Pieza {

	//Instancia de tablero
	Tablero tablero = Tablero.obtenerInstancia();

	public Dama(Color color, Posicion posicion) {
		super(color, posicion);
	}

	@Override
	public List<Posicion> obtenerJugadasLegales() {
		LinkedList<Posicion>jugadas = new LinkedList<>();
		int fila = obtenerPosicion().obtenerFila();
		int columna = obtenerPosicion().obtenerColumna();
		
		for (int i = fila-1, j = columna-1; i >= 0 && j>=0 ; i--, j-- ) {
			Pieza p = tablero.obtenerPieza(i,j);
			if (p != null) {
				if (p.obtenerColor() != this.obtenerColor()) {
					jugadas.add(new Posicion(i,j));	
				}
				break; //Si se come a la pieza entonces se detiene ahi
			} else { //Si no hay ninguna pieza:
				jugadas.add(new Posicion(i,j));
			}
		}

		for (int i = fila-1, j = columna+1; i >= 0 && j>=0 ; i--, j++ ) {
			Pieza p = tablero.obtenerPieza(i,j);
			if (p != null) {
				if (p.obtenerColor() != this.obtenerColor()) {
					jugadas.add(new Posicion(i,j));
				}
				break;
			} else {
				jugadas.add(new Posicion(i,j));
			}
			
		}
			
		for (int i = fila-1, j = columna; i>=0 ; i-- ) {
			Pieza p = tablero.obtenerPieza(i,j);
			if (p != null) {
				if (p.obtenerColor() != this.obtenerColor()) {
					jugadas.add(new Posicion(i,j));	
				}
				break; //Si se come a la pieza entonces se detiene ahi
			} else { //Si no hay ninguna pieza:
				jugadas.add(new Posicion(i,j));
			}
			
		}	
		
		for (int i = fila,j = columna-1; j>=0 ; j-- ) {
			Pieza p = tablero.obtenerPieza(i,j);
			if (p != null) {
				if (p.obtenerColor() != this.obtenerColor()) {
					jugadas.add(new Posicion(i,j));	
				}
				break; //Si se come a la pieza entonces se detiene ahi
			} else { //Si no hay ninguna pieza:
				jugadas.add(new Posicion(i,j));
			}
		}	
		
		for (int i = fila, j = columna+1; j>=0 ; j++ ) {
			Pieza p = tablero.obtenerPieza(i,j);
			if (p != null) {
				if (p.obtenerColor() != this.obtenerColor()) {
					jugadas.add(new Posicion(i,j));	
				}
				break; //Si se come a la pieza entonces se detiene ahi
			} else { //Si no hay ninguna pieza:
				jugadas.add(new Posicion(i,j));
			}
			
		}	
		
		for (int i = fila+1, j = columna-1; i>= 0 && j>=0 ; i++, j--) {
			Pieza p = tablero.obtenerPieza(i,j);
			if (p != null) {
				if (p.obtenerColor() != this.obtenerColor()) {
					jugadas.add(new Posicion(i,j));	
				}
				break; //Si se come a la pieza entonces se detiene ahi
			} else { //Si no hay ninguna pieza:
				jugadas.add(new Posicion(i,j));
			}
		}
		for (int i = fila+1, j = columna ; i<=7 ; i++ ) {
			Pieza p = tablero.obtenerPieza(i,j);
			if (p != null) {
				if (p.obtenerColor() != this.obtenerColor()) {
					jugadas.add(new Posicion(i,j));	
				}
				break; //Si se come a la pieza entonces se detiene ahi
			} else { //Si no hay ninguna pieza:
				jugadas.add(new Posicion(i,j));
			}
		}
		
		for (int i = fila+1, j = columna+1; i>= 0 && j>=0 ; i++, j++) {
			Pieza p = tablero.obtenerPieza(i,j);
			if (p != null) {
				if (p.obtenerColor() != this.obtenerColor()) {
					jugadas.add(new Posicion(i,j));	
				}
				break; //Si se come a la pieza entonces se detiene ahi
			} else { //Si no hay ninguna pieza:
				jugadas.add(new Posicion(i,j));
			}	
		}
			
		return jugadas;
	}	

}
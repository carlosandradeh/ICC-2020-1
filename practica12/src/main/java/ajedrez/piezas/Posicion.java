package ajedrez.piezas;

public class Posicion {
	private int fila;
	private int columna;

	/**
	 *Construtor de POsicion
	 *@param fila int que represetna las filas
	 *@param columna int que representa las columnas
	*/
	public Posicion(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
	}

	/**
	 *Metodo para obtener Fila
	 *@return entero de Fila 
	*/
	public int obtenerFila() {
		return fila;
	}

	/**
	 *Metodo para obtener Columna
	 *@return entero de columna 
	*/
	public int obtenerColumna() {
		return columna;
	}
}
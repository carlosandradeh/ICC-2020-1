package ajedrez.piezas;

import java.util.List;
import ajedrez.piezas.Posicion;
import ajedrez.piezas.Color;

public abstract class Pieza {
	private Color color;
	private Posicion posicion;

	/**
 	 *Constructor para Piezas
 	 * @param color - El color que se le desea dar a la piez B/W
 	 * @param posicion -- Posicion que se le desea dar, dato del tipo Posicion  
	*/ 
	public Pieza (Color color, Posicion posicion) {
		this.color = color;
		this.posicion = posicion;
	}
	/**
	 *Metodo abstracto
	*/
	public abstract List<Posicion> obtenerJugadasLegales();

	/**
 	 *Metodo para obtener Color
 	 * @return color que se le haya dado a la pieza 
	*/
	public Color obtenerColor() {
		return color;
	}

	/**
 	 *Metodo para obterne Posicion
 	 *@return Posicion dada
	*/
	public Posicion obtenerPosicion() {
		return posicion;
	}

	/**
 	 *Metodo para asignar Posicion
	*/
	public void asignarPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	/**
 	 *Metodo para comparar dos objetos del tipo Pieza
 	 *@return Booleano Verdadeo o falso 
	*/
	@Override
	public boolean equals (Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Pieza otra = (Pieza) obj;
		return color == otra.color && posicion.equals(otra.obtenerPosicion());
	}	
}
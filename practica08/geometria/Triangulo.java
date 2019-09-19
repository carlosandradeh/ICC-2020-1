package geometria;

/**
 *Representa un polígono de tres lados. Está definido por tres puntos en el plano cartesiano..
 *@author Andrade Hernandez Calos
 *@version 1.0
*/

public class Triangulo{
	//Atributos
	private Punto a;
	private Punto b;
	private Punto c;

	public static final int EQUILATERO = 0;
	public static final int ISOSCELES = 1;
	public static final int ESCALENO  = 2;

	/**
	 *Crea un triángulo equilátero de lado 1 con vértices en (0, 0), (1, 0) y (0.5, sin(π / 3)).
	*/
	public Triangulo(){
		a = new Punto(0,0);
		b = new Punto(1,0);
		c = new Punto(0.5,Math.sin(Math.PI/3));
	}
	/**
	 *Crea un triángulo con los tres puntos dados.
	 *@param a - Primer punto 
	 *@param b - Segundo punto
	 *@param c - Tercer punto
	*/
	public Triangulo(Punto a, Punto b, Punto c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * Metodo para obtener Punto a
	*/
	public Punto geta(){
		return a;
	}
	/**
	 *Metodo para obtener Punto b
	*/
	public Punto getb(){
		return b;
	}

	/**
	 *Metodo para obtener Punto c
	*/
	public Punto getc(){
		return c;
	} 

	/**
	 *Determina si los vértices de este triángulo están alineados.
	 *@return True si los vertices estan alineados 
	*/
	public boolean tieneVerticesAlineados(){
		if (a.estanAlineados(b,c)){
			return true;
		}else{
			return false;
		}
	}

	/**
	 *Determina si los vértices de este triángulo están alineados.
	 *@return Regresa el tipo de este triángulo según la longitud de sus lados; puede ser equilátero, isósceles o escaleno.
	*/
	public int tipo(){
		if (a.distancia(b) == b.distancia(c) && b.distancia(c) == a.distancia(c)) {
			return EQUILATERO;
		}else if (a.distancia(b) != a.distancia(c) && a.distancia(b) != b.distancia(c) && b.distancia(c) != a.distancia(c)) {
			return ESCALENO;
		}else{
			return ISOSCELES;
		}

	}
}
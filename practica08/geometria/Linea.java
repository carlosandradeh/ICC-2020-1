package geometria;

/**
 * Clase para crear líneas rectas en el plano Cartesiano.
 * @see Punto
 */
public class Linea {
                        
    private Punto p1;
    private Punto p2;

    /**
     * Constructor por omisión.
     */
    public Linea() { 
        p1 = new Punto(0,0); 
        p2 = new Punto(1,1);  
    }

    /**
     * Construye una línea a partir de dos puntos.
     * @param p1 punto de origen
     * @param p2 segundo punto
     */
    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * Regresa el punto de origen de esta línea.
     * @return el punto de origen
     */
    public Punto getP1() {
        return p1;
    }

    /**
     * Regresa el segundo punto de esta línea.
     * @return el segundo punto
     */
    public Punto getP2() {
        return p2;
    }

}
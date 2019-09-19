package svg;

import java.io.Writer;
import java.io.OutputStream;
import java.io.IOException;
import geometria.Punto;
import geometria.Linea;
import geometria.Triangulo;
// import geometria.Circulo;

/**
 * Clase para crear imágenes básicas en formato SVG.
 */
public class SVG {

    private static final String INDENTACION = "  ";

    private StringBuilder contenido;
    private double longitud, altura;
    private int nivel;

    /**
     * Crea una imagen SVG con el elemento &lt;svg width="L" height="A" 
     *   xmlns="http://www.w3.org/2000/svg"&gt;, donde L y A son las dimensiones dadas.
     * @param longitud la longitud
     * @param altura la altura
     */
    public SVG(double longitud, double altura) {
        this.longitud = longitud;
        this.altura = altura;
        contenido = new StringBuilder();
        concatenar(String.format(
            "<svg width=\"%.2f\" height=\"%.2f\" xmlns=\"http://www.w3.org/2000/svg\">", 
            longitud, altura));
        nivel = 1;
    }

    /**
     * Agrega el elemento &lt;line x1="a" y1="b" x2="c" y2="d" 
     *   style="stroke: black; stroke-width: 1; fill: none" /&gt; a esta imagen, donde (a, b) y 
     * (c, d) son los dos puntos que conforman la línea dada.
     * @param linea contiene los dos puntos entre los cuales se trazará una línea
     */
    public void agregarLinea(Linea linea) {
        // Implementar
        String s = "<line x1=\"" + linea.getP1().getX() + "\" " + "y1=\"" + (altura - linea.getP1().getY()) + "\" " + "x2=\"" + linea.getP2().getX() + "\" " + "y2=\"" + (altura - linea.getP2().getY()) + "\" " + "style=\"stroke:black;stroke-width:1\"/>"; 
        concatenar(s);
    }

    /**
     * Agrega tres elementos de tipo &lt;line&gt; a esta imagen, tales que representan un triángulo.
     * @param triangulo contiene los tres puntos entre los cuales se trazarán tres líneas
     */
    public void agregarTriangulo(Triangulo triangulo) {
        // Implementar
        Linea l1 = new Linea(triangulo.geta(), triangulo.getb());
        Linea l2 = new Linea(triangulo.geta(), triangulo.getc());
        Linea l3 = new Linea(triangulo.getb(), triangulo.getc());

        agregarLinea(l1);
        agregarLinea(l2);
        agregarLinea(l3);


    }

    /**
     * Agrega el elemento &lt;circle cx="h" cy="k" r="ra" 
     *   style="stroke: black; stroke-width: 1; fill: none" /&gt; a esta imagen, donde (h, k) es el
     * centro del círculo dado y ra es el radio.
     * @param circulo indica el centro del círculo y su radio
     */
    //public void agregarCirculo(Circulo circulo) {
        // OPCIONAL
    //}

    /**
     * Cierra este SVG (&lt;/svg&gt;) y escribe la cadena acumulada en el <code>Writer</code> dado.
     * @param escritor la salida
     * @throws IOException si hay un error escribiendo la salida
     */
    public void escribir(Writer escritor) throws IOException {
        nivel = 0;
        concatenar("</svg>");
        escritor.write(contenido.toString());
    }

    /**
     * Cierra este SVG (&lt;/svg&gt;) y escribe la cadena acumulada en el <code>OutputStream</code> dado.
     * @param salida la salida
     * @throws IOException si hay un error escribiendo la salida
     */
    public void escribir(OutputStream salida) throws IOException {
        nivel = 0;
        concatenar("</svg>");
        salida.write(contenido.toString().getBytes());
    }

    /**
     * Agrega la cadena dada con la indentación especificada por la variable nivel, seguida de
     * un salto de línea.
     * @param info la cadena de texto a agregar
     */
    private void concatenar(String info) {
        contenido.append(INDENTACION.repeat(nivel) + info);
        contenido.append(System.lineSeparator());
    }


}
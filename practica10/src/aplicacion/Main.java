//javac -classpath lib/core.jar -d build src/aplicacion/Main.java
//java -classpath build:lib/core.jar aplicacion.Main
package aplicacion;

import processing.core.PApplet;

public class Main extends PApplet {

	/**
	 * Metodo main el cual lo unico que hace es invocar el metodo PApplet.main(String), que recibe como
	 * parametro el nombre completo de una subclase de PApplet.
	*/ 
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}

	/**
	 * Metodo para fijar las dimensiones de la ventana que se creara, y esto lo hace a través del método size(int, int).
	*/ 
	@Override
	public void settings() {
		size(800 ,800); //TAmaño de la ventana 
	}

	/**
	 * Metodo que se invoca una sola vez al iniciar el programa, y sirve para inicializar variables.
	*/ 
	@Override
	public void setup() {

	}
	/**
	 * Metodo que contiene las instrucciones necesarias para dibujar el tablero de ajedrez
	*/ 
	@Override
	public void draw() {
		for (int i = 0; i < 8 ; i++ ) {
			for (int j = 0; j < 8; j++ ) {
				if ((j + i) % 2 == 0) {
					fill(200,200,200); //COLOR blanco
				}
				else {
					fill(0,0,0); //COLOR negro
				}
				rect(i * 100, j * 100, 100, 100);
			}
		}
		
	}
}
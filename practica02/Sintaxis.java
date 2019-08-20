import static java.lang.Math.sqrt;

public class Sintaxis {

	public static void main(String[] args) {
		int a, b = 20, c;
		a = 3; c = -7;

		boolean prop = false ;
		byte ochoBits = 127;
		short dieciseisBits = -32768;

		double discriminante = b * b - 4 * a * c;
		double x1 = (-b + sqrt(discriminante)) / (2 * a); 
		double x2 = (-b - sqrt(discriminante)) / (2 * a);

		char ch1, ch2;
		ch1 = 'g'; ch2 = 'w';
		int d = 1 / (a - 0);

		// Declaraciones
        long var_1 = 2147483648L; //Agregar una L para que el compilador lo interprete como long. El tipo int no                               acepta valores tan grandes.
        char quote = '\'';
		
	}

}

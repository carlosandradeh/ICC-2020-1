import java.util.Scanner;

public class RFC {

	public static void main(String[] args) {
        String nombreCompleto = "";
        String fechaNacimiento = "";
        char nombre, am;
        String mes, dia, year, ap;
        int lioam, lioap;
    
		Scanner scanner = new Scanner(System.in);
        
        //PEDIR NOMBRE COMPLETO
        System.out.println("Dame tu nombre completo");
        nombreCompleto = scanner.nextLine();
        nombreCompleto = nombreCompleto.toUpperCase();
        
        //PEDIR FECHA DE NACIMIENTO
        System.out.println("Ingrese su fecha de nacimiento en el formato dd/mm/aaaa");
        fechaNacimiento = scanner.nextLine();
        
        //EXTRAER DATOS
        
        //Primeras dos del apellido paterno
        lioap = nombreCompleto.indexOf(" ");
        ap = nombreCompleto.substring(lioap+1, lioap+3);
        
        //Primera del apelido materno
        lioam = nombreCompleto.lastIndexOf(" ");
        am = nombreCompleto.charAt(lioam+1); 
        
        //Primera letra de mi nombre
        nombre = nombreCompleto.charAt(0);
        
        //Día
        dia = fechaNacimiento.substring(0,2);
        
        //Mes
        mes = fechaNacimiento.substring(3, 5);
        
        //año
        year = fechaNacimiento.substring(8,10);
        
        
        
        //PRUEBAS
        System.out.println("Tu RFC es: "+ap + am + nombre +year + mes + dia );
        
	}

}
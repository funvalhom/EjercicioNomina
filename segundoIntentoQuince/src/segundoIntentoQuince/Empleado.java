package segundoIntentoQuince;

import java.util.Scanner;


public class Empleado {
	
public static String empleado () {
		
		Scanner dato = new Scanner(System.in);
		System.out.print("Ingrese el nombre del empleado: ");
		String nombre = dato.next();
		
		return nombre;
		
		
	}
	
	
        public static String ElPuesto() {
		
		Scanner dato = new Scanner(System.in);
		System.out.print("Ingrese el puesto del empleado: ");
		String puesto = dato.next();
		
		return puesto;
        }

}

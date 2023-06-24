package segundoIntentoQuince;

import java.util.Scanner;



public class SalarioNeto {

	public static void main(String[] args) {
		
		Empleado datosDeEmpleado = new Empleado();
		
		
		
		String datos = datosDeEmpleado.empleado();
		String puestoEmpleado = datosDeEmpleado.ElPuesto();
		
		SueldoBruto horas = new SueldoBruto();
		
		Scanner dato = new Scanner(System.in);
		System.out.print("Ingrese las horas laboradas: ");
		horas.setHoras(dato.nextDouble());
		
		System.out.print("Ingrese las horas extra: ");
		horas.setExtra(dato.nextDouble());
	
		
		System.out.println("El sueldo bruto es: " + horas.calcularSueldoBruto());
		
		System.out.println("El sueldo neto es: " + horas.calcularSueldoNeto());

	}

}

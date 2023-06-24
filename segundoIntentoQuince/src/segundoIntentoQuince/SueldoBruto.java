package segundoIntentoQuince;

import java.util.Scanner;

public class SueldoBruto {
	
	private double horas;
	private double horasExtra;
	
	
	public void setHoras(double horas) {
		this.horas = horas;
		
	}
	
	public void setExtra(double horasExtra) {
		this.horasExtra = horasExtra;
		
	}
	
	public double calcularSueldoNeto() {
		double sueldoNeto =  (horas * 72.87) + (horasExtra * 25.96);
		return sueldoNeto;
		
	}
	
	public double calcularSueldoBruto() {
		 double sueldoNeto =  (horas * 72.87) + (horasExtra * 25.96);
		    double sueldoNetoDescuento;
		    
		    if (sueldoNeto > 2000) {
		        sueldoNetoDescuento = sueldoNeto - (sueldoNeto * 0.18);
		    } else {
		        sueldoNetoDescuento = sueldoNeto - (sueldoNeto * 0.16);
		    }

		    return sueldoNetoDescuento;
	}
	

}

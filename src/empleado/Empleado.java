package empleado;

public class Empleado {

    public static enum tipoEmpleado{Vendedor, Encargado};
	
	public static float ej1(tipoEmpleado tio) {return 0;}
	
	public static float CalculoNominaBruta(tipoEmpleado tipo, float ventaMes, float horasExtras) {
		
		float salarioBase=0, totalHorasExtra=0;
		
		if(tipo.equals(tipoEmpleado.Encargado)) 
			salarioBase=2500;
		else 
			salarioBase=2000;
		
		if(ventaMes>=1000 && ventaMes<1500)
			salarioBase+=100;
		
		else if (ventaMes>=1500)
			salarioBase+=200;
		
		totalHorasExtra=horasExtras*30;
		
		return salarioBase+totalHorasExtra;
	
	}
	
	public static float calculoNominaNeta(float nominaBruta) {
		
		if(nominaBruta>2100) {
			
			if(nominaBruta>2500)
				return (nominaBruta*(1-0.18f));
			
			else 
				return (nominaBruta*(1-0.15f));
			
		}
		
		return nominaBruta;
	}
	
}

package examen;

/**
 * @author Sergio Nalda
 */
public class Fecha {
	public static boolean fechaValida;
	
	/**
	 * 
	 * @param anio
	 * @param mes
	 * @param dia
	 * @return Esto lo que hace es devolver una fecha completa y lo hace cuando los datos introducidos respetan tanto las condiciones de dias y meses
	 * como que sean numeros (int) y no letras o palabras (Strings)
	 * 
	 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		
		return fechaValida;
	}
}
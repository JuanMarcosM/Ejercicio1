package CINE;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Cine {
	
	Calendar calendario = new GregorianCalendar();
	
	private int entradasDispo;
	int hora = calendario.get(Calendar.HOUR_OF_DAY);

	public Cine() {
	}
	
	
	public Cine(int aforo) {
		this.entradasDispo=aforo;
	}
	
	public int getEntradasDispo() {
		return entradasDispo;
	}

	public void setEntradasDispo(int entradasDispo) {
		this.entradasDispo = entradasDispo;
	}
	
	public void comprarEntradas(int compra) {
		entradasDispo -= compra;
	}
	
	/**
	 * Intica si el cine está abieto en horario de 10 a 22 horas
	 * @return true si el cine está abierto y false si no
	 */
	public boolean cineAbierto() {
		
		if ((hora >= 10 ) && (hora <= 22)) {
			System.out.println("Compra correcta");
			return true;
		} else {
			System.out.println("Cine cerrado");
			return false;
		}
	}
}
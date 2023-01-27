package CINE;
import java.util.Calendar;

public class Cine2 {
	
	private int entradasDispo;
	

	public Cine2() {
	}
	
	public Cine2(int aforo) {
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

	public boolean cineAbierto() {
		int hora;
		
		Calendar calendario = Calendar.getInstance();
		hora = calendario.get(Calendar.HOUR_OF_DAY);
		
		if ((hora > 10) && (hora <22)) {
			return true;
		} else {
			return false;
		}	
	}
	
}
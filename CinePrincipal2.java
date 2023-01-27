package CINE;
import java.util.Scanner;
public class CinePrincipal2 {
	
	public static void main(String[] args) {
		
		final int aforo = 100;
		int entradas;
		Scanner sc = new Scanner(System.in);
		Cine2 cine = new Cine2(aforo);
		
		do {
			
			System.out.println("¿Cuántas entradas quieres comparar?");
			entradas = sc.nextInt();
			
			if (cine.getEntradasDispo() >= entradas) {
				cine.comprarEntradas(entradas);
				if (cine.getEntradasDispo() < 20) {
					System.out.println("Quedan menos del 20% de entradas");
				}
			} else {
				System.out.println("No hay tantas entradas disponibles");
			}
			
		} while (cine.getEntradasDispo() > 0 && cine.cineAbierto());
		
		sc.close();
	}

}
package CINE;
import java.util.Scanner;
public class CinePrincipal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		final int aforo = 100;
		int compra;
		
		Cine cine = new Cine(aforo);
		
		do {
			System.out.println("Dime las entradas que vas a comprar: ");
			compra = sc.nextInt();
			
			if (compra > cine.getEntradasDispo()) {
				System.out.println("Error no puedes comprar más entradas de las disponibles");
			} else {
				cine.comprarEntradas(compra);
				cine.cineAbierto();
				System.out.println("Quedan " + cine.getEntradasDispo() + " entradas disponibles");
				
				if (cine.getEntradasDispo() <= (aforo*0.20) && (cine.getEntradasDispo() != 0)) {
					System.out.println("Advertencia, queda cerca del 20% de las entradas disponibles");
				}
			}
		} while (cine.getEntradasDispo() > 0);
		
		System.out.println("No quedan entradas disponibles");
		sc.close();

	}

}

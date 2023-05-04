package lezione4;

import java.util.Scanner;

public class Asterischi {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci un numero ");
		int n = scanner.nextInt();
		
		if (n <= 0) {
	        System.out.println("Errore: il numero deve essere psitivo");
	    }
		else {
			for(int i=1; i<=n ;i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		scanner.close();
	}
}

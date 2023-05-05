package lezione4;

import java.util.Scanner;

public class DivisioneTra2Numeri {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Inserisci il dividendo");
		int x = scanner.nextInt();
		
		System.out.println("Inserisci il divisore");
		int y = scanner.nextInt();
		
		if(y==0){
			System.out.println("Non puoi dividere per 0, riprova");
			
			System.out.println("Inserisci il dividendo");
			x = scanner.nextInt();
			
			System.out.println("Inserisci il divisore");
			y = scanner.nextInt();
			
		}
		
		int q=0, r=x;
		
		while(r>=y) {
			
			r=r-y;
			q++;
		}
		System.out.println("Quozient: " + q + " Resto: " + r);
		scanner.close();
	}
}

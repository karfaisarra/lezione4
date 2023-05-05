package lezione4;

import java.util.Scanner;

public class ParoleMisteriose {
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			String[] parole= {"cane", "gatto", "topo", "criceto", "pesce"};
				
			for(int i=0; i<3;i++) {
				System.out.println("Inserisci una parola:");
			    String parola = scanner.nextLine();
				    
			    for(int j=0; j<parole.length;j++) {
			    	if (parola.equalsIgnoreCase(parole[j])) {
			            System.out.println("Indovinato!");
			            return;
			        }
			    }
		    	System.out.println("Sbagliato!");
			}
			System.out.println("Tentativi esauriti");
		}
			
	}	
}

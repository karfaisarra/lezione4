package lezione4;

import java.util.Scanner;

public class Temperature {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		double[] temperature=new double[12];
		double somma=0, media;
		
		for(int i=0;i<12;i++) {
			System.out.println("Inserisci un valore: ");
			temperature[i]=scanner.nextDouble();
			somma = somma + temperature[i];
		}
		media = somma/temperature.length;

		for(int i=0;i<temperature.length;i++) {
			if(media>=temperature[i]) {
				System.out.println(temperature[i] + " inferiore alla media");
			}else {
				System.out.println(temperature[i] + " superiore o uguale alla media");
			}
		}
		scanner.close();
	}
}

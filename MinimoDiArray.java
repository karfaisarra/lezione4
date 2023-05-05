package lezione4;

import java.util.Scanner;

public class MinimoDiArray {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		int[] arrayDiNumeri=new int [10];
		
		for(int i=0; i<arrayDiNumeri.length;i++) {
			System.out.println("Inserisci un numero");
			arrayDiNumeri[i]=scanner.nextInt();
		}
		int min=Integer.MAX_VALUE, j=0;
		for(int i=0; i<arrayDiNumeri.length;i++) {
			if(arrayDiNumeri[i]<min) {
				min=arrayDiNumeri[i];
				j=i;
			}
		}
		System.out.println("Il valore minimo è: " + min + " in posizione " + j);
		scanner.close();
	}
}

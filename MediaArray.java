package lezione4;

import java.util.Scanner;

public class MediaArray {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		double somma=0, media=0;
		
		System.out.println("Quanti numeri vuoi fornirci?");
		int n=scanner.nextInt();
		
		int[] numeri= new int [n];
		for(int i=0;i<numeri.length;i++) {
			System.out.println("Dammi un numero");
			numeri[0]=scanner.nextInt();
		}
		for(int i=0; i<numeri.length;i++) {
			somma=somma+numeri[i];
		}
		media=somma/numeri.length;
		System.out.println("La media è: " + media);
		scanner.close();
	}
}

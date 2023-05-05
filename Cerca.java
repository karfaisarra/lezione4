package lezione4;

import java.util.Scanner;

public class Cerca {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		int[] numeri= {11, 25, 37, 51, 6, 7, 8, 9, 40, 10};
		
		System.out.println("Inserici un numero: ");
		int x=scanner.nextInt();
		
		boolean presente=false;
		
		for(int i=0;i<numeri.length; i++) {
			if(numeri[i]==x) {
				presente = true;
		        break;
			}
		}
		
		if (presente) {	
		    System.out.println("Presente!");
		} else {
		    System.out.println("Assente!");
		}
		
		scanner.close();
	}
}

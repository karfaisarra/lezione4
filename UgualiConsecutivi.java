package lezione4;

import java.util.Scanner;

public class UgualiConsecutivi {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		int[] numeri= new int [10];
		
		for (int i = 0; i < numeri.length; i++) {
			System.out.println("Inserici un numero");
			numeri[i] = scanner.nextInt();
        }
		
		for (int i = 1; i < numeri.length; i++) {
            if (numeri[i] == numeri[i-1]) {
                System.out.println("Il valore " + numeri[i] + " in posizione " + i + " è uguale al precedente");
            }
        }
		scanner.close();
	}
}

package lezione4;

import java.util.Scanner;

public class ContaNumeriCrescenti {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		int prev = Integer.MIN_VALUE;
        int count = 0;
        while (true) {
            System.out.println("Inserisci un numero: ");
            int num = scanner.nextInt();
            if (num <= prev) {
                break;
            }
            prev = num;
            count++;
        }
        System.out.println("Hai immesso una sequenza di numeri crescenti lunga " + count );
		
	
		scanner.close();
	}
}

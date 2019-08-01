package b08;

import java.util.Scanner;

public class ScannerAvg {

	public static void main(String[] args) {
		System.out.println("Inserisci numeri");
		double result = 0; // parto da 0

		Scanner scanner = new Scanner(System.in);// scrivo sulla console perché c'è system in//creo uno scanner e lo
													// lego alla tastiera// loop infinito per cui continua a leggere
		int[] values = new int[3];

		for (int i = 0; i < 3; i++) {

			values [i] = scanner.nextInt();// somma tutti gli elementi dell ’array

		//	int somma = 0; 
		}	
		
			for (int x : values) {
				int sum = 0;
				sum += x; // calcola e stampa la media
			 int media = sum / 10;
			System.out.println("La media è: " + media);

		}
		scanner.close(); // see try-with-resources
		System.out.println("Average is " + result);
	}}


//for (int x : values)
//	somma += i; // calcola e stampa la media
//int media = somma / 10;
//System.out.println("La media è: " + media);
//
//}
//scanner.close(); // see try-with-resources
//System.out.println("Average is " + result);
//}}
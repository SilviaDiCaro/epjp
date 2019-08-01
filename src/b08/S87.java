package b08;

import java.util.Scanner;

public class S87 {
    public static void main(String[] args) {
        System.out.println("Please, enter a few numbers");
        double result = 0; //parto da 0

        Scanner scanner = new Scanner(System.in);//scrivo sulla console perché c'è system in//creo uno scanner e lo lego alla tastiera// loop infinito per cui continua a leggere
        while (scanner.hasNext()) {// quando chiudo lo streem non c'è più next e smetto di looppare
            if (scanner.hasNextDouble()) {//se ciò che ho nello scanner è double, leggi e sommalo
                result += scanner.nextDouble();
            } else {
                System.out.println("Bad input, discarded: " + scanner.next());//se no, leggo next e loop
            } 
        }
        scanner.close(); // see try-with-resources
        System.out.println("Total is " + result);
    }
}
//quanti interi? li metto in un array, li passo ad avg e stampo la media
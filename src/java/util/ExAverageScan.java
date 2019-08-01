package java.util;

public class ExAverageScan {
	 
		 public static void main(String[] args) {
			    int vettore[]={4, 9, 1, 3, 5};
			    int i;
			    double somma, media;
		 
			    somma=0;

			    for(i=0; i<=vettore.length-1; i=i+1) {
			      somma=somma+vettore[i];
			    }

			    media=somma/vettore.length;
		 
		 }

}

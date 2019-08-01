package b06;

public class S59 {
    private int a; //parte dati privata per non far fatica a capire chi ha cambiato a. posso dire anche che la classe e il metodo siano intoccabili
    protected short b; //non metto nessun metodo che mi permette di modificare a
    static double c; //data member tutte private. in alcuni casi compica la struttura del codice. allora uso protected (b è visibile alla classe e alle classi derivate)
    // public long d; //è sconsigliata la variabile public poiché visibile a tutti

    static { //simile al costruttore ma che lavora sulla parte static. è invocato da java la prima volta che qualcuno usa quella classe
        c = 18; //initializer setta c=18. noi non lo vediamo, vediamo direttamente 18. la jvm lo chiama
    }

    public S59() { //costruttore con lo stesso nome della classe che inizializza i parametri con la notazione "this"
        this.a = 42;
        this.b = 23;
    }

    public int h() { 
        return a / 2;
    }
}

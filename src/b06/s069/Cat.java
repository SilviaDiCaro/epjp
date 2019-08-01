package b06.s069;

public class Cat extends Mammal {
    private Tail tail;

    public Cat(int gestationDays, int tailLen) {
        super(gestationDays);//costruisci un oggetto della classe che sta sopra (mammal) e dammi questo parametro
        this.tail = new Tail(tailLen);
    }

    @Override
    public String toString() {
        return "Cat [" + tail + ", gestation=" + gestation + "]";
    }
}

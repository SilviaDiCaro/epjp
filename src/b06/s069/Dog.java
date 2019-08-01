package b06.s069;

public class Dog extends Mammal {
    private Tail tail;

    public Dog(int gestationDays, int tailLen) {
        super(gestationDays);
        this.tail = new Tail(tailLen);
    }

    @Override
    public String toString() {
        return "Dog [" + tail + ", gestation=" + gestation + "]";
        //al posto di tail, posso scrivere tail.getSize()
    }
}

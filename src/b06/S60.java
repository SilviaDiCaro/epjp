package b06;

public class S60 {
    private int a;
    static double c;

    static private double f() {
        return c;
    }

    void g() {
        f();
    }

    public int h() {
        return a / 2;
    }
}
//i metodi devono essere pubblici
//protetto o privato: i metodi pubblici che hanno una parte condivisa lo facciamo privato
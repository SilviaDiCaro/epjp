package b06;

public class S61 {
    private int i; // 0
    private boolean flag; // false
    private String t; // null

    public void f() {
        int i = 42; //se la variablie è primitiva la inizializzazione è diretta
        String s = new String("Hello");

        System.out.println(s + i);
    }

    public void g() {
        System.out.println(t + ", " + i + ", " + flag);
    }
}

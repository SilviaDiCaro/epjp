package b06;

public class S58 {
    private static int staticMember = 5; //visibile a tutta la classe
    private long member = 5;            //visibile a tutta la classe

    public void f() {
        int local = 7;
        if (staticMember == 2) {
            short inner = 12;
            staticMember = 1 + inner;
            member = 3 + local;
        }
    } 

    public void g() {
        System.out.println(member);
    }
    
    public static void main(String[] args) {
        double local = 5;
        System.out.println(local); //dato che ho chiuso la parentesi, posso riutilizzare local
        staticMember = 12;
    }
}

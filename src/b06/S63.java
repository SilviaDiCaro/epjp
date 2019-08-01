package b06;

public class S63 {
    public static void main(String[] args) {
        System.out.println(Boolean.class);
        System.out.println(Character.class);
        System.out.println(Byte.class);
        System.out.println(Short.class);
        System.out.println(Integer.class);
        System.out.println(Float.class);
        System.out.println(Double.class);

//        @SuppressWarnings("deprecation") 
		Integer i = new Integer(1);
        Integer j = Integer.valueOf(2); 
        System.out.println(i + j);

        int k = j.intValue();
        System.out.println(k);

        Integer m = 3;
        System.out.println(m);

        int n = j;
        System.out.println(n);
    }
    //normalmente usiamo x=3 e non Intereger y=3.java mette a disposizioni classi che gestiscono le collezioni meglio degli array
    //usiamo i wrapper
    //posso associare metodi alla classe
}

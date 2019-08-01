package b04;

public class S46String {
	public static void main(String[] args) {
     StringBuilder sb1 = new StringBuilder ();
     StringBuilder sb2 = new StringBuilder (" OKKK ");
     
     System.out.println("use this space" + sb1.capacity() );
     System.out.println("use this space" + sb2.capacity() );
     
     System.out.println("string builder append: " + sb1.append(' ').append(" hi "));
     System.out.println("string builder append: " + sb2.append(' ').append(" ciao "));
     
     System.out.println("char charAT" + sb1.charAt(2) + sb2.charAt(4));
     System.out.println("char at position 1 in sb2 is '" + sb2.charAt(1) + "'");
     
     System.out.println("delete" + sb2.delete(1, 2));
      
   
     System.out.println("insert: " + sb2.insert(4, " va bene "));
 
     
   System.out.println("index Of" + sb1.indexOf("KK"));
   
      System.out.println("String builder insert" + sb2.insert(1,"KK"));

     
     System.out.println("int length" + sb1.length());
     
      
     sb2.setCharAt(5, 'a');
     System.out.println("setCharAt: " + sb2);
     
     sb1.setLength('b');
     System.out.println("setLength: " + sb1);
     
   
     
     System.out.println("Sb reverse" + sb2.reverse());
    
  
     
	}
}

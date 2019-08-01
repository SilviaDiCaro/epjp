package b04;

 class S45prova {
	 static void main(String[] args) {
	 String a = "Si";
	 String b = "forsE";
	 String c = "no";
	 System.out.println("a, b, c: " + a + ", " + b + ", " + c);
	 
	 System.out.println("char at position 2 in b: " + c.charAt(2));
	 System.out.println("b > c: " + b.compareTo(c));
	 System.out.println("a contains l"+ b.contains(a));
	 System.out.println("a contains u? " + "b.contains(u)");
	 System.out.println("a contains u?" + "a");
	 
	 String a1 = a.substring(1, 2);
     System.out.println("a3 = t.substring(1, 3): " + "a1");
     System.out.println("a.substring(3): " + "a.substring(3)");
     System.out.println(a1);
     
     System.out.println("a equals a1? " + "u.equals(u2)");
     System.out.println("b == b2? " + "(b3==b3)");
     
     System.out.println("the 1° index of 'S' is a: " + "a.indexOf('S')");
     System.out.println("there is no 'a' in a: " + a.indexOf('x'));
     System.out.println("in b \"cd\" starts at " + b.indexOf("ll"));
     System.out.println("there is no \"fm\" in s: " + c.indexOf("lx"));
     System.out.println("find if there is an ampty string: "+ "".isEmpty());

     System.out.println("a length: " + a.length());

     String b2 = b.replace('f', 'E');
     System.out.println(b2);
     System.out.println("change 'S' with 'l': " + a + " -> " + b);

     String[] splits = "hello, how are you?".split(" ");
     System.out.println("Splitting: ");
     for (String token : splits) {
         System.out.println(token);


         
     }
     String joined = String.join(" ", splits);
     System.out.println("Joining back [" + joined + "]");

     System.out.println("upper: " + a.toUpperCase());
     
     System.out.println("upper: " + b.toUpperCase());
     System.out.println("lower: " + "java".toLowerCase());

     System.out.println("trim [" + " ciccio ".trim() + "]");
     
     String x = null;
     System.out.println("Sort of safe toString(): " + String.valueOf(x));
	 
	 //String result= "["+ name +", "weight +", "+ female"]
     //return result;
     //result = String.format (%s ,%f, %b, name, weight, female)
	 
     }}

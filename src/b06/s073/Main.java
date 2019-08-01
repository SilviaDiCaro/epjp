package b06.s073;

public class Main {
    public static void main(String[] args) {
        // Cat cat = (Cat) new Dog(); creo un oggetto di tipo Dog ma non posso 

        Pet pet = new Dog("Bob"); //a dx dell'uguale ho la creazione dell'oggetto. L'oggetto è dog mentre il reference è un cat
        
        // risky
        Dog dog = (Dog) pet; 
        dog.bark();

        // no, no, no!!!
    //    Cat cat = (Cat) pet; // java.lang.ClassCastException
      //  System.out.println(System.identityHashCode(cat));

        if (pet instanceof Cat) {
            Cat tom = (Cat) pet; //il pet lo trasformo in un gatto, lo chiamo tom 
            tom.meow(); //e lo faccio miagolare
        }

    }
}
//quando trasformo il pet in cat, mi dà subito una eccezione
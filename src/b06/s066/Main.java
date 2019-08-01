package b06.s066;

public class Main {
    public static void main(String[] args) {
        Barker[] barkers = new Barker[2];
        
        barkers[0] = new Fox(); //new classe e non oggetto
        barkers[1] = new Dog(); //primo cane

        for(Barker barker: barkers) {
            System.out.println(barker.bark());
        }
        
        BarkAndWag baw = new Dog(); //secondo cane diverso dal primo
        System.out.println(baw.tailWaggingSpeed());

        Dog dog = new Dog(); //terzo cane diverso dal secondo e dal primo
        System.out.println(dog.bark(3));
    }
}
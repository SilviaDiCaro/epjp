package b06.s066;

public class Dog implements BarkAndWag {
    @Override
    public String bark() {
        return "woof!";
    }

    public String bark(int count) { //overloading (int count) è la lista dei parametri associati
        StringBuilder sb = new StringBuilder(); //abbaiamento multiplo

        for (int i = 0; i < count; i++) { //è diverso, entrambi servono "per abbaiare"
            sb.append(bark());
        }

        return sb.toString();
    }

    @Override
    public int tailWaggingSpeed() {
        return BarkAndWag.AVG_WAGGING_SPEED;
    }
}
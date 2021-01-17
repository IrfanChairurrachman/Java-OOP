class Feline{
    boolean vocal = true;
    void makeNoise() {
        System.out.println("Non-specific cat sound");
    }
    void call(){
        System.out.println("Puss, Puss, Puss......");
        if(vocal) {
            makeNoise();
        }
    }
    void quiet(){
        vocal = false;
    }
}

class Lion extends Feline{
    void makeNoise(){
        System.out.println("Roar! Roar!");
    }
}

class Moggy extends Feline{
    void makeNoise(){
        System.out.println("Meow Meow");
    }
}

public class FelineTest {
    public static void main(String[] args) {
        Feline catwoman = new Feline();
        catwoman.call();
        Feline regina = new Lion();
        regina.call();
        Feline catbert = new Moggy();
        catbert.call();
    }
}

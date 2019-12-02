public class Test {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla(100);
        System.out.println(gorilla.displayEnergy());
        gorilla.eatBanana();
        gorilla.climb();
        gorilla.throwSomething();
        System.out.println(gorilla.displayEnergy());
    }
}
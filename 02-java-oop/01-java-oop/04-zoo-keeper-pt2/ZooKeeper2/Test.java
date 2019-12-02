public class Test {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla(100);
        Bat bat = new Bat(300);
        System.out.println(gorilla.displayEnergy());
        gorilla.eatBanana();
        gorilla.climb();
        gorilla.throwSomething();
        System.out.println(gorilla.displayEnergy());
        System.out.print(bat.displayEnergy());
        bat.fly();
        bat.eatHumans();
        bat.eatHumans();
        bat.attackTown();
        System.out.print(bat.displayEnergy());

    }
}
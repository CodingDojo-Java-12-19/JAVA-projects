public class Bat extends Mammal {
    public Bat(int energyLevel) {
        super(energyLevel);
    }
    public void fly(){
        System.out.println("Flying!");
        energyLevel = energyLevel - 50;
    }
    public void eatHumans(){
        System.out.println("Eating humans!");
        energyLevel = energyLevel + 25;
    }
    public void attackTown(){
        System.out.println("Attacking the town!");
        energyLevel = energyLevel + 100;
    }
}
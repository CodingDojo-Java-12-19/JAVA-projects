public class Gorilla extends Mammal {
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	public void throwSomething() {
		System.out.println("throwing stuff");
		energyLevel -= 5;
	}
	public void eatBanana() {
		System.out.println("eating bananas");
		energyLevel += 10;
	}
	public void climb() {
		System.out.println("climbing stuff");
		energyLevel -= 10;
	}
}
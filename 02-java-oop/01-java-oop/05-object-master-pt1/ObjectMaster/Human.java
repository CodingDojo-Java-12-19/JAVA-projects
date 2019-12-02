public class Human {
    protected int health = 100;
    protected int strength = 3;
    protected int intelligence = 3;
    protected int stealth = 3;
	
	public int displayHealth() {
		System.out.println("Health Level: " + health);
		return health;
	}
	public Human(int health) {
		this.health = health;
    }
    public int displayStrength(){
        System.out.println("Strength Level: " + strength);
		return strength;
    }
    public int displayIntelligence(){
        System.out.println("Intelligence Level: " + intelligence);
        return intelligence;
    }
    public int displayStealth(){
        System.out.println("Stealth Level: " + stealth);
        return stealth;
    }
    public void attackHuman(){
        System.out.println("Being attacked by another human!");
        health = health - 25;
        System.out.println(health);
    }    
}
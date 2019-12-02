
public class Galaxy extends Phone implements PhoneInterface {

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
    public String Ring() {
      return this.getRingTone();
    }
    public String unlock() {
    	return "Unlocked with facial recognition";
    }
    public void displayInfo() {
      System.out.println("Version Number: " + this.getVersionNumber());
      System.out.println("Batter Percentage: " + this.getBatteryPercentage());
      System.out.println("Carrier: " + this.getCarrier());
      System.out.println("RingTone: " + this.getRingTone());
    }
}
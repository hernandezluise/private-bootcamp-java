
public class Bat extends Mammal {
	public void energyStatus() {
		System.out.println("Energy Level: ");
		energyLevel += 200;
		displayEnergy();
	}
	
	public void fly() {
		System.out.println("Flyinngggg");
		energyLevel -= 50;
		displayEnergy();
	}
	
	public void eatHumans() {
		System.out.println("so... well, never mind ");
		energyLevel += 25;
		displayEnergy();
	}
	
	public void attackTown() {
		System.out.println("Ruunnnnnnnnnnn");
		energyLevel -=100;
		displayEnergy();
	}
}

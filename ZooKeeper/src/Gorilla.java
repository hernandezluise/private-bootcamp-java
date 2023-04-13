
public class Gorilla extends Mammal {
	public void throwThings() {
		System.out.println("Throwing things, decrease energy: ");
		energyLevel -= 5;
		displayEnergy();
	}
	
	public void eatBananas() {
		System.out.println("Eating Bananas, increase energy: ");
		energyLevel += 10;
		displayEnergy();
	}
	
	public void climb() {
		System.out.println("Climbing decreases engergy: ");
		energyLevel -= 10;
		displayEnergy();
	}
}

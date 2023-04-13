
public class Driver extends Car {
    public void decreaseGas (){
        System.out.println("You drive the car");
        gasLevel--;
        gasLevelStatus();
    }
    
    public void boost() {
    	System.out.println("You use the boosters");
    	gasLevel -= 3;
    	gasLevelStatus();
    }
    
    public void refuel() {
    	System.out.println("You refueled");
    	gasLevel += 2;
    	gasLevelStatus();
    }
}

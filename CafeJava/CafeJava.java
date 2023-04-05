public class CafeJava {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = ", Your total is $";

        double mochaPrice = 3.5;
        double dripCoffee = 5.50;
        double latte = 4.35;
        double cappucino = 3.5;

        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
        
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
        

        System.out.println(generalGreeting + customer1);
        System.out.println(customer1 + pendingMessage);
        
        if(isReadyOrder4) {
        	System.out.println(customer4 + readyMessage);
        	System.out.println(customer4 + displayTotalMessage + cappucino);
        }
        else {
        	System.out.println(customer4 + pendingMessage);
        }
        
        
        System.out.println(customer2 + displayTotalMessage + Double.sum(latte, latte) );
        
        if(isReadyOrder2) {
        	System.out.println(customer2 + pendingMessage);
        }
        else {
        	System.out.println(customer2 + readyMessage);
        }
        
        System.out.println(customer3 + displayTotalMessage + (dripCoffee - latte));
    }
}
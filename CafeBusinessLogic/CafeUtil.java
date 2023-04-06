import java.util.ArrayList;
import java.util.Scanner;
public class CafeUtil {
    public int getStreakGoal() {
        int numWeeks = 10;
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] lineItems) {
        double sum = 0;

        for (double price: lineItems) {
            sum += price;
        }
        return sum;
    }

    public boolean displayMenu(ArrayList<String> menuItems) {

        for (int i = 0; i < menuItems.size(); i++ ) {
            System.out.println(menuItems.get(i));
        }
        return true;
    }

    public String addCustomer(ArrayList<String> customers) {
        Scanner inputName = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String customerName = inputName.nextLine();
        System.out.println("Hello, " + customerName);
        System.out.printf("There are %s people ahead of you. \n ", customers.size());
        customers.add(customerName);
        return customerName;
    }


}

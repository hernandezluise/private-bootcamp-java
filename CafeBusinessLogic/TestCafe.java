import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
    public static void main(String[] args) {
    CafeUtil cafeJava = new CafeUtil();

    System.out.println("---- Streak Goal Test ----");
    Integer goalStreak = cafeJava.getStreakGoal();

    System.out.println("Purchases needed by week 10: " + goalStreak);

    System.out.println("----- Order Total Test ------");
    double[] lineItems = {3.5, 1.5, 4.0, 4.5 };
    System.out.println("Order total is: " + cafeJava.getOrderTotal(lineItems));

    System.out.println("---- Display Menu Test ----");
    ArrayList<String> menu = new ArrayList<String>();
    menu.add("drip coffee");
    menu.add("cappuccino");
    menu.add("latte");
    menu.add("mocha");
    cafeJava.displayMenu(menu);

    System.out.println("---- Add Customer Test ----");
    ArrayList<String> customers = new ArrayList<String>();
    for ( int i = 0; i < 4; i++) {
        cafeJava.addCustomer(customers);
    }

    }



}

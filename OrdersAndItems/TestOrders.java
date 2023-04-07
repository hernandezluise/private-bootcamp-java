import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 4.99;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 3.99;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 5.99;

        Item item4 = new Item();
        item4.name = " cappuccino";
        item4.price = 4.50;

        Orders order1 = new Orders();
        System.out.println(order1.total);
        order1.name = "Cindhuri";

        Orders order2 = new Orders();
        //System.out.println(order2.total);
        order2.name = "Jimmy";

        Orders order3 = new Orders();
        order3.name = "Noah";

        Orders order4 = new Orders();
        order4.name = "Sam";

        order2.item.add(item1);
        order2.total += item1.price;

        order3.item.add(item4);
        order3.total += item4.price;

        order4.item.add(item2);
        order4.total += item2.price;

        order1.ready = true;

        order4.item.add(item2);
        order4.item.add(item2);
        order4.total += item2.price*2;

        order2.ready = true;

        System.out.printf("Name: %s \n", order1.name);
        System.out.printf("Total: %s \n ", order1.total);
        System.out.printf("Ready: %s \n", order1.ready);
        
        System.out.printf("Name: %s  \n", order2.name);
        System.out.printf("Total: %s \n", order2.total);
        System.out.printf("Ready: %s \n", order2.ready);

        System.out.printf("Name: %s \n", order3.name);
        System.out.printf("Total: %s \n", order3.total);
        System.out.printf("Ready: %s \n", order3.ready);

        System.out.printf("Name: %s \n", order4.name);
        System.out.printf("Total: %s \n", order4.total);
        System.out.printf("Ready: %s \n", order4.ready);
    }
}
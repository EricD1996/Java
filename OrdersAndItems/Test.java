import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
    
        // Menu items
            Item item1 = new Item("mocha", 3.2);
            Item item2 = new Item("latte", 5);
            Item item3 = new Item("drip coffee", 2.5);
            Item item4 = new Item("capuccino", 2);
        // Order variables -- order1, order2 etc.
            Order order1 = new Order("Cindhuri");
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
    }
}

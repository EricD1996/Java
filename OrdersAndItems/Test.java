import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
    
        // Menu items
            Item item1 = new Item("mocha", 3.2);
            Item item2 = new Item("latte", 5);
            Item item3 = new Item("drip coffee", 2.5);
            Item item4 = new Item("capuccino", 2);
        // Order variables -- order1, order2 etc.
            Order order1 = new Order();
            Order order2 = new Order();
            Order order3 = new Order();
            Order order4 = new Order();
        // Application Simulations
            order1.name = "Cindhuri";
            order1.items.add(item1);
            order1.total = item1.price + item2.price;
            order1.ready = true;

            order2.name = "Jimmy";
            order2.items.add(item2);
            order2.ready = true;

            order3.name = "Noah";
            order3.total = item4.price;
            order3.items.add(item4);

            order4.name = "Sam";
            order4.total = item2.price*3;
            order4.items.add(item2);
            order4.items.add(item2);
            order4.items.add(item2);
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Items: %s\n", order1.items);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Items: %s\n", order2.items);
        System.out.printf("Ready: %s\n", order2.ready);
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Items: %s\n", order3.items);        
        System.out.printf("Name: %s\n", order4.name);   
        System.out.printf("Total: %s\n", order4.total); 
        System.out.printf("Items: %s\n", order4.items); 
        System.out.printf("Ready: %s\n", order4.ready); 
    }

}
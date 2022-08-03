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
            Order order2 = new Order("Jimmy");
            Order order3 = new Order("Noah");
            Order order4 = new Order("Sam");
            Order order = new Order();
        // Application Simulations
            order1.addItem(item1);
            order1.addItem(item1);
            order1.display();
            order1.getStatusMessage(true);
            order.addItem(item1);
            order.addItem(item2);
            order.display();
            order2.addItem(item3);
            order2.addItem(item4);
            order2.display();
            order3.addItem(item3);
            order3.addItem(item3);
            order3.display();
            order4.addItem(item4);
            order4.addItem(item1);
            order4.display();
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Items: %s\n", order1.items);
        // System.out.printf("Ready: %s\n", order1.ready);
        // System.out.printf("Name: %s\n", order2.name);
        // System.out.printf("Total: %s\n", order2.total);
        // System.out.printf("Items: %s\n", order2.items);
        // System.out.printf("Ready: %s\n", order2.ready);
        // System.out.printf("Name: %s\n", order3.name);
        // System.out.printf("Total: %s\n", order3.total);
        // System.out.printf("Items: %s\n", order3.items);        
        // System.out.printf("Name: %s\n", order4.name);   
        // System.out.printf("Total: %s\n", order4.total); 
        // System.out.printf("Items: %s\n", order4.items); 
        // System.out.printf("Ready: %s\n", order4.ready); 
    }

}
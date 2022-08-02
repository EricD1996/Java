import java.util.ArrayList;
public class CafeUtil{
    public int getStreakGoal(){
        int sum = 0;
        for( int x = 1; x <= 10; x++){
            sum += x;
        }
        return sum;
    }
    public double getOrderTotal(double[] prices){
        double sum = 0;
        for( int x = 0; x < prices.length; x++){
            sum += prices[x];
            System.out.println(prices[x]);
        }
        return sum;
    }
    public void displayMenu(ArrayList<String> menuItems){
        for( int x = 0; x < menuItems.size(); x++){
            System.out.println(menuItems.get(x));
        }
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        System.out.println("There are " + customers.size() + "people in front of you");
        customers.add(userName);
        System.out.println(customers);
    }
}
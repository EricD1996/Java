import java.util.ArrayList;
public class Order {
    private String name;
    // private double total;
    private boolean ready;
    private ArrayList<Item> items;

    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }
    
    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        items.add(item);
    }
    public String getStatusMessage(boolean ready){
        if(ready == true){
            System.out.println("Your order is ready.");
            return "Your order is ready.";
        } else {
            System.out.println("Thank you for waiting. Your order will be ready soon.")
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }
    public double getOrderTotal(){
        double sum = 0;
        for(int x = 0; x < items.size(); x++){
            sum += items.get(x).getPrice();
        }
        return sum;
    }
    public void display(){
        System.out.println("Customer Name:" + this.name);
        System.out.println(this.items);
        System.out.println(getOrderTotal());
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public boolean getReady(){
        return ready;
    }
    public void setReady(boolean ready){
        this.ready = ready;
    }
    public ArrayList<Item> getArray(){
        return items;
    }
    public void setArrayList(ArrayList<Item> items){
        this.items = items;
    }
}
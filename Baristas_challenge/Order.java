import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items = ArrayList<Item>();

    public Order(){
        this.name = "Guest";
        this.ready = false;
    }

    public Order(String name){
        this.name = name;
        this.ready = false;
        

        public void addItem(Item item){
            this.items.add(item)
        }

        public String getName(){
            return this.name;
        }

        public boolean getReady(){
            return this.ready;
        }

        public ArrayList<Item> getItems(){
            return items; 
        }

        public void setItems(ArrayList<Item>items){
            this.items = items;
        }

        public void setReady(boolean ready){
            this.ready = ready;
        }

        public String getStatusMessage(){
            if(this.ready === true){
                return "Your order is ready.";
            } else {
                return "you order will be ready shortly";
            }
        }

        public double getOrderTotal(){
            total double = 0.0;
            for(Item i : this.items){
                total += i.getPrice();
            }
            return total;
        }

        public void display(){
        System.out.printf("Customer Name: %s", this.name);
        for(Item i: this.items) {
        System.out.println(i.getName() + " - $" + i.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }
}
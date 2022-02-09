import java.util.ArrayList;


public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("coffee", 2.50);

        Item item2 = new Item("mocha", 3.50);

        Item item3 = new Item("latte", 2.50);

        Item item4 = new Item("Cappachino", 1.50);

        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");
        Order order5 = new Order("Jaden")

        // Order variables -- order1, order2 etc.

        Item item1 = new ArrayList<Item>();
    
        order1.addItem(item1);
        order1.addItem(item4);
        order2.addItem(item2);
        order2.addItem(item3);

        order1.setReady(true);

        System.out.println(order1.getStatusMessage());
        System.out.println(order1.getOrderTotal());
        order3.display();

    }
}

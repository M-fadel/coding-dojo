import java.util.ArrayList;

public class TestOrder {



    public static void main(String[] args) {
    
        // Menu items
        Items item1 = new Items("mocha" , 5);
        Items item2 = new Items("latte" , 4);
        Items item3 = new Items("drip coffee" , 3);
        Items item4 = new Items("capuccino" , 2);
        
        

        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.addItems(item1);
        order1.addItems(item2);
        Order order2 = new Order();
        order2.addItems(item3);
        order2.addItems(item4);
        Order order3 = new Order("Cindhuri");
        order3.addItems(item1);
        order3.addItems(item2);
        Order order4 = new Order("jimmy");
        order4.addItems(item1);
        order4.addItems(item3);
        Order order5 = new Order("sam");
        order5.addItems(item2);
        order5.addItems(item2);
        
        
        order1.setReady(true);
        System.out.println(order1.getStatusMessage());
        System.out.println(order1.getOrderTotal());

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
        
        
    }
}

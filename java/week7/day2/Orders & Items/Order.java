import java.util.ArrayList;

public class Order {
    private String name;
    
    private boolean ready; 
    private ArrayList<Items> items ;
    public Order(){
        this.name = "Guest";
        this.items = new ArrayList();
    }
    public Order(String name){
        this.name = name;
        this.items = new ArrayList();
    }
    public ArrayList getItems() {
        return items;
    }
    public void addItems(Items items) {
        this.items.add(items);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean getReady() {
        return ready;
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }
        public void add(Items item) {
            this.items.add(item);
        }
        public String getStatusMessage(){
            if(ready){
                return"your order is ready!";
            }else{
                return"Thank you for waiting. Your order will be ready soon";
            }
        }
        public double getOrderTotal() {
            double orderTotal = 0 ;
            for (Items item : items) {
                orderTotal += item.getPrice();
            }
            return orderTotal;
        }

    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Customer name :"+ this.name);
        
        for (int i=0 ; i<items.size() ; i++){
            System.out.println(this.items.get(i).getName()+" "+this.items.get(i).getPrice());
        }
        System.out.println("total :"+ this.getOrderTotal()+"\n");
    }
}   

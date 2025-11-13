import java.util.ArrayList;

record OrderItem(int qty,ProductForSale productForSale){}

public class Store {
    private static ArrayList<ProductForSale> storeItem= new ArrayList<>();
    public static void main(String[] args) {

        storeItem.add(new ArtObject("Oil panting",1350,"Work by ABF painted in 2010."));
        storeItem.add(new ArtObject("Crown",9000,"Designed by XYZ with pearls."));
        listProduct();

        var order1 = new ArrayList<OrderItem>();
        addOrderItem(order1,0,2);
        addOrderItem(order1,1,2);
        printOrder(order1);
    }

    public static void listProduct(){
        for (var item : storeItem){
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addOrderItem(ArrayList<OrderItem> order, int orderIndex,int qty){
        order.add(new OrderItem(qty, storeItem.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal =0;
        for(var item : order){
            item.productForSale().printPricedItem(item.qty());
            salesTotal += item.productForSale().getSalesPrice(item.qty());
        }
    }
}

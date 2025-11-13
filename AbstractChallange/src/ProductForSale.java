public abstract class ProductForSale {

    public String type;
    public double price;
    public String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public abstract void showDetails();

    public void printPricedItem(int qty){
        System.out.printf("%2d qty",qty);
    }
    public double getSalesPrice(int qty){
        return qty * price;
    }
}

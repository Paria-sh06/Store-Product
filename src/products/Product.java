package products;

public abstract class Product {
    private String title;
    private Double price;
    private String id;

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
        this.id = generateId();
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    @Override
    public String toString() {
        return "Product's name: " + title + "\n\tprice: " + price + "\n\tid: " + id;
    }

    protected abstract String generateId();

}

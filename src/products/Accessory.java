package products;

public class Accessory extends Product{
    private String color;
    private static int accessoryCounter = 3;
    private String id;

    public Accessory(String title, double price, String color) {
        super(title, price);
        setColor(color);
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    @Override
    public String toString() {
        return "Product's name: " + getTitle()
                + "\n\tprice: " + getPrice()
                + "\n\tid: " + getId()
                + "\n\tColor: " + color;
    }
    @Override
    protected String generateId() {
        return String.valueOf(accessoryCounter++);
    }
}

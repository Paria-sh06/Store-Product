import products.*;
import Inventory.*;

public class Main {
    public static void main(String[] args) {
        Inventory<Book> bookInventory = new Inventory<Book>();
        Inventory<Notebook> notebookInventory = new Inventory<Notebook>();
        Inventory<Accessory> accessoryInventory = new Inventory<Accessory>();

        bookInventory.addItem(new Book("Java Programming", 108.6, "Mehdi Ghatee", "Bahman", "Education"));
        bookInventory.addItem(new Book("Little Women", 123.8, "Louisa May", "Bahman", "Drama"));

        notebookInventory.addItem(new Notebook("Classmate", 20.5, 100, true));
        notebookInventory.addItem(new Notebook("Mead", 80.6, 80, false));

        accessoryInventory.addItem(new Accessory("Vase", 50.0, "Red"));
        accessoryInventory.addItem(new Accessory("Bracelet", 25.0, "Blue"));

        Inventory.displayAll(bookInventory, notebookInventory, accessoryInventory);
        System.out.println("-----------------------------------------------------------------------");

        bookInventory.removeItemsById("1");
        accessoryInventory.removeItemsById("4");
        System.out.println("-----------------------------------------------------------------------");

        calculateTotalPrice(bookInventory);
        calculateTotalPrice(notebookInventory);
        calculateTotalPrice(accessoryInventory);
        System.out.println("-----------------------------------------------------------------------");

        accessoryInventory.findItemById("3");
        bookInventory.findItemById("10");
        System.out.println("-----------------------------------------------------------------------");

        accessoryInventory.applyDiscount("Vase", 15);
        accessoryInventory.applyDiscount("Bracelet", 10);

        Inventory.displayAll(bookInventory, notebookInventory, accessoryInventory);

    }

    public static void calculateTotalPrice(Inventory<? extends Product> inventory) {
        double total = 0.0;
        for (Product p : inventory.getItems()) {
            total += p.getPrice();
        }
        System.out.println("Total price: " + total);
    }
}

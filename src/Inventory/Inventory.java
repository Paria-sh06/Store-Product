package Inventory;

import products.Accessory;
import products.Book;
import products.Notebook;

import java.util.ArrayList;

public class Inventory<T extends products.Product> {
    private ArrayList<T> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public Inventory(ArrayList<T> items) {
        setItems(items);
    }

    public void setItems(ArrayList<T> items) {
        this.items = items;
    }

    public ArrayList<T> getItems() {
        return items;
    }
    public void applyDiscount (String productName, int discount){
        for(T product : items){
            if(product.getTitle().equalsIgnoreCase(productName)){
                double currentPrice = product.getPrice();
                double discountedPrice = currentPrice - (currentPrice * (discount / 100.0));
                product.setPrice(discountedPrice);
            }

        }
    }
    public void addItem(T product) {
        items.add(product);
    }
    public void removeItemsById(String id) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                T removedItem = items.get(i);
                items.remove(i);
                System.out.println("Product " + removedItem.getTitle() + " with ID " + id + " is removed.");
                i--;
            }
        }
    }

    public T findItemById(String id) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                System.out.println(items.get(i).toString());
                return items.get(i);
            }
        }
        System.out.println("No product with this id was found.");
        return null;
    }
    public static void displayAll(Inventory<Book> bookInventory, Inventory<Notebook> notebookInventory, Inventory<Accessory> accessoryInventory) {
        System.out.println("Displaying all Books:");
        for (Book book : bookInventory.getItems()) {
            System.out.println(book.toString());
        }

        System.out.println("Displaying all Notebooks:");
        for (Notebook notebook : notebookInventory.getItems()) {
            System.out.println(notebook.toString());
        }

        System.out.println("Displaying all Accessories:");
        for (Accessory accessory : accessoryInventory.getItems()) {
            System.out.println(accessory.toString());
        }
    }

}

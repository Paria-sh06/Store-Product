package products;

public class Notebook extends Product {
    private int pageCount;
    private boolean isHardCover;
    private static int notebookCounter = 2;
    private String id;

    public Notebook(String title, double price, int pageCount, boolean isHardCover) {
        super(title, price);
        setPageCount(pageCount);
        setIsHardCover(isHardCover);

    }
    public void setPageCount(int pageCount){
        this.pageCount = pageCount;
    }
    public int getPageCount(){
        return pageCount;
    }
    public void setIsHardCover(boolean isHardCover){
        this.isHardCover = isHardCover;
    }
    public boolean getIsHardCover(){
        return isHardCover;
    }
    @Override
    public String toString() {
        return "Product's name: " + getTitle()
                + "\n\tprice: " + getPrice()
                + "\n\tid: " + getId()
                + "\n\tPagecount: " + pageCount
                + "\n\tHardCover? : " + isHardCover;
    }

    @Override
    protected String generateId() {
        return String.valueOf(notebookCounter++); // Return the current count as ID and increment it
    }
}

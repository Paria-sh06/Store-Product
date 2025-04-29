package products;

public class Book extends Product {
    private String author;
    private String publication;
    private String genre;
    private static int bookCounter = 1;
    private String id;

    public Book(String title, double price, String author, String publication, String genre) {
        super(title, price);
        setAuthor(author);
        setPublication(publication);
        setGenre(genre);
    }
    public void setAuthor(String author){
        this.author =  author;
    }
    public String getAuthor(){
        return author;
    }
    public void setPublication(String publication){
        this.publication = publication;
    }
    public String getPublication(){
        return publication;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getGenre(){
        return genre;
    }
    @Override
    public String toString() {
        return "Product's name: " + getTitle()
                + "\n\tprice: " + getPrice()
                + "\n\tid: " + getId()
                + "\n\tauthor: " + author
                + "\n\tpublication: " + publication
                + "\n\tgenre: " + genre;
    }
    @Override
    protected String generateId() {
        return String.valueOf(bookCounter++);
    }

}

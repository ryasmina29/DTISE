package Module1.Day10;


public class Book extends Product {
    public int isbn;
    public String author;
    public String bookType;

    public Book(int isbn, String name, String author, String description, String bookType, int quantity) {
        super(name, description, quantity);
        this.isbn = isbn;
        this.author = author;
        this.bookType = bookType;
    }

    @Override
    public void toDisplay() {
        System.out.println("ISBN: " + isbn
                + "\nTitle: " + super.getName()
                + "\nAuthor: " + author
                + "\nDescription: " + super.getDescription()
                + "\nType: " + bookType
                + "\nQuantity Available: " + super.getQuantity() +"\n");

    }
}

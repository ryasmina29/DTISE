package Module1.Day10;


public class Magz extends Product {
    public String publisher;
    public int isbn;

    public Magz(int isbn, String name, String publisher, String description, int quantity) {
        super(name, description, quantity);
        this.publisher = publisher;
        this.isbn = isbn;
    }

    @Override
    public void toDisplay() {
        System.out.println("ISBN: " + isbn
                + "\nTitle: " + super.getName()
                + "\nPublisher: " + publisher
                + "\nDescription: " + super.getDescription()
                + "\nQuantity Available: " + super.getQuantity()+"\n");

    }
}

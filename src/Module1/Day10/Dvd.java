package Module1.Day10;


public class Dvd extends Product {
    public String producer;
    public String dvdType;

    public Dvd(String name, String producer, String description, String dvdType, int quantity) {
        super(name, description, quantity);
        this.producer = producer;
        this.dvdType = dvdType;
    }

    @Override
    public void toDisplay() {
        System.out.println("\nTitle: " + super.getName()
                + "\nProducer: " + producer
                + "\nDescription: " + super.getDescription()
                + "\nType: " + dvdType
                + "\nQuantity Available: " + super.getQuantity()+"\n");

    }
}

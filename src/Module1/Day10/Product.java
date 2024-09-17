package Module1.Day10;


import Module1.Day9.User;

public abstract class Product {
    String name;
    String description;
    int quantity;

    public Product(String name, String description, int quantity) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    public String getName() {return name;}
    public String getDescription() {return description;}
    public int getQuantity() {return quantity;}

    public abstract void toDisplay();
}

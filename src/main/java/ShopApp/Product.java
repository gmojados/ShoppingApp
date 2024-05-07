package ShopApp;

public abstract class Product {
    private static final int ID = 0;
    private int sharedID;
    private String name;
    Size size;
    private double price;
    private int inventory;

    public Product(String name, Size size, double price, int inventory) {
        this.sharedID = sharedID;
        this.name = name;
        this.size = size;
        this.price = price;
        this.inventory = inventory;
    }

    public int getSharedID() {
        return sharedID;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public int getInventory() {
        return inventory;
    }


}


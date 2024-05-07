package ShopApp;

public class Shirt extends Clothing{
    public Shirt(String name, Size size, double price, int inventory) {
        super(name, size, price, inventory);
    }
    @Override
    public int getInventory() {
        return super.getInventory();
    }
}

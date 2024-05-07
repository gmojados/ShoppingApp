package ShopApp;

public class Sweater extends Clothing{
    public Sweater(String name, Size size, double price, int inventory) {
        super(name, size, price, inventory);
    }
    @Override
    public int getInventory() {
        return super.getInventory();
    }
}


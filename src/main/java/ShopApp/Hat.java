package ShopApp;

public class Hat extends Clothing{
    public Hat(String name, Size size, double price, int inventory) {
        super(name, size, price, inventory);
    }
    @Override
    public int getInventory() {
        return super.getInventory();
    }
}

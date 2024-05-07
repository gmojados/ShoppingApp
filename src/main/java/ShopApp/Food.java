package ShopApp;

public abstract class Food extends  Product{

    public Food(int sharedID, String name, Size size, double price, int inventory) {
        super(name, size, price, inventory);
    }

    @Override
    public int getInventory() {
        return super.getInventory();
    }
}


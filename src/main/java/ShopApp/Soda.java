package ShopApp;

public class Soda extends Food implements Perishable{

    public Soda(int sharedID, String name, Size size, double price, int inventory) {
        super(sharedID, name, size, price, inventory);
    }

    @Override
    public boolean isPerishable() {
        return true;
    }
    @Override
    public int getInventory() {
        return super.getInventory();
    }
}


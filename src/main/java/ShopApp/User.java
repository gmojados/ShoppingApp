package ShopApp;

public class User {
    private int id;
    private static int uniqueID = 0;
    Cart cart;

    public User(int id, Cart cart) {
        this.id = id;
        this.cart = cart;
        uniqueID++;
        id = uniqueID;
    }

    public void addToCart(Product product, int qty) {
        cart.addItem(product);
    }

    public void removeFromCart(Product product, int qty) {
        cart.removeItem(product);
    }
}


package ShopApp;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @org.junit.jupiter.api.Test
    void subTotal() {
        Shirt shirt = new Shirt("Shirt", Size.M,9.99,10);
        Hat hat = new Hat("Hat", Size.S, 9.99,3);
        Cart cart = new Cart(0.06f,null);
        cart.addItem(shirt);
        cart.addItem(hat);
        double expectedTotal = (shirt.getPrice()* shirt.getInventory()) +(hat.getPrice()* shirt.getInventory());
        assertEquals(expectedTotal, cart.subTotal(), 0.001);

    }
}
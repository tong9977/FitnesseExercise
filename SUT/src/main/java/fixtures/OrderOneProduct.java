package fixtures;

import shop.Order;
import shop.Product;

public class OrderOneProduct {

    private String name;
    private double price = 0;
    private int quantity;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double total() {
        Order order = new Order();
        Product prod = new Product(name, price, quantity);
        order.addItem(prod, quantity);
        return order.getTotal();
    }
}

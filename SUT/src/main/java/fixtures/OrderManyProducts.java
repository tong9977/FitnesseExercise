package fixtures;

import shop.*;

public class OrderManyProducts {

    private ProductCatalog catalog;
    private Order order;

    public OrderManyProducts() {
        catalog = new ProductCatalog();
        order = new Order();
    }

    public void addProductNameAndPriceAndStockQuantity(String name, double price, int stockQuantity) {
        catalog.addProduct(name, price, stockQuantity);
    }

    public void orderOf(String name, int quantity) {
        Product prod = catalog.getProduct(name);
        order.addItem(prod, quantity);
    }

    public int stockQuantity(String name) {
        Product prod = catalog.getProduct(name);
        return prod.getStockQuantity();
    }

    public double total() {
        return order.getTotal();
    }
}

package products;

import java.util.Objects;

public class Product {

    private String code;
    private String description;
    private double price;

    public Product(String code, String description, float price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public double getVat() {
        return 0.21;
    }

    public double getPrice() {
        return price + getVat();
    }

    public String toString() {
        return "code: " + code + ",description: " + description + ",price: " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(code, product.code) && Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, description, price);
    }
}
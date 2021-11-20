package products.book.shirt.camera;

import products.Product;
import products.book.Book;
import products.book.shirt.Shirt;

import java.util.Objects;

public class Camera extends Product {

    private int pixels;

    public Camera(String code,String description,float price,int pixels){
        super(code,description,price);
        this.pixels = pixels;
    }

    public int getPixels(){
        return pixels;
    }

    public double getVat(){
        return super.getVat();
    }

    public double getPrice(){
        return super.getPrice();
    }

    public String toString(){
        return super.toString() + ",pixels: " + getPixels();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Camera camera = (Camera) o;
        return pixels == camera.pixels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pixels);
    }
}

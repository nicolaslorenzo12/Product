package products.book.shirt;

import products.Product;
import products.book.Book;

import java.util.Objects;

public class Shirt extends Product {

    public String gender;
    public String size;

    public Shirt(String code,String description,float price,String gender,String size){
        super(code,description,price);
        this.gender = gender;
        this.size = size;
    }

    public String getGender(){
        return  gender;
    }

    public String getSize(){
        return  size;
    }

    public double getVat(){
        return super.getVat();
    }

    public double getPrice(){
        return super.getPrice();
    }

    public String toString(){
        return super.toString() + ",gender: " + getGender() + ",size: " + getSize();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Shirt shirt = (Shirt) o;
        return Objects.equals(gender, shirt.gender) && Objects.equals(size, shirt.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), gender, size);
    }
}

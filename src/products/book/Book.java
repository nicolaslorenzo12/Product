package products.book;

import products.Product;

import java.util.Objects;

public class Book extends Product {
    private String title;
    private String author;

    public Book(String code,String description,float price,String title,String author){
        super(code,description,price);
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return  title;
    }

    public String getAuthor(){
        return author;
    }

    public double getVat(){
        return 0.06;
    }

    public double getPrice(){
        return super.getPrice();
    }

    public String toString(){
       return super.toString() + ",title: " + getTitle() + " ,author: " + getAuthor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), title, author);
    }
}

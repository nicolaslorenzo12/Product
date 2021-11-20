package products.test;

import products.Product;
import products.book.Book;
import products.book.shirt.camera.Camera;


public class Test {

    public static void main(String[] args) {
        Product product = new Product("Whatever","life is shit",300);
        System.out.println(product);
        System.out.println(product.getVat());
        Book book = new Book(null,"dfdsfs",200,"aaaa",null);
        Book book1 = new Book(null,"dfdsfs",200,"aaaa",null);
        Book book2 = new Book("other","aaa",300,"lige","Nicolas");
        System.out.println(book.equals(book1));
        System.out.println(book.equals(book2));
        System.out.println(book.hashCode());
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
    }
}

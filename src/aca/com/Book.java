package aca.com;




public class Book extends Author {

    private String name;
    private Author author;
    private double price;
    private int qtyInStock = 0;
    public Book(String name, Author author,Double price) {
        super();
        this.author = author;
        this.name = name;
        this.price = price;

    }

    public Book(String name, Author author, double price, int qtyInStock) {

        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public String toString() {
        return (name + " by " + author + "(" + super.gender + ")at" + super.email);
    }
    public static void main(String[]args){

    }
}


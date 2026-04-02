package se.su.ovning1;
// Book ärver från Item och får name + getName()
// och implementerar VAT6 får 6% moms automatiskt
public class Book extends Item implements PriceableWithVAT6 {

    private double price;
    private boolean bound;
    private String author;

    public Book(String name, String author, double price, boolean bound) {
        super(name); // skickar vidare namnet till Item
        this.price = price;
        this.bound = bound;
        this.author = author;
    }

//    private String getType() {
//        return "Book";
//    }


    public double getPrice() {

        if (!bound) {
            return price;
        }
        return price * 1.3;
    }

    public String toString() {
        return "Book { name='" + getName() +
                "', author='" + author +
                "', bound=" + bound +
                ", price=" + getPrice() +
                ", price+VAT=" + getPriceWithVAT() +
                " }";
    }

}

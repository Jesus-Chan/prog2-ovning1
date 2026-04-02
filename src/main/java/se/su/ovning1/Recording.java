package se.su.ovning1;

abstract public class Recording extends Item implements PriceableWithVAT25 {

    private String name;
    private String artist;
    private int year;
    private int condition; // mellan 0-10
    private double price;

    public Recording(String name, String artist, int year, int condition, double price){
        super(name); // som albin sa, "skickar vidare namnet till Item"
        this.artist = artist;
        this.year = year;
        this.condition = condition;
        this.price = price;
    }

    public abstract String getType();

    public String getName(){
        return name;
    }
    public String getArtist(){
        return artist;
    }
    public int getYear(){
        return year;
    }
    public int getCondition(){
        return condition;
    }
    public double getPrice(){
        double newPrice = price * (condition / 10.0);
        
        if (newPrice < 10)
            newPrice = 10;

        return newPrice;
    }
    public double getOriginalPrice(){
        return price;
    }
}

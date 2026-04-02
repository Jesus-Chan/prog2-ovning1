package se.su.ovning1;

import java.time.Year;

public class LongPlay extends Recording {

    public LongPlay(String name, String artist, int year, int condition, double price) {
        super(name, artist, year, condition, price);
    }

    public String getType() {
        return "LP";
    }

    public double getPrice() {
        double basePrice = super.getPrice();
        int currentYear = Year.now().getValue();
        int age = currentYear - getYear();
        return basePrice + (age * 5);
    }
}

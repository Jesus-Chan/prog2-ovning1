package se.su.ovning1;

import java.util.List;
import java.util.ArrayList;

public class Order {

    private List<Item> items;

    private long orderNumber;

    private static long counter = 0;

    public Order(Item... items) {
        this.items = new ArrayList<>();
        this.orderNumber = ++counter;
        for (Item item : items) {
            this.items.add(item);
        }
    }

    public double getTotalValue() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public double getTotalValuePlusVAT() {
        double totalValuePlusVAT = 0;
        for (Item item : items) {

            totalValuePlusVAT += item.getPriceWithVAT();
        }
        return totalValuePlusVAT;
    }

    public String getReceipt() {

        String receipt = "";

        receipt += "Receipt for order #" + orderNumber + "\n";
        receipt += "-----------\n";

        for (Item item : items) {
            receipt += item + "\n";
        }

        receipt += "Total excl. VAT: " + getTotalValue() + "\n";
        receipt += "Total incl. VAT: " + getTotalValuePlusVAT() + "\n";
        receipt += "-----------";

        return receipt;

    }

}

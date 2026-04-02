package se.su.ovning1;
public interface PriceableWithVAT6 extends Priceable {

    // istället för att varje klass ska göra det själv
    // Book använder denna → får automatiskt 6%
    default double getVAT() {
        return 0.06;
    }

}

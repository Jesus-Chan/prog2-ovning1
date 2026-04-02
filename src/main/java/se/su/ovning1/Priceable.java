package se.su.ovning1;

public interface Priceable {

    // Dem här metoderna ska alla klasser ha,
    // men hur priset räknas beror på typen (Book, CD, LP osv)
    //Priceable = "alla saker som har ett pris"
    public double getPrice();

    public double getVAT();

    // Den här är det viktiga i uppgiften:
    // en default-metod = vi får skriva kod i ett interface
    // alla klasser som implementerar detta får denna automatiskt typ
    default double getPriceWithVAT() {
        return getPrice() * (1 + getVAT());
    }

}

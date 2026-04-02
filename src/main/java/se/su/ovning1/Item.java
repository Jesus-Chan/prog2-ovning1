package se.su.ovning1;

// abstract = vi ska ALDRIG skapa en Item direkt
// bara Book, CD, LP osv
//Item = "alla saker i butiken"
public abstract class Item implements Priceable {

    // protected = subklasser (Book osv) kan använda denna direkt
    private final String name;

    protected Item(String name) {
        this.name = name;
    }

    // enkel getter
    public String getName() {
        return name;
    }
}

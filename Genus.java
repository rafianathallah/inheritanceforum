public class Genus {
    private String g;

    public Genus() {}
    public Genus(String g) {
        this.g = g;
    }

    public String getGenusName() {
        return g;
    }

    @Override
    public String toString() {
        return "Genus name: " + g;
    }
}
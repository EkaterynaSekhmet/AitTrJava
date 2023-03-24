public class Jewelry {
    String type;
    String stone;
    int year;
    int quantity;

    @Override
    public String toString() {
        return "Jewelry{" +
                "type='" + type + '\'' +
                ", stone='" + stone + '\'' +
                ", weight=" + year +
                ", quantity=" + quantity +
                '}';
    }
    public String onStock(int n) {
        return ("На складе имеется " +  n + " украшений");
    }

    public int getYear() {
        return year;
    }
}

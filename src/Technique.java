public class Technique {
    private String brand;
    private double yearOfMade;
    private String color;
    private int price;

    public Technique(String brand, double yearOfMade, String color, int price) {
        this.brand = brand;
        this.yearOfMade = yearOfMade;
        this.color = color;
        this.price = price;
    }

    public String helpToStart() {
        return "";
    }

    public String helpToStop() {
        return "";
    }

    @Override
    public String toString() {
        return "Technique: " + "brand: " + brand + "yearOfMade: " + yearOfMade +
                "color: " + color + "price: " + price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getYearOfMade() {
        return yearOfMade;
    }

    public void setYearOfMade(double yearOfMade) {
        this.yearOfMade = yearOfMade;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

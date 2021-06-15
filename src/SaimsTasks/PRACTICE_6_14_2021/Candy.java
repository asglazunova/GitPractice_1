package SaimsTasks.PRACTICE_6_14_2021;

public class Candy {
    private String brand;
    private int quantity;
    private boolean containsPeanuts;
    private static int totalNumOfCandies;// purpose -> know how many total Candy objects were made


    public Candy(String brand, int quantity, boolean containsPeanuts) {
        this.brand = brand;
        setQuantity(quantity);
        this.containsPeanuts = containsPeanuts;
        totalNumOfCandies++;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }
    public boolean isContainsPeanuts() {
        return containsPeanuts;
    }

    public void setContainsPeanuts(boolean containsPeanuts) {
        this.containsPeanuts = containsPeanuts;
    }

    public static int getTotalNumOfCandies() {
        return totalNumOfCandies;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", containsPeanuts=" + containsPeanuts +
                '}';
    }
}

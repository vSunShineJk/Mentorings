package metoring.otabek;

public class Car {
    String brand;
    String model;
    String color;
    int year;
    double price;

    public Car(String brand,String model, String color, int year, double price){
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.year=year;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}

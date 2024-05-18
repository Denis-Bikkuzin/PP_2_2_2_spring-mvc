package web.model;

public class Car {

    private String model;
    private int price;
    private int id;

    public Car(String model, int price, int id) {
        this.model = model;
        this.price = price;
        this.id = id;
    }

    public String model() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public int price() {
        return price;
    }

    public Car setPrice(int price) {
        this.price = price;
        return this;
    }

    public int id() {
        return id;
    }

    public Car setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}

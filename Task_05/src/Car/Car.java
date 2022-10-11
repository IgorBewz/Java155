package Car;

abstract public class Car {
    private final String model;
    private String color = "unknown";

    private int wheelsQuantity;

    public Car (String model) {
        this.model = model;
    }

    public Car (String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car (String model, String color, int wheelsQuantity) {
        this.model = model;
        this.color = color;
        this.wheelsQuantity = wheelsQuantity;
    }

    //Abstract method
    abstract public String info();

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //FINAL method
    public final int getWheelsQuantity() {
        return this.wheelsQuantity;
    }
}

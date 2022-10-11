package Car.TypeByCarrying;

import Car.Car;

public class FreightCar extends Car{

    public FreightCar(String model) {
        super(model);
    }

    public FreightCar(String model, String color) {
        super(model, color);
    }

    public FreightCar (String model, String color, int wheelsQuantity) {
        super(model, color, wheelsQuantity);

    }

    public void info() {
        System.out.println("This is a freight car. Model is " + super.getModel() + ". Color is " + super.getColor()
        + ". And wheels quantity is " + super.getWheelsQuantity());
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }
}

package Car.TypeByCarrying;

import Car.Car;

public class PassengerCar extends Car {

    public PassengerCar(String model) {
        super(model);
    }

    public PassengerCar(String model, String color) {
        super(model, color);
    }

    @Override
    public void info() {
        System.out.println("This is a passenger car. Model is " + super.getModel() + " and color is " + super.getColor());
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

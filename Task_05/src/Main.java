import Car.TypeByCarrying.FreightCar;
import Car.TypeByCarrying.PassengerCar;

public class Main {
    public static void main(String[] args) {
        PassengerCar car1 = new PassengerCar( "Mercedes");
        PassengerCar car2 = new PassengerCar("BMW", "black");
        car1.setColor("red");
        car1.info();
        System.out.println("Color of car " + car2.getModel() + " is " + car2.getColor());
        FreightCar car3 = new FreightCar("Ford F-150", "blue", 4);
        car3.info();
        System.out.println("Wheels quantity of " + car3.getModel() + " is " + car3.getWheelsQuantity());
    }
}
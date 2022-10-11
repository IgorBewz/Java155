import Car.TypeByCarrying.FreightCar;
import Car.TypeByCarrying.PassengerCar;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PassengerCar car1 = new PassengerCar("Mercedes");
        PassengerCar car2 = new PassengerCar("BMW", "black");
        car1.setColor("red");
        car1.info();
        System.out.println("Color of car " + car2.getModel() + " is " + car2.getColor());
        FreightCar car3 = new FreightCar("Ford F-150", "blue", 4);
        car3.info();
        System.out.println("Wheels quantity of " + car3.getModel() + " is " + car3.getWheelsQuantity());

        //This homework
        car2.takeOutInsurance("InsComp", 1000);
        if (car2.isInsurance()) {
            car2.GetInsuranceInfo();
        }
        car2.setCargo(500);
        car2.setPassengers(4);
        car2.StartEngine();

        car3.takeOutInsurance("CoI", 800);
        if (car3.isInsurance()) {
            car3.GetInsuranceInfo();
        }
        car3.setCargo(500);
        car3.setPassengers(4);
        car3.StartEngine();

        PassengerCar[] cars = {
                new PassengerCar("Volvo", "Gray"),
                new PassengerCar("Toyota", "Gray"),
                new PassengerCar("Toyota", "Blue"),
        };

        System.out.println("---Array before sorting---");
        for (PassengerCar passengerCar : cars) {
            System.out.println(passengerCar.toString());
        }
        System.out.println("--------------------------");
        Arrays.sort(cars);
        System.out.println("---Array after sorting----");
        for (PassengerCar passengerCar : cars) {
            System.out.println(passengerCar.toString());
        }
        System.out.println("--------------------------");
        //------------
        PassengerCar copyOfCar2 = null;
        try {
            copyOfCar2 = car2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("---Object clone---");
        System.out.println("ORIGINAL: " + car2.info());
        System.out.println("COPY: " + copyOfCar2.info());
        System.out.println("------------------");
    }
}
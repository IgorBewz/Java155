package Car.TypeByCarrying;

import Car.Car;
import Interfaces.Behavior;
import Interfaces.Insurance;

public class PassengerCar extends Car implements Insurance, Behavior, Comparable<PassengerCar>, Cloneable {

//---Insurance interface variables---------
    private boolean insuranceAvailable;
    private String insuranceCompany;
    private int insuranceCost;
//-----------------------------------------

//---Behavior interface variables----------
    private int cargoWeight;
    private int passengersQuantity;
//-----------------------------------------

    public PassengerCar(String model) {
        super(model);
    }

    public PassengerCar(String model, String color) {
        super(model, color);
    }

    @Override
    public String info() {
        return "This is a passenger car. Model is " + super.getModel() + " and color is " + super.getColor();
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

    //INSURANCE INTERFACE IMPLEMENTATION
    @Override
    public boolean isInsurance(){
        return this.insuranceAvailable;
    }
    @Override
    public void takeOutInsurance(String insuranceCompany, int insuranceCost){
        this.insuranceCompany = insuranceCompany;
        this.insuranceCost = insuranceCost;
        this.insuranceAvailable = true;
    }

    @Override
    public void GetInsuranceInfo(){
        System.out.println("INSURANCE INFO:\nCompany: " + this.insuranceCompany + " \nCost: " + this.insuranceCost);
    }

    //BEHAVIOR INTERFACE IMPLEMENTATION

    @Override
    public void setCargo(int cargoWeight) {
        if(cargoWeight < 300){
            this.cargoWeight = cargoWeight;
        }else {
            System.out.println("Passenger car can't carry more than 300 kg");
        }
    }

    @Override
    public int getCargo() {
        return this.cargoWeight;
    }

    @Override
    public void setPassengers(int passengersQuantity){
        this.passengersQuantity = passengersQuantity;
    }

    @Override
    public int getPassengers() {
        return this.passengersQuantity;
    }

    @Override
    public void StartEngine() {
        System.out.println("Wroom...");
    }

    @Override
    public int compareTo(PassengerCar passengerCar) {
        if(this.getModel().compareTo(passengerCar.getModel()) != 0) {
            return this.getModel().compareTo(passengerCar.getModel());
        } else {
            return this.getColor().compareTo(passengerCar.getColor());
        }
    }

    @Override
    public String toString() {
        return "Model: " + this.getModel() + "\tColor:" + this.getColor();
    }

    @Override
    public PassengerCar clone() throws CloneNotSupportedException {
        return (PassengerCar) super.clone();
    }
}

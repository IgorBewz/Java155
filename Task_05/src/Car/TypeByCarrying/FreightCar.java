package Car.TypeByCarrying;

import Car.Car;
import Interfaces.Behavior;
import Interfaces.Insurance;

public class FreightCar extends Car implements Insurance, Behavior, Comparable<FreightCar> {
//---Insurance interface variables---------
    private boolean insuranceAvailable;
    private String insuranceCompany;
    private int insuranceCost;
//-----------------------------------------

//---Behavior interface variables----------
    private int cargoWeight;
    private int passengersQuantity;
//-----------------------------------------

    public FreightCar(String model) {
        super(model);
    }

    public FreightCar(String model, String color) {
        super(model, color);
    }

    public FreightCar (String model, String color, int wheelsQuantity) {
        super(model, color, wheelsQuantity);

    }

    public String info() {
        return "This is a freight car. Model is " + super.getModel() + ". Color is " + super.getColor()
        + ". And wheels quantity is " + super.getWheelsQuantity();
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
        this.cargoWeight = cargoWeight;
    }

    @Override
    public int getCargo() {
        return this.cargoWeight;
    }
    @Override
    public void setPassengers(int passengersQuantity){
        if(passengersQuantity > 2) {
            System.out.println("Freight car can't carry more than 2 passengers");
        } else {
            this.passengersQuantity = passengersQuantity;
        }
    }

    @Override
    public int getPassengers() {
        return this.passengersQuantity;
    }
    @Override
    public void StartEngine() {
        System.out.println("Drr-drr-drr...");
    }

    @Override
    public int compareTo(FreightCar freightCar) {
        if(this.getModel().compareTo(freightCar.getModel()) != 0) {
            return this.getModel().compareTo(freightCar.getModel());
        } else {
            return this.getColor().compareTo(freightCar.getColor());
        }
    }
}

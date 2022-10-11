package Interfaces;

public interface Insurance {
    void GetInsuranceInfo();

    boolean isInsurance();

    void takeOutInsurance(String insuranceCompany, int insuranceCost);
}

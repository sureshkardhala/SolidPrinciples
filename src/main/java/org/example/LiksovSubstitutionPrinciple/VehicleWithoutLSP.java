package org.example.LiksovSubstitutionPrinciple;

public interface VehicleWithoutLSP {
    public default Integer noofWheels(){
        return 2;
    }
    public default Boolean hasEngine(){
        return true;
    }
}

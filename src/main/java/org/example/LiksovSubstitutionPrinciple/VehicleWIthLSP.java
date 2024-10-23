package org.example.LiksovSubstitutionPrinciple;

public interface VehicleWIthLSP {
    public default Integer noofWheels(){
        return 2;
    }
}

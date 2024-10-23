package org.example.LiksovSubstitutionPrinciple;

import java.util.ArrayList;
import java.util.List;

/*
    If classB is subclass of A. The object of A can substituted by B.
    Without changing behaviour of class A.

    All subclasses / derived classes should substitute the parent.

    Eg : We have interface vehicle, with methods hasEnginee(), no.ofWheels().
    So Bike, Car classes are implementing.
    if we implement it with bicycle raises null exception if we access any member in it.

    Solution : we create new interface for engineedveichle, engineelessveichle.
    And vehicle interface has only one no.ofwheels().
*/
public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        List<VehicleWithoutLSP> list = new ArrayList<>();
        list.add(new BicycleWithoutLSP());
        list.add(new CarWithoutLSP());
        list.add(new BikeWithoutLSP());

        for (VehicleWithoutLSP vehicleWithoutLSP:list){
            System.out.println(vehicleWithoutLSP.hasEngine());
        }
    }
}

package org.example.InterfaceSegmentedPrinciple;

public class WaiterWithoutISP implements Restaurent{
    @Override
    public void cookFood() {

    }

    @Override
    public void serveFood() {
        System.out.println("Waiter Serving Food by implementing restaurant interface");
    }

    @Override
    public void takeOrder() {
        System.out.println("Waiter taking order by implementing restaurant interface");
    }

    @Override
    public void cleanDishes() {

    }
}

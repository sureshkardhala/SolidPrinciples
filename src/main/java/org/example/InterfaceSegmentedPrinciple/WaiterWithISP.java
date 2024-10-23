package org.example.InterfaceSegmentedPrinciple;

public class WaiterWithISP implements Waiter{
    @Override
    public void serveFood() {
        System.out.println("Waiter Serving Food by implementing waiter interface");
    }

    @Override
    public void takeOrder() {
        System.out.println("Waiter taken order by implementing waiter interface");
    }
}

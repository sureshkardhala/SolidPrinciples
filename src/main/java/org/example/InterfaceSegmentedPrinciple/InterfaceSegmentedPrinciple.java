package org.example.InterfaceSegmentedPrinciple;

/*

       Interface Segmented Principle defines that interface should be such
       that client should not implement unnecessary methods

       Eg: Restaurant interface have cook(), serve(), takeorder(), washdishes(),
       but waiter responsible for only serve(), takeorder() no need of washdishes(), cook()

       solution : create other waiter interface have only takeorder(), serve()

*/

public class InterfaceSegmentedPrinciple {
    public static void main(String[] args) {
        Restaurent restaurent = new WaiterWithoutISP();
        restaurent.serveFood();
        System.out.println();
        restaurent.cookFood();

        Waiter waiter = new WaiterWithISP();
        System.out.println();
        waiter.serveFood();
        System.out.println();
        waiter.takeOrder();
    }
}

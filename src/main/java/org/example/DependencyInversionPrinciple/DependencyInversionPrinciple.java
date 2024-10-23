package org.example.DependencyInversionPrinciple;

/*
          Class should depend on the interface not on its concrete classes

          Eg : Laptop using wireless keyboard concrete class  instead of keyboard interface.
 */
public class DependencyInversionPrinciple {
    public static void main(String[] args) {
        WirelessKeyboard wirelessKeyboard = new WirelessKeyboard();
        LaptopWithOutDIP laptopWithOutDIP = new LaptopWithOutDIP("Lenovo", wirelessKeyboard);
        laptopWithOutDIP.details();
        System.out.println();

        Keyboard keyboard = new WiredKeyboard();
        LaptopWithDIP laptop = new LaptopWithDIP("Dell", keyboard);
        laptop.details();

    }
}

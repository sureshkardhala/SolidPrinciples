package org.example.DependencyInversionPrinciple;

public class LaptopWithDIP {
    private final String name;
    private final Keyboard keyboard;

    public LaptopWithDIP(String name, Keyboard keyboard) {
        this.name = name;
        this.keyboard = keyboard;
    }

    public void details(){
        String keyboardType = "";
        if(keyboard.hasWire()){
            keyboardType+="Wired";
        }else{
            keyboardType+="Bluetooth";
        }
        System.out.println("Laptop \n" + "Name : " + this.name + "\n  Keyboard Type : "+keyboardType);
    }
}

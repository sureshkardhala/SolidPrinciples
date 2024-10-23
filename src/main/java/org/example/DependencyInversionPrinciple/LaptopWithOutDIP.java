package org.example.DependencyInversionPrinciple;

public class LaptopWithOutDIP {
    private final String name;
    private final WirelessKeyboard wirelessKeyboard;

    public LaptopWithOutDIP(String name, WirelessKeyboard wirelessKeyboard) {
        this.name = name;
        this.wirelessKeyboard = wirelessKeyboard;
    }

    public void details(){
        String keyboardType = "";
        if(wirelessKeyboard.hasWire()){
            keyboardType+="Wired";
        }else{
            keyboardType+="Bluetooth";
        }
        System.out.println("Laptop \n" + "Name : " + this.name + "\n  Keyboard : "+keyboardType);
    }
}

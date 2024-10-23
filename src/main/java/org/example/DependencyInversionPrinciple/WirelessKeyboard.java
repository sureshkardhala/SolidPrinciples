package org.example.DependencyInversionPrinciple;

public class WirelessKeyboard implements Keyboard{
    @Override
    public Boolean hasWire() {
        return false;
    }
}

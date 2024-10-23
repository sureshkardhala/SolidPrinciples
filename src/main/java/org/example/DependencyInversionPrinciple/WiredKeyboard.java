package org.example.DependencyInversionPrinciple;

public class WiredKeyboard implements Keyboard{
    @Override
    public Boolean hasWire() {
        return true;
    }
}

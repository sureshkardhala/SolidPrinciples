package org.example.SingleResponsibilityPrinciple;

public class InvoiceWithSRP {
    private Marker marker;
    private int quantity;

    public InvoiceWithSRP(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Marker getMarker() {
        return marker;
    }

    public void setMarker(Marker marker) {
        this.marker = marker;
    }

    public int calculatePrice(){
        return marker.getPrice()* this.quantity;
    }
}

package org.example.SingleResponsibilityPrinciple;

public class InvoiceWithoutSRP {
    private Marker marker;
    private int quanity;

    public InvoiceWithoutSRP(Marker marker, int quanity){
        this.marker = marker;
        this.quanity = quanity;
    }

    public int calculatePrice(){
        return marker.getPrice()*this.quanity;
    }

    public void saveDB(){
        String res = "Invoice save into Database.";
        res+="\n Marker Company : " + marker.getName();
        res+="\n Year :  " + marker.getYear();
        res+="\n Color : " + marker.getColor();
        res+="\n Price:  " + marker.getPrice();
        res+="\n Quantity:  " + this.quanity;
        res+="\n Total Price:  " + calculatePrice();
        System.out.println(res);
    }

    public Marker getMarker() {
        return marker;
    }

    public void setMarker(Marker marker) {
        this.marker = marker;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public  void downloadInvoice(){
        String res = "Download Invoice";
        res+="\n Marker Company : " + marker.getName();
        res+="\n Year :  " + marker.getYear();
        res+="\n Color : " + marker.getColor();
        res+="\n Price:  " + marker.getPrice();
        res+="\n Quantity:  " + this.quanity;
        res+="\n Total Price:  " + calculatePrice();
        System.out.println(res);
    }
}

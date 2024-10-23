package org.example.SingleResponsibilityPrinciple;

//Responsible for Database Operations
public class InvoiceDAOWithSRP {
    private final InvoiceWithSRP invoice;

    public InvoiceDAOWithSRP(InvoiceWithSRP invoice) {
        this.invoice = invoice;
    }

    public void saveDB(){
        String res = "Invoice save into Database.";
        res+="\n Marker Company : " + invoice.getMarker().getName();
        res+="\n Year :  " + invoice.getMarker().getYear();
        res+="\n Color : " + invoice.getMarker().getColor();
        res+="\n Price:  " + invoice.getMarker().getPrice();
        res+="\n Quantity:  " + invoice.getQuantity();
        res+="\n Total Price:  " + invoice.calculatePrice();
        System.out.println(res);
    }
}

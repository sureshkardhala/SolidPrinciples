package org.example.SingleResponsibilityPrinciple;

//Responsible for file handling operations
public class InvoiceFileWithSRP {
    private final InvoiceWithSRP invoice;

    public InvoiceFileWithSRP(InvoiceWithSRP invoice) {
        this.invoice = invoice;
    }

    public  void downloadInvoice(){
        String res = "Download Invoice";
        res+="\n Marker Company : " + invoice.getMarker().getName();
        res+="\n Year :  " + invoice.getMarker().getYear();
        res+="\n Color : " + invoice.getMarker().getColor();
        res+="\n Price:  " + invoice.getMarker().getPrice();
        res+="\n Quantity:  " + invoice.getQuantity();
        res+="\n Total Price:  " + invoice.calculatePrice();
        System.out.println(res);
    }
}

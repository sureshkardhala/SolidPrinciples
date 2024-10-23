package org.example.OpenorClosePrinciple;

public class SaveInvoiceIntoDBWithOC implements Invoice{
    @Override
    public void saveInvoiceIntoDB(){
        System.out.println("Invoice saved into database successfully.");
    }

    @Override
    public void downloadInvoice() {

    }
}

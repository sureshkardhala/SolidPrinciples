package org.example.OpenorClosePrinciple;

public class FileDownloadWithOC implements Invoice{
    @Override
    public void saveInvoiceIntoDB() {

    }

    @Override
    public void downloadInvoice(){
        System.out.println("Invoice downloaded successfully");
    }
}

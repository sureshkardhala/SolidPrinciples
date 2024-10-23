package org.example.OpenorClosePrinciple;

public class InvoiceWithoutOC {
    //Old feature
    public void saveInvoiceIntoDB(){
        System.out.println("Data saved into database successfully");
    }

    //new feature
    public void downloadInvoiceFile(){
        System.out.println("Invoice downloaded successfully!");
    }
}

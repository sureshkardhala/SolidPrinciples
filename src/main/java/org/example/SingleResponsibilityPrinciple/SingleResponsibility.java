package org.example.SingleResponsibilityPrinciple;

/*
   Singleton responsibility principle is defined as "class should have one and only reason to change".
   Which means class has to serve one kind of responsibility. It not implies class should have one method.
   It can have multiple methods, but it should serve one responsibility.

   Eg : If you look at InvoiceWithOutSRP class it have three methods
        calculatePrice() - calculate price.
        saveDB() - invoice save into database.
        downloadFile() - download invoice in document format.

        if we clearly observe these methods these are serving three different functionalities
        one is calculated price
        second is to save invoice into database
        third is download invoice

        So we divide three methods into three different classes.
        InvoiceDAOWithSRP - Responsible for data abstraction to handle db operations.
        InvoiceWithSRP - Responsible for calculating price and have all invoice details.
        InvoiceFileWithSRP - Responsible for all file downloading, uploading kind of operations
        Then three classes should follow to serve only one responsibility.
*/

public class SingleResponsibility {
    public static void main(String[] args) {
        //Invoice & Marker instantation for not following Single Responsibility Principle

//        Marker marker = new Marker("Red", "Camel", 2004, 20);
//        InvoiceWithoutSRP invoice1 = new InvoiceWithoutSRP(marker, 2);
//        invoice1.downloadInvoice();
//        System.out.println();
//        invoice1.saveDB();

        Marker marker1 = new Marker("Red", "Camel", 2004, 20);
        InvoiceWithSRP invoice2 = new InvoiceWithSRP(marker1, 2);
        InvoiceFileWithSRP downloadInvoice = new InvoiceFileWithSRP(invoice2);
        downloadInvoice.downloadInvoice();
        System.out.println();
        InvoiceDAOWithSRP saveInvoiceToDB = new InvoiceDAOWithSRP(invoice2);
        saveInvoiceToDB.saveDB();
    }
}

import com.example.abst.DocumentProcessor;
import com.example.conc.Document;
import com.example.conc.InvoiceProcessor;
import com.example.conc.PurchaseOrderProcessor;

public class Main {
    public static void main(String[] args) {
        DocumentProcessor invoiceProcessor = new InvoiceProcessor();
        DocumentProcessor purchaseOrderProcessor = new PurchaseOrderProcessor();
        invoiceProcessor.setNextProcessor(purchaseOrderProcessor);

        Document invoice = new Document("Invoice");
        Document purchaseOrder = new Document("PurchaseOrder");
        Document unknownDocument = new Document("UnknownDocument");

        invoiceProcessor.processDocument(invoice);
        invoiceProcessor.processDocument(purchaseOrder);
        invoiceProcessor.processDocument(unknownDocument);


    }
}
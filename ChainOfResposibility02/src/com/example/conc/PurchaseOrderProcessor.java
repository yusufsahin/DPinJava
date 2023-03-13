package com.example.conc;

import com.example.abst.DocumentProcessor;

public class PurchaseOrderProcessor implements DocumentProcessor {
    private  DocumentProcessor nextProcessor;

    @Override
    public void processDocument(Document document) {
        if (document.getType().equals("PurchaseOrder")) {
            System.out.println("Processing purchase order...");
        } else if (nextProcessor != null) {
            nextProcessor.processDocument(document);
        } else {
            System.out.println("Unknown document type: " + document.getType());
        }

    }

    @Override
    public void setNextProcessor(DocumentProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }
}

package com.example.conc;

import com.example.abst.DocumentProcessor;

public class InvoiceProcessor implements DocumentProcessor {
    private  DocumentProcessor nextProcessor;


    @Override
    public void processDocument(Document document) {
        if (document.getType().equals("Invoice")) {
            System.out.println("Processing invoice...");
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

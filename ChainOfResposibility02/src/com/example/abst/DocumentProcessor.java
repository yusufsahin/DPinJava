package com.example.abst;

import com.example.conc.Document;

public interface DocumentProcessor {
    void processDocument(Document document);
    void setNextProcessor(DocumentProcessor nextProcessor);

}

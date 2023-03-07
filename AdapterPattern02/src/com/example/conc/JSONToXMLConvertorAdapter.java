package com.example.conc;

import com.example.abst.XMLConverter;

public class JSONToXMLConvertorAdapter implements XMLConverter {

    private JSONConvertor jsonConvertor;

    public JSONToXMLConvertorAdapter(JSONConvertor jsonConvertor) {
        this.jsonConvertor = jsonConvertor;
    }

    @Override
    public void convertToXML(Object object) {
        String json= jsonConvertor.convertToJSON(object);
        System.out.println("<name>" + object.toString() + "</name>");

    }
}

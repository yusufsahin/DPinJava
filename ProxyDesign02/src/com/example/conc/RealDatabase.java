package com.example.conc;

import com.example.abst.Database;
import sun.lwawt.macosx.CSystemTray;

import java.util.Map;

public class RealDatabase implements Database {
    private String connection;

    public RealDatabase(String connection) {
        this.connection = connection;
    }

    @Override
    public void insert(String table, Map<String, String> values) {
        System.out.println("Kaydedilme");
    }

    @Override
    public void update(String table, Map<String, String> values, String whereClause) {
        System.out.println("Güncelleme");
    }

    @Override
    public void delete(String table, String whereClause) {
        System.out.println("Silme");
    }
}

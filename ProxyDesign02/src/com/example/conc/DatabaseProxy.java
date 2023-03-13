package com.example.conc;

import com.example.abst.Database;
import sun.lwawt.macosx.CSystemTray;

import java.util.Map;

public class DatabaseProxy implements Database {
    private RealDatabase realDatabase;

    public DatabaseProxy() {
        this.realDatabase=new RealDatabase("testdb");
    }

    public DatabaseProxy(RealDatabase realDatabase) {
        this.realDatabase = realDatabase;
    }

    @Override
    public void insert(String table, Map<String, String> values) {
        realDatabase.insert(table,values);
        System.out.println("Proxy insert");
    }

    @Override
    public void update(String table, Map<String, String> values, String whereClause) {
        realDatabase.update(table,values,whereClause);
        System.out.println("Proxy update");
    }

    @Override
    public void delete(String table, String whereClause) {
        realDatabase.delete(table,whereClause);
        System.out.println("Proxy delete");
    }
}

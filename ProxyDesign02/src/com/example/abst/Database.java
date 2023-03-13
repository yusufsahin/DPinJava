package com.example.abst;

import java.util.Map;

public interface Database {
    void insert(String table, Map<String,String> values);
    void update(String table, Map<String, String> values, String whereClause);
    void delete(String table, String whereClause);

}

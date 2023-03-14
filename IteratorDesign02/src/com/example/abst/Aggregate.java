package com.example.abst;

public interface Aggregate<T>{
    Iterator<T> createIterator();
}

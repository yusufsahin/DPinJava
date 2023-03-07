package com.example.abst;

public interface MessageBuilder<T> {
    MessageBuilder<T> from(String sender);
    MessageBuilder<T> to(String[] recipients);
    MessageBuilder<T> subject(String subject);
    MessageBuilder<T> body(String body);
    T build();
}

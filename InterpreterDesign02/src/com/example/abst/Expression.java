package com.example.abst;

import com.example.conc.Report;
import com.example.conc.User;

public interface Expression {
    boolean interpret(User user, Report report);
}
